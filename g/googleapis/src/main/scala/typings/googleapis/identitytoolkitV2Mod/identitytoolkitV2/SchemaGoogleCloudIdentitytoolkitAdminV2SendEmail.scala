package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail extends StObject {
  
  /**
    * action url in email template.
    */
  var callbackUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email template for change email
    */
  var changeEmailTemplate: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate] = js.undefined
  
  /**
    * Information of custom domain DNS verification.
    */
  var dnsInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo] = js.undefined
  
  /**
    * Reset password email template for legacy Firebase V1 app.
    */
  var legacyResetPasswordTemplate: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate] = js.undefined
  
  /**
    * The method used for sending an email.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email template for reset password
    */
  var resetPasswordTemplate: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate] = js.undefined
  
  /**
    * Email template for reverting second factor addition emails
    */
  var revertSecondFactorAdditionTemplate: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate] = js.undefined
  
  /**
    * Use a custom SMTP relay
    */
  var smtp: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2Smtp] = js.undefined
  
  /**
    * Email template for verify email
    */
  var verifyEmailTemplate: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail](x: Self) {
    
    inline def setCallbackUri(value: String): Self = StObject.set(x, "callbackUri", value.asInstanceOf[js.Any])
    
    inline def setCallbackUriNull: Self = StObject.set(x, "callbackUri", null)
    
    inline def setCallbackUriUndefined: Self = StObject.set(x, "callbackUri", js.undefined)
    
    inline def setChangeEmailTemplate(value: SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate): Self = StObject.set(x, "changeEmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setChangeEmailTemplateUndefined: Self = StObject.set(x, "changeEmailTemplate", js.undefined)
    
    inline def setDnsInfo(value: SchemaGoogleCloudIdentitytoolkitAdminV2DnsInfo): Self = StObject.set(x, "dnsInfo", value.asInstanceOf[js.Any])
    
    inline def setDnsInfoUndefined: Self = StObject.set(x, "dnsInfo", js.undefined)
    
    inline def setLegacyResetPasswordTemplate(value: SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate): Self = StObject.set(x, "legacyResetPasswordTemplate", value.asInstanceOf[js.Any])
    
    inline def setLegacyResetPasswordTemplateUndefined: Self = StObject.set(x, "legacyResetPasswordTemplate", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setResetPasswordTemplate(value: SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate): Self = StObject.set(x, "resetPasswordTemplate", value.asInstanceOf[js.Any])
    
    inline def setResetPasswordTemplateUndefined: Self = StObject.set(x, "resetPasswordTemplate", js.undefined)
    
    inline def setRevertSecondFactorAdditionTemplate(value: SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate): Self = StObject.set(x, "revertSecondFactorAdditionTemplate", value.asInstanceOf[js.Any])
    
    inline def setRevertSecondFactorAdditionTemplateUndefined: Self = StObject.set(x, "revertSecondFactorAdditionTemplate", js.undefined)
    
    inline def setSmtp(value: SchemaGoogleCloudIdentitytoolkitAdminV2Smtp): Self = StObject.set(x, "smtp", value.asInstanceOf[js.Any])
    
    inline def setSmtpUndefined: Self = StObject.set(x, "smtp", js.undefined)
    
    inline def setVerifyEmailTemplate(value: SchemaGoogleCloudIdentitytoolkitAdminV2EmailTemplate): Self = StObject.set(x, "verifyEmailTemplate", value.asInstanceOf[js.Any])
    
    inline def setVerifyEmailTemplateUndefined: Self = StObject.set(x, "verifyEmailTemplate", js.undefined)
  }
}
