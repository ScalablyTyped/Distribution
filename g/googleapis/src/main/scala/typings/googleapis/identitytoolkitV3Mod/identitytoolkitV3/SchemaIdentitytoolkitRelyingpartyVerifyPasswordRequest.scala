package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to verify the password.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest extends StObject {
  
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * The password inputed by the user.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * The GITKit token for the non-trusted IDP, which is to be confirmed by the
    * user.
    */
  var pendingIdToken: js.UndefOr[String] = js.native
  
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the
    * correct IDP parameters, Firebear needs to know which Tenant to retrieve
    * IDP configs from.
    */
  var tenantId: js.UndefOr[String] = js.native
  
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptchaChallenge(value: String): Self = StObject.set(x, "captchaChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaChallengeUndefined: Self = StObject.set(x, "captchaChallenge", js.undefined)
    
    @scala.inline
    def setCaptchaResponse(value: String): Self = StObject.set(x, "captchaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptchaResponseUndefined: Self = StObject.set(x, "captchaResponse", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPendingIdToken(value: String): Self = StObject.set(x, "pendingIdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingIdTokenUndefined: Self = StObject.set(x, "pendingIdToken", js.undefined)
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setTenantProjectNumber(value: String): Self = StObject.set(x, "tenantProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectNumberUndefined: Self = StObject.set(x, "tenantProjectNumber", js.undefined)
  }
}
