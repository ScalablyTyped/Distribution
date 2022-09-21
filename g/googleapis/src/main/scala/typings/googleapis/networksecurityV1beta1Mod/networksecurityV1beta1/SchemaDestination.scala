package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestination extends StObject {
  
  /**
    * Required. List of host names to match. Matched against the ":authority" header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example "mydomain.*") or a suffix match (example "*.myorg.com") or a presence (any) match "*".
    */
  var hosts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
    */
  var httpHeaderMatch: js.UndefOr[SchemaHttpHeaderMatch] = js.undefined
  
  /**
    * Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
    */
  var methods: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. List of destination ports to match. At least one port should match.
    */
  var ports: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaDestination {
  
  inline def apply(): SchemaDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestination]
  }
  
  extension [Self <: SchemaDestination](x: Self) {
    
    inline def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsNull: Self = StObject.set(x, "hosts", null)
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value*))
    
    inline def setHttpHeaderMatch(value: SchemaHttpHeaderMatch): Self = StObject.set(x, "httpHeaderMatch", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaderMatchUndefined: Self = StObject.set(x, "httpHeaderMatch", js.undefined)
    
    inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsNull: Self = StObject.set(x, "methods", null)
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsNull: Self = StObject.set(x, "ports", null)
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
