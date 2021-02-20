package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.PhoneNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template for an individual account info.
  */
@js.native
trait SchemaUserInfo extends StObject {
  
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
  implicit class SchemaUserInfoMutableBuilder[Self <: SchemaUserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: String): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setCustomAuth(value: Boolean): Self = StObject.set(x, "customAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAuthUndefined: Self = StObject.set(x, "customAuth", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    @scala.inline
    def setLastLoginAt(value: String): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    @scala.inline
    def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    @scala.inline
    def setPasswordUpdatedAt(value: Double): Self = StObject.set(x, "passwordUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUpdatedAtUndefined: Self = StObject.set(x, "passwordUpdatedAt", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setProviderUserInfo(value: js.Array[PhoneNumber]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
    
    @scala.inline
    def setProviderUserInfoVarargs(value: PhoneNumber*): Self = StObject.set(x, "providerUserInfo", js.Array(value :_*))
    
    @scala.inline
    def setRawPassword(value: String): Self = StObject.set(x, "rawPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawPasswordUndefined: Self = StObject.set(x, "rawPassword", js.undefined)
    
    @scala.inline
    def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    @scala.inline
    def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
    
    @scala.inline
    def setValidSince(value: String): Self = StObject.set(x, "validSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidSinceUndefined: Self = StObject.set(x, "validSince", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
