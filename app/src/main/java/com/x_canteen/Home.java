package com.x_canteen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView accountBtn;
    ImageButton addFoodBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        accountBtn = findViewById(R.id.accountBtn);
        addFoodBtn =  findViewById(R.id.add_foodBtn);



        accountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,CreateAccount.class);
                startActivity(intent);
            }
        });


        //here is the btn of

        addFoodBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,AddFood.class);
                startActivity(intent);
            }
        });

    }
}