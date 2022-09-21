package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerSettings extends StObject {
  
  /** Audit Logging settings for the customer. If update_mask is empty then this field will be updated based on UpdateCustomerSettings request. */
  var auditLoggingSettings: js.UndefOr[AuditLoggingSettings] = js.undefined
  
  /** VPC SC settings for the customer. If update_mask is empty then this field will be updated based on UpdateCustomerSettings request. */
  var vpcSettings: js.UndefOr[VPCSettings] = js.undefined
}
object CustomerSettings {
  
  inline def apply(): CustomerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerSettings]
  }
  
  extension [Self <: CustomerSettings](x: Self) {
    
    inline def setAuditLoggingSettings(value: AuditLoggingSettings): Self = StObject.set(x, "auditLoggingSettings", value.asInstanceOf[js.Any])
    
    inline def setAuditLoggingSettingsUndefined: Self = StObject.set(x, "auditLoggingSettings", js.undefined)
    
    inline def setVpcSettings(value: VPCSettings): Self = StObject.set(x, "vpcSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcSettingsUndefined: Self = StObject.set(x, "vpcSettings", js.undefined)
  }
}
