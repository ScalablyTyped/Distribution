package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartySignupNewUserRequest extends StObject {
  
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to disable the user. Only can be used by service account.
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
    * Mark the email as verified or not. Only can be used by service account.
    */
  var emailVerified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Privileged caller can create user with specified user id.
    */
  var localId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new password of the user.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Privileged caller can create user with specified phone number.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters, Firebear needs to know which Tenant to retrieve IDP configs from.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartySignupNewUserRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartySignupNewUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignupNewUserRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartySignupNewUserRequest](x: Self) {
    
    inline def setCaptchaChallenge(value: String): Self = StObject.set(x, "captchaChallenge", value.asInstanceOf[js.Any])
    
    inline def setCaptchaChallengeNull: Self = StObject.set(x, "captchaChallenge", null)
    
    inline def setCaptchaChallengeUndefined: Self = StObject.set(x, "captchaChallenge", js.undefined)
    
    inline def setCaptchaResponse(value: String): Self = StObject.set(x, "captchaResponse", value.asInstanceOf[js.Any])
    
    inline def setCaptchaResponseNull: Self = StObject.set(x, "captchaResponse", null)
    
    inline def setCaptchaResponseUndefined: Self = StObject.set(x, "captchaResponse", js.undefined)
    
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
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdNull: Self = StObject.set(x, "instanceId", null)
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setLocalIdNull: Self = StObject.set(x, "localId", null)
    
    inline def setLocalIdUndefined: Self = StObject.set(x, "localId", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setTenantProjectNumber(value: String): Self = StObject.set(x, "tenantProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setTenantProjectNumberNull: Self = StObject.set(x, "tenantProjectNumber", null)
    
    inline def setTenantProjectNumberUndefined: Self = StObject.set(x, "tenantProjectNumber", js.undefined)
  }
}
