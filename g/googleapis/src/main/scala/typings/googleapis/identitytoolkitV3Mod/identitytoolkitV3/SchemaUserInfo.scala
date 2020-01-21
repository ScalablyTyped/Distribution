package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.AnonDisplayNameEmailFederatedId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for an individual account info.
  */
@js.native
trait SchemaUserInfo extends js.Object {
  /**
    * User creation timestamp.
    */
  var createdAt: js.UndefOr[String] = js.native
  /**
    * The custom attributes to be set in the user&#39;s id token.
    */
  var customAttributes: js.UndefOr[String] = js.native
  /**
    * Whether the user is authenticated by the developer.
    */
  var customAuth: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Whether the email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  /**
    * last login timestamp.
    */
  var lastLoginAt: js.UndefOr[String] = js.native
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String] = js.native
  /**
    * The user&#39;s hashed password.
    */
  var passwordHash: js.UndefOr[String] = js.native
  /**
    * The timestamp when the password was last updated.
    */
  var passwordUpdatedAt: js.UndefOr[Double] = js.native
  /**
    * User&#39;s phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  /**
    * The URL of the user profile photo.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * The IDP of the user.
    */
  var providerUserInfo: js.UndefOr[js.Array[AnonDisplayNameEmailFederatedId]] = js.native
  /**
    * The user&#39;s plain text password.
    */
  var rawPassword: js.UndefOr[String] = js.native
  /**
    * The user&#39;s password salt.
    */
  var salt: js.UndefOr[String] = js.native
  /**
    * User&#39;s screen name at Twitter or login name at Github.
    */
  var screenName: js.UndefOr[String] = js.native
  /**
    * Timestamp in seconds for valid login token.
    */
  var validSince: js.UndefOr[String] = js.native
  /**
    * Version of the user&#39;s password.
    */
  var version: js.UndefOr[Double] = js.native
}

object SchemaUserInfo {
  @scala.inline
  def apply(
    createdAt: String = null,
    customAttributes: String = null,
    customAuth: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    lastLoginAt: String = null,
    localId: String = null,
    passwordHash: String = null,
    passwordUpdatedAt: Int | Double = null,
    phoneNumber: String = null,
    photoUrl: String = null,
    providerUserInfo: js.Array[AnonDisplayNameEmailFederatedId] = null,
    rawPassword: String = null,
    salt: String = null,
    screenName: String = null,
    validSince: String = null,
    version: Int | Double = null
  ): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(customAuth)) __obj.updateDynamic("customAuth")(customAuth.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.asInstanceOf[js.Any])
    if (lastLoginAt != null) __obj.updateDynamic("lastLoginAt")(lastLoginAt.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash.asInstanceOf[js.Any])
    if (passwordUpdatedAt != null) __obj.updateDynamic("passwordUpdatedAt")(passwordUpdatedAt.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerUserInfo != null) __obj.updateDynamic("providerUserInfo")(providerUserInfo.asInstanceOf[js.Any])
    if (rawPassword != null) __obj.updateDynamic("rawPassword")(rawPassword.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    if (validSince != null) __obj.updateDynamic("validSince")(validSince.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserInfo]
  }
}

