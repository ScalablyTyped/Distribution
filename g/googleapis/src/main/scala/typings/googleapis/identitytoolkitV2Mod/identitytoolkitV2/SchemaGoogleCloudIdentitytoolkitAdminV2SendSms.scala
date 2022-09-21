package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2SendSms extends StObject {
  
  /**
    * Output only. The template to use when sending an SMS.
    */
  var smsTemplate: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate] = js.undefined
  
  /**
    * Whether to use the accept_language header for SMS.
    */
  var useDeviceLocale: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2SendSms {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2SendSms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2SendSms]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2SendSms](x: Self) {
    
    inline def setSmsTemplate(value: SchemaGoogleCloudIdentitytoolkitAdminV2SmsTemplate): Self = StObject.set(x, "smsTemplate", value.asInstanceOf[js.Any])
    
    inline def setSmsTemplateUndefined: Self = StObject.set(x, "smsTemplate", js.undefined)
    
    inline def setUseDeviceLocale(value: Boolean): Self = StObject.set(x, "useDeviceLocale", value.asInstanceOf[js.Any])
    
    inline def setUseDeviceLocaleNull: Self = StObject.set(x, "useDeviceLocale", null)
    
    inline def setUseDeviceLocaleUndefined: Self = StObject.set(x, "useDeviceLocale", js.undefined)
  }
}
