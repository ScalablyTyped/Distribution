package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiUser builder
  */
@JSGlobal("KiiCloud.KiiUserBuilder")
@js.native
open class KiiUserBuilder ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiUserBuilder {
  
  /**
    * Build KiiUser object.
    *
    * <br><br> Build KiiUser object. This method verify set values.
    *
    * @return a working KiiUser object.
    */
  /* CompleteClass */
  override def build(): typings.kiiCloudSdk.KiiCloud.KiiUser = js.native
  
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
  /* CompleteClass */
  override def setEmailAddress(emailAddress: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
  
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
  /* CompleteClass */
  override def setGlobalPhoneNumber(phoneNumber: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
  
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
  /* CompleteClass */
  override def setLocalPhoneNumber(phoneNumber: String, country: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
  
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
  /* CompleteClass */
  override def setUsername(username: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
}
object KiiUserBuilder {
  
  @JSGlobal("KiiCloud.KiiUserBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create KiiUser builder with email address
    *
    * <br><br>Create a KiiUser builder with email address.
    *
    * @param emailAddress email address.
    * @param password for the user. Must be string. Must not be null or
    *   undefined.
    *
    * @return KiiUser object builder.
    *
    * @throws If the email address is not in the proper format
    * @throws If the password is not in the
    *     proper format
    */
  /* static member */
  inline def builderWithEmailAddress(emailAddress: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("builderWithEmailAddress")(emailAddress.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUserBuilder]
  
  /**
    * Create KiiUser builder with global phone number
    *
    * <br><br>Create a KiiUser builder with global phone number.
    *
    * @param phoneNumber global phone number.
    *
    * @return KiiUser object builder.
    *
    * @throws If the phone number is not in the proper format
    */
  /* static member */
  inline def builderWithGlobalPhoneNumber(phoneNumber: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("builderWithGlobalPhoneNumber")(phoneNumber.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUserBuilder]
  
  /**
    * Create a KiiUser builder with identifier.
    *
    * <br><br>Create a KiiUser builder. This constructor is received
    * identifier. The identifier is one of user name, email address or
    * phone number. This constructor automatically identity What is
    * identifier and build proper KiiUser object on build method.
    *
    * <br><br> Some strings can be accepted as both user name and phone
    * number. If such string is passed to this constructor as
    * identifier, then phone number is prior to user name. String of
    * email address is in different class against user name and phone
    * number. So Email address is always identified correctly.
    *
    * @param identifier The user's user name, email address or phone
    *   number. Must be string. Must not be null or undefined.
    * @param password for the user. Must be string. Must not be null or
    *   undefined.
    *
    * @return KiiUser object builder.
    *
    * @throws If Identifier is not user name,
    *     email address or phone number.
    * @throws If the password is not in the
    *     proper format
    */
  /* static member */
  inline def builderWithIdentifier(identifier: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("builderWithIdentifier")(identifier.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUserBuilder]
  
  /**
    * Create KiiUser builder with local phone number
    *
    * <br><br>Create a KiiUser builder with local phone number.
    *
    * @param phoneNumber local phone number.
    * @param country country code
    * @param password for the user. Must be string. Must not be null or
    *   undefined.
    *
    * @return KiiUser object builder.
    *
    * @throws If the phone number is not in the proper format
    * @throws If the country code is not a valid format
    * @throws If the password is not in the
    *     proper format
    */
  /* static member */
  inline def builderWithLocalPhoneNumber(phoneNumber: String, country: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("builderWithLocalPhoneNumber")(phoneNumber.asInstanceOf[js.Any], country.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUserBuilder]
  
  /**
    * Create KiiUser builder with user name
    *
    * <br><br>Create a KiiUser builder with user name.
    *
    * @param username user name.
    * @param password for the user. Must be string. Must not be null or
    *   undefined.
    *
    * @return KiiUser object builder.
    *
    * @throws If the username is not in the proper format
    * @throws If the password is not in the
    *     proper format
    */
  /* static member */
  inline def builderWithUsername(username: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("builderWithUsername")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiUserBuilder]
}
