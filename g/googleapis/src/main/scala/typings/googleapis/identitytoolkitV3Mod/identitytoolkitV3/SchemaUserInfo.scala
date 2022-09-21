package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleapis.anon.PhoneNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserInfo extends StObject {
  
  /**
    * User creation timestamp.
    */
  var createdAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The custom attributes to be set in the user's id token.
    */
  var customAttributes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the user is authenticated by the developer.
    */
  var customAuth: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the user is disabled.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the user.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the email has been verified.
    */
  var emailVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * last login timestamp.
    */
  var lastLoginAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The local ID of the user.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's hashed password.
    */
  var passwordHash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the password was last updated.
    */
  var passwordUpdatedAt: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * User's phone number.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the user profile photo.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IDP of the user.
    */
  var providerUserInfo: js.UndefOr[js.Array[PhoneNumber] | Null] = js.undefined
  
  /**
    * The user's plain text password.
    */
  var rawPassword: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's password salt.
    */
  var salt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User's screen name at Twitter or login name at Github.
    */
  var screenName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp in seconds for valid login token.
    */
  var validSince: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the user's password.
    */
  var version: js.UndefOr[Double | Null] = js.undefined
}
object SchemaUserInfo {
  
  inline def apply(): SchemaUserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInfo]
  }
  
  extension [Self <: SchemaUserInfo](x: Self) {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtNull: Self = StObject.set(x, "createdAt", null)
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCustomAttributes(value: String): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributesNull: Self = StObject.set(x, "customAttributes", null)
    
    inline def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    inline def setCustomAuth(value: Boolean): Self = StObject.set(x, "customAuth", value.asInstanceOf[js.Any])
    
    inline def setCustomAuthNull: Self = StObject.set(x, "customAuth", null)
    
    inline def setCustomAuthUndefined: Self = StObject.set(x, "customAuth", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: Boolean): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedNull: Self = StObject.set(x, "emailVerified", null)
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setLastLoginAt(value: String): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    inline def setLastLoginAtNull: Self = StObject.set(x, "lastLoginAt", null)
    
    inline def setLastLoginAtUndefined: Self = StObject.set(x, "lastLoginAt", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setPasswordHash(value: String): Self = StObject.set(x, "passwordHash", value.asInstanceOf[js.Any])
    
    inline def setPasswordHashNull: Self = StObject.set(x, "passwordHash", null)
    
    inline def setPasswordHashUndefined: Self = StObject.set(x, "passwordHash", js.undefined)
    
    inline def setPasswordUpdatedAt(value: Double): Self = StObject.set(x, "passwordUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setPasswordUpdatedAtNull: Self = StObject.set(x, "passwordUpdatedAt", null)
    
    inline def setPasswordUpdatedAtUndefined: Self = StObject.set(x, "passwordUpdatedAt", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setProviderUserInfo(value: js.Array[PhoneNumber]): Self = StObject.set(x, "providerUserInfo", value.asInstanceOf[js.Any])
    
    inline def setProviderUserInfoNull: Self = StObject.set(x, "providerUserInfo", null)
    
    inline def setProviderUserInfoUndefined: Self = StObject.set(x, "providerUserInfo", js.undefined)
    
    inline def setProviderUserInfoVarargs(value: PhoneNumber*): Self = StObject.set(x, "providerUserInfo", js.Array(value*))
    
    inline def setRawPassword(value: String): Self = StObject.set(x, "rawPassword", value.asInstanceOf[js.Any])
    
    inline def setRawPasswordNull: Self = StObject.set(x, "rawPassword", null)
    
    inline def setRawPasswordUndefined: Self = StObject.set(x, "rawPassword", js.undefined)
    
    inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltNull: Self = StObject.set(x, "salt", null)
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
    
    inline def setScreenNameNull: Self = StObject.set(x, "screenName", null)
    
    inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
    
    inline def setValidSince(value: String): Self = StObject.set(x, "validSince", value.asInstanceOf[js.Any])
    
    inline def setValidSinceNull: Self = StObject.set(x, "validSince", null)
    
    inline def setValidSinceUndefined: Self = StObject.set(x, "validSince", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
