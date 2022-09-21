package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedIpRange extends StObject {
  
  /** Optional. User-provided description. It must contain at most 300 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * IP address or range, defined using CIDR notation, of requests that this rule applies to. Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32` or
    * `2001:0db8:0000:0042:0000:8a2e:0370:7334`. IP range prefixes should be properly truncated. For example, `1.2.3.4/24` should be truncated to `1.2.3.0/24`. Similarly, for IPv6,
    * `2001:db8::1/32` should be truncated to `2001:db8::/32`.
    */
  var value: js.UndefOr[String] = js.undefined
}
object AllowedIpRange {
  
  inline def apply(): AllowedIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedIpRange]
  }
  
  extension [Self <: AllowedIpRange](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
