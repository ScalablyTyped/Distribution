package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.PhoneNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var providerUserInfo: js.UndefOr[js.Array[PhoneNumber]] = js.native
  
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
  def apply(): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInfo]
  }
  
  @scala.inline
  implicit class SchemaUserInfoOps[Self <: SchemaUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: String): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    
    @scala.inline
    def setCustomAuth(value: Boolean): Self = this.set("customAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAuth: Self = this.set("customAuth", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = this.set("emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailVerified: Self = this.set("emailVerified", js.undefined)
    
    @scala.inline
    def setLastLoginAt(value: String): Self = this.set("lastLoginAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastLoginAt: Self = this.set("lastLoginAt", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    
    @scala.inline
    def setPasswordHash(value: String): Self = this.set("passwordHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordHash: Self = this.set("passwordHash", js.undefined)
    
    @scala.inline
    def setPasswordUpdatedAt(value: Double): Self = this.set("passwordUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordUpdatedAt: Self = this.set("passwordUpdatedAt", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    
    @scala.inline
    def setProviderUserInfoVarargs(value: PhoneNumber*): Self = this.set("providerUserInfo", js.Array(value :_*))
    
    @scala.inline
    def setProviderUserInfo(value: js.Array[PhoneNumber]): Self = this.set("providerUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderUserInfo: Self = this.set("providerUserInfo", js.undefined)
    
    @scala.inline
    def setRawPassword(value: String): Self = this.set("rawPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawPassword: Self = this.set("rawPassword", js.undefined)
    
    @scala.inline
    def setSalt(value: String): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenName: Self = this.set("screenName", js.undefined)
    
    @scala.inline
    def setValidSince(value: String): Self = this.set("validSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidSince: Self = this.set("validSince", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
