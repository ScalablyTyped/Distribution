package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTcpRouteRouteMatch extends StObject {
  
  /**
    * Required. Must be specified in the CIDR range format. A CIDR range consists of an IP Address and a prefix length to construct the subnet mask. By default, the prefix length is 32 (i.e. matches a single IP address). Only IPV4 addresses are supported. Examples: "10.0.0.1" - matches against this exact IP address. "10.0.0.0/8" - matches against any IP address within the 10.0.0.0 subnet and 255.255.255.0 mask. "0.0.0.0/0" - matches against any IP address'.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Specifies the destination port to match against.
    */
  var port: js.UndefOr[String | Null] = js.undefined
}
object SchemaTcpRouteRouteMatch {
  
  inline def apply(): SchemaTcpRouteRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTcpRouteRouteMatch]
  }
  
  extension [Self <: SchemaTcpRouteRouteMatch](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
