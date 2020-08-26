package typings.kiiCloudSdk.global.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiUser builder
  */
@JSGlobal("KiiCloud.KiiUserBuilder")
@js.native
class KiiUserBuilder ()
  extends typings.kiiCloudSdk.KiiCloud.KiiUserBuilder

/* static members */
@JSGlobal("KiiCloud.KiiUserBuilder")
@js.native
object KiiUserBuilder extends js.Object {
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
  def builderWithEmailAddress(emailAddress: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
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
  def builderWithGlobalPhoneNumber(phoneNumber: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
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
  def builderWithIdentifier(identifier: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
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
  def builderWithLocalPhoneNumber(phoneNumber: String, country: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
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
  def builderWithUsername(username: String, password: String): typings.kiiCloudSdk.KiiCloud.KiiUserBuilder = js.native
}

