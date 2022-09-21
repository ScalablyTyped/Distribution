package typings.googleapis.domainsV1alpha2Mod.domainsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigureDnsSettingsRequest extends StObject {
  
  /**
    * Fields of the `DnsSettings` to update.
    */
  var dnsSettings: js.UndefOr[SchemaDnsSettings] = js.undefined
  
  /**
    * Required. The field mask describing which fields to update as a comma-separated list. For example, if only the name servers are being updated for an existing Custom DNS configuration, the `update_mask` is `"custom_dns.name_servers"`. When changing the DNS provider from one type to another, pass the new provider's field name as part of the field mask. For example, when changing from a Google Domains DNS configuration to a Custom DNS configuration, the `update_mask` is `"custom_dns"`. //
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Validate the request without actually updating the DNS settings.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigureDnsSettingsRequest {
  
  inline def apply(): SchemaConfigureDnsSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigureDnsSettingsRequest]
  }
  
  extension [Self <: SchemaConfigureDnsSettingsRequest](x: Self) {
    
    inline def setDnsSettings(value: SchemaDnsSettings): Self = StObject.set(x, "dnsSettings", value.asInstanceOf[js.Any])
    
    inline def setDnsSettingsUndefined: Self = StObject.set(x, "dnsSettings", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
