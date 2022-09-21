package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig extends StObject {
  
  /**
    * Default locale used for email and SMS in IETF BCP 47 format.
    */
  var defaultLocale: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Options for email sending.
    */
  var sendEmail: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail] = js.undefined
  
  /**
    * Options for SMS sending.
    */
  var sendSms: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2SendSms] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2NotificationConfig](x: Self) {
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleNull: Self = StObject.set(x, "defaultLocale", null)
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setSendEmail(value: SchemaGoogleCloudIdentitytoolkitAdminV2SendEmail): Self = StObject.set(x, "sendEmail", value.asInstanceOf[js.Any])
    
    inline def setSendEmailUndefined: Self = StObject.set(x, "sendEmail", js.undefined)
    
    inline def setSendSms(value: SchemaGoogleCloudIdentitytoolkitAdminV2SendSms): Self = StObject.set(x, "sendSms", value.asInstanceOf[js.Any])
    
    inline def setSendSmsUndefined: Self = StObject.set(x, "sendSms", js.undefined)
  }
}
