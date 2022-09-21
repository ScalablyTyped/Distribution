package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlueRecord extends StObject {
  
  /**
    * Required. Domain name of the host in Punycode format.
    */
  var hostName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of IPv4 addresses corresponding to this host in the standard decimal format (e.g. `198.51.100.1`). At least one of `ipv4_address` and `ipv6_address` must be set.
    */
  var ipv4Addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of IPv6 addresses corresponding to this host in the standard hexadecimal format (e.g. `2001:db8::`). At least one of `ipv4_address` and `ipv6_address` must be set.
    */
  var ipv6Addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGlueRecord {
  
  inline def apply(): SchemaGlueRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlueRecord]
  }
  
  extension [Self <: SchemaGlueRecord](x: Self) {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameNull: Self = StObject.set(x, "hostName", null)
    
    inline def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    inline def setIpv4Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv4Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressesNull: Self = StObject.set(x, "ipv4Addresses", null)
    
    inline def setIpv4AddressesUndefined: Self = StObject.set(x, "ipv4Addresses", js.undefined)
    
    inline def setIpv4AddressesVarargs(value: String*): Self = StObject.set(x, "ipv4Addresses", js.Array(value*))
    
    inline def setIpv6Addresses(value: js.Array[String]): Self = StObject.set(x, "ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesNull: Self = StObject.set(x, "ipv6Addresses", null)
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "ipv6Addresses", js.Array(value*))
  }
}
