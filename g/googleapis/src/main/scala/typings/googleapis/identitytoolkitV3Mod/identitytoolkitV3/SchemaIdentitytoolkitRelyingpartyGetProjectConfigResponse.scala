package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse extends StObject {
  
  /**
    * Whether to allow password user sign in or sign up.
    */
  var allowPasswordUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Browser API key, needed when making http request to Apiary.
    */
  var apiKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Authorized domains.
    */
  var authorizedDomains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Change email template.
    */
  var changeEmailTemplate: js.UndefOr[SchemaEmailTemplate] = js.undefined
  
  var dynamicLinksDomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether anonymous user is enabled.
    */
  var enableAnonymousUser: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * OAuth2 provider configuration.
    */
  var idpConfig: js.UndefOr[js.Array[SchemaIdpConfig]] = js.undefined
  
  /**
    * Legacy reset password email template.
    */
  var legacyResetPasswordTemplate: js.UndefOr[SchemaEmailTemplate] = js.undefined
  
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reset password email template.
    */
  var resetPasswordTemplate: js.UndefOr[SchemaEmailTemplate] = js.undefined
  
  /**
    * Whether to use email sending provided by Firebear.
    */
  var useEmailSending: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Verify email template.
    */
  var verifyEmailTemplate: js.UndefOr[SchemaEmailTemplate] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse](x: Self) {
    
    inline def setAllowPasswordUser(value: Boolean): Self = StObject.set(x, "allowPasswordUser", value.asInstanceOf[js.Any])
    
    inline def setAllowPasswordUserNull: Self = StObject.set(x, "allowPasswordUser", null)
    
    inline def setAllowPasswordUserUndefined: Self = StObject.set(x, "allowPasswordUser", js.undefined)
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyNull: Self = StObject.set(x, "apiKey", null)
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setAuthorizedDomains(value: js.Array[String]): Self = StObject.set(x, "authorizedDomains", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedDomainsNull: Self = StObject.set(x, "authorizedDomains", null)
    
    inline def setAuthorizedDomainsUndefined: Self = StObject.set(x, "authorizedDomains", js.undefined)
    
    inline def setAuthorizedDomainsVarargs(value: String*): Self = StObject.set(x, "authorizedDomains", js.Array(value*))
    
    inline def setChangeEmailTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "changeEmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setChangeEmailTemplateUndefined: Self = StObject.set(x, "changeEmailTemplate", js.undefined)
    
    inline def setDynamicLinksDomain(value: String): Self = StObject.set(x, "dynamicLinksDomain", value.asInstanceOf[js.Any])
    
    inline def setDynamicLinksDomainNull: Self = StObject.set(x, "dynamicLinksDomain", null)
    
    inline def setDynamicLinksDomainUndefined: Self = StObject.set(x, "dynamicLinksDomain", js.undefined)
    
    inline def setEnableAnonymousUser(value: Boolean): Self = StObject.set(x, "enableAnonymousUser", value.asInstanceOf[js.Any])
    
    inline def setEnableAnonymousUserNull: Self = StObject.set(x, "enableAnonymousUser", null)
    
    inline def setEnableAnonymousUserUndefined: Self = StObject.set(x, "enableAnonymousUser", js.undefined)
    
    inline def setIdpConfig(value: js.Array[SchemaIdpConfig]): Self = StObject.set(x, "idpConfig", value.asInstanceOf[js.Any])
    
    inline def setIdpConfigUndefined: Self = StObject.set(x, "idpConfig", js.undefined)
    
    inline def setIdpConfigVarargs(value: SchemaIdpConfig*): Self = StObject.set(x, "idpConfig", js.Array(value*))
    
    inline def setLegacyResetPasswordTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    
    inline def setLegacyResetPasswordTemplateUndefined: Self = StObject.set(x, "legacyResetPasswordTemplate", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setResetPasswordTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "resetPasswordTemplate", value.asInstanceOf[js.Any])
    
    inline def setResetPasswordTemplateUndefined: Self = StObject.set(x, "resetPasswordTemplate", js.undefined)
    
    inline def setUseEmailSending(value: Boolean): Self = StObject.set(x, "useEmailSending", value.asInstanceOf[js.Any])
    
    inline def setUseEmailSendingNull: Self = StObject.set(x, "useEmailSending", null)
    
    inline def setUseEmailSendingUndefined: Self = StObject.set(x, "useEmailSending", js.undefined)
    
    inline def setVerifyEmailTemplate(value: SchemaEmailTemplate): Self = StObject.set(x, "verifyEmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setVerifyEmailTemplateUndefined: Self = StObject.set(x, "verifyEmailTemplate", js.undefined)
  }
}
