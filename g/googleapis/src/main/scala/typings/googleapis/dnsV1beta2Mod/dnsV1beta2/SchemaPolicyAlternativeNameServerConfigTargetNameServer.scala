package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyAlternativeNameServerConfigTargetNameServer extends StObject {
  
  /**
    * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
    */
  var forwardingPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IPv4 address to forward to.
    */
  var ipv4Address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
    */
  var ipv6Address: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicyAlternativeNameServerConfigTargetNameServer {
  
  inline def apply(): SchemaPolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfigTargetNameServer]
  }
  
  extension [Self <: SchemaPolicyAlternativeNameServerConfigTargetNameServer](x: Self) {
    
    inline def setForwardingPath(value: String): Self = StObject.set(x, "forwardingPath", value.asInstanceOf[js.Any])
    
    inline def setForwardingPathNull: Self = StObject.set(x, "forwardingPath", null)
    
    inline def setForwardingPathUndefined: Self = StObject.set(x, "forwardingPath", js.undefined)
    
    inline def setIpv4Address(value: String): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressNull: Self = StObject.set(x, "ipv4Address", null)
    
    inline def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    inline def setIpv6Address(value: String): Self = StObject.set(x, "ipv6Address", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressNull: Self = StObject.set(x, "ipv6Address", null)
    
    inline def setIpv6AddressUndefined: Self = StObject.set(x, "ipv6Address", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
