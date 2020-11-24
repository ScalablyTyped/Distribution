package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set the project configuration.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest extends js.Object {
  
  /**
    * Whether to allow password user sign in or sign up.
    */
  var allowPasswordUser: js.UndefOr[Boolean] = js.native
  
  /**
    * Browser API key, needed when making http request to Apiary.
    */
  var apiKey: js.UndefOr[String] = js.native
  
  /**
    * Authorized domains for widget redirect.
    */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Change email template.
    */
  var changeEmailTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
  
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /**
    * Whether to enable anonymous user.
    */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.native
  
  /**
    * Oauth2 provider configuration.
    */
  var idpConfig: js.UndefOr[js.Array[SchemaIdpConfig]] = js.native
  
  /**
    * Legacy reset password email template.
    */
  var legacyResetPasswordTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
  
  /**
    * Reset password email template.
    */
  var resetPasswordTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
  
  /**
    * Whether to use email sending provided by Firebear.
    */
  var useEmailSending: js.UndefOr[Boolean] = js.native
  
  /**
    * Verify email template.
    */
  var verifyEmailTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
}
object SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySetProjectConfigRequestOps[Self <: SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest] (val x: Self) extends AnyVal {
    
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
    def setAllowPasswordUser(value: Boolean): Self = this.set("allowPasswordUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPasswordUser: Self = this.set("allowPasswordUser", js.undefined)
    
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setAuthorizedDomainsVarargs(value: String*): Self = this.set("authorizedDomains", js.Array(value :_*))
    
    @scala.inline
    def setAuthorizedDomains(value: js.Array[String]): Self = this.set("authorizedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedDomains: Self = this.set("authorizedDomains", js.undefined)
    
    @scala.inline
    def setChangeEmailTemplate(value: SchemaEmailTemplate): Self = this.set("changeEmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeEmailTemplate: Self = this.set("changeEmailTemplate", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = this.set("delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegatedProjectNumber: Self = this.set("delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setEnableAnonymousUser(value: Boolean): Self = this.set("enableAnonymousUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAnonymousUser: Self = this.set("enableAnonymousUser", js.undefined)
    
    @scala.inline
    def setIdpConfigVarargs(value: SchemaIdpConfig*): Self = this.set("idpConfig", js.Array(value :_*))
    
    @scala.inline
    def setIdpConfig(value: js.Array[SchemaIdpConfig]): Self = this.set("idpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdpConfig: Self = this.set("idpConfig", js.undefined)
    
    @scala.inline
    def setLegacyResetPasswordTemplate(value: SchemaEmailTemplate): Self = this.set("legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyResetPasswordTemplate: Self = this.set("legacyResetPasswordTemplate", js.undefined)
    
    @scala.inline
    def setResetPasswordTemplate(value: SchemaEmailTemplate): Self = this.set("resetPasswordTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetPasswordTemplate: Self = this.set("resetPasswordTemplate", js.undefined)
    
    @scala.inline
    def setUseEmailSending(value: Boolean): Self = this.set("useEmailSending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEmailSending: Self = this.set("useEmailSending", js.undefined)
    
    @scala.inline
    def setVerifyEmailTemplate(value: SchemaEmailTemplate): Self = this.set("verifyEmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyEmailTemplate: Self = this.set("verifyEmailTemplate", js.undefined)
  }
}
