package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to signup new user, create anonymous user or anonymous user reauth.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySignupNewUserRequest extends js.Object {
  
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  
  /**
    * Whether to disable the user. Only can be used by service account.
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
    * Mark the email as verified or not. Only can be used by service account.
    */
  var emailVerified: js.UndefOr[Boolean] = js.native
  
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  
  /**
    * Privileged caller can create user with specified user id.
    */
  var localId: js.UndefOr[String] = js.native
  
  /**
    * The new password of the user.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Privileged caller can create user with specified phone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The photo url of the user.
    */
  var photoUrl: js.UndefOr[String] = js.native
  
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
object SchemaIdentitytoolkitRelyingpartySignupNewUserRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySignupNewUserRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySignupNewUserRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySignupNewUserRequestOps[Self <: SchemaIdentitytoolkitRelyingpartySignupNewUserRequest] (val x: Self) extends AnyVal {
    
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
    def setCaptchaChallenge(value: String): Self = this.set("captchaChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptchaChallenge: Self = this.set("captchaChallenge", js.undefined)
    
    @scala.inline
    def setCaptchaResponse(value: String): Self = this.set("captchaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptchaResponse: Self = this.set("captchaResponse", js.undefined)
    
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
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setLocalId(value: String): Self = this.set("localId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalId: Self = this.set("localId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
    
    @scala.inline
    def setTenantProjectNumber(value: String): Self = this.set("tenantProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantProjectNumber: Self = this.set("tenantProjectNumber", js.undefined)
  }
}
