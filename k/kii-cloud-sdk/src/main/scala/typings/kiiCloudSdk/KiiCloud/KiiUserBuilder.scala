package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiUser builder
  */
trait KiiUserBuilder extends StObject {
  
  /**
    * Build KiiUser object.
    *
    * <br><br> Build KiiUser object. This method verify set values.
    *
    * @return a working KiiUser object.
    */
  def build(): KiiUser
  
  /**
    * Set email address.
    *
    * <br><br>Set email address. If null or undefined is passed. It is
    * ignored. Previous email address is remained.
    *
    * @param emailAddress email address.
    *
    * @return this builder object.
    *
    * @throws If the email address is not in the
    *     proper format
    */
  def setEmailAddress(emailAddress: String): KiiUserBuilder
  
  /**
    * Set global phone number.
    *
    * <br><br>Set global phone number. If null or undefined is
    * passed. It is ignored. Previous phone number is remained.
    *
    * @param phoneNumber global phone number.
    *
    * @return this builder object.
    *
    * @throws If the phone number is not
    *     in the proper format
    */
  def setGlobalPhoneNumber(phoneNumber: String): KiiUserBuilder
  
  /**
    * Set local phone number.
    *
    * <br><br>Set local phone number. If null or undefined is
    * passed. It is ignored. Previous phone number is remained.
    *
    * @param phoneNumber local phone number.
    * @param country country code
    *
    * @return this builder object.
    *
    * @throws If the phone number is not
    *     in the proper format
    * @throws If the country code is not a valid format
    */
  def setLocalPhoneNumber(phoneNumber: String, country: String): KiiUserBuilder
  
  /**
    * Set user name.
    *
    * <br><br>Set user name. If null or undefined is passed. It is
    * ignored. Previous user name is remained.
    *
    * @param username user name.
    *
    * @return this builder object.
    *
    * @throws If the username is not in the
    *     proper format
    */
  def setUsername(username: String): KiiUserBuilder
}
object KiiUserBuilder {
  
  inline def apply(
    build: () => KiiUser,
    setEmailAddress: String => KiiUserBuilder,
    setGlobalPhoneNumber: String => KiiUserBuilder,
    setLocalPhoneNumber: (String, String) => KiiUserBuilder,
    setUsername: String => KiiUserBuilder
  ): KiiUserBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setEmailAddress = js.Any.fromFunction1(setEmailAddress), setGlobalPhoneNumber = js.Any.fromFunction1(setGlobalPhoneNumber), setLocalPhoneNumber = js.Any.fromFunction2(setLocalPhoneNumber), setUsername = js.Any.fromFunction1(setUsername))
    __obj.asInstanceOf[KiiUserBuilder]
  }
  
  extension [Self <: KiiUserBuilder](x: Self) {
    
    inline def setBuild(value: () => KiiUser): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetEmailAddress(value: String => KiiUserBuilder): Self = StObject.set(x, "setEmailAddress", js.Any.fromFunction1(value))
    
    inline def setSetGlobalPhoneNumber(value: String => KiiUserBuilder): Self = StObject.set(x, "setGlobalPhoneNumber", js.Any.fromFunction1(value))
    
    inline def setSetLocalPhoneNumber(value: (String, String) => KiiUserBuilder): Self = StObject.set(x, "setLocalPhoneNumber", js.Any.fromFunction2(value))
    
    inline def setSetUsername(value: String => KiiUserBuilder): Self = StObject.set(x, "setUsername", js.Any.fromFunction1(value))
  }
}
