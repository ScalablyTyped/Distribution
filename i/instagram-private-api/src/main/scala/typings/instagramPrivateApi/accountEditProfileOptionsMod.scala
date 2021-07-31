package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountEditProfileOptionsMod {
  
  trait AccountEditProfileOptions extends StObject {
    
    var biography: String
    
    var email: String
    
    var external_url: String
    
    var first_name: String
    
    var gender: String
    
    var phone_number: String
    
    var username: String
  }
  object AccountEditProfileOptions {
    
    @scala.inline
    def apply(
      biography: String,
      email: String,
      external_url: String,
      first_name: String,
      gender: String,
      phone_number: String,
      username: String
    ): AccountEditProfileOptions = {
      val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountEditProfileOptions]
    }
    
    @scala.inline
    implicit class AccountEditProfileOptionsMutableBuilder[Self <: AccountEditProfileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
