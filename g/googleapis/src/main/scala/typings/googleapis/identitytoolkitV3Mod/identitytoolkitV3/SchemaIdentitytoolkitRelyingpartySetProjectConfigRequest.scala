package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set the project configuration.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest extends StObject {
  
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
  implicit class SchemaIdentitytoolkitRelyingpartySetProjectConfigRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySetProjectConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPasswordUser(value: Boolean): Self = StObject.set(x, "allowPasswordUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPasswordUserUndefined: Self = StObject.set(x, "allowPasswordUser", js.undefined)
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    @scala.inline
    def setAuthorizedDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedDomainsUndefined: Self = StObject.set(x, "authorizedDomains", js.undefined)
    
    @scala.inline
    def setAuthorizedDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedDomains", js.Array(value :_*))
    
    @scala.inline
    def setChangeEmailTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "changeEmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeEmailTemplateUndefined: Self = StObject.set(x, "changeEmailTemplate", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
    
    @scala.inline
    def setIdpConfig(value: js.Array[SchemaIdpConfig]): Self = StObject.set(x, "idpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdpConfigUndefined: Self = StObject.set(x, "idpConfig", js.undefined)
    
    @scala.inline
    def setIdpConfigVarargs(value: SchemaIdpConfig*): Self = StObject.set(x, "idpConfig", js.Array(value :_*))
    
    @scala.inline
    def setLegacyResetPasswordTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyResetPasswordTemplateUndefined: Self = StObject.set(x, "legacyResetPasswordTemplate", js.undefined)
    
    @scala.inline
    def setResetPasswordTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "resetPasswordTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetPasswordTemplateUndefined: Self = StObject.set(x, "resetPasswordTemplate", js.undefined)
    
    @scala.inline
    def setUseEmailSending(value: Boolean): Self = StObject.set(x, "useEmailSending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEmailSendingUndefined: Self = StObject.set(x, "useEmailSending", js.undefined)
    
    @scala.inline
    def setVerifyEmailTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "verifyEmailTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyEmailTemplateUndefined: Self = StObject.set(x, "verifyEmailTemplate", js.undefined)
  }
}
