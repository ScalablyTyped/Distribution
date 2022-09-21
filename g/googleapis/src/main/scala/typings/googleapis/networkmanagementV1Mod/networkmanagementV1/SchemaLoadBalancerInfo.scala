package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLoadBalancerInfo extends StObject {
  
  /**
    * Type of load balancer's backend configuration.
    */
  var backendType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Backend configuration URI.
    */
  var backendUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information for the loadbalancer backends.
    */
  var backends: js.UndefOr[js.Array[SchemaLoadBalancerBackend]] = js.undefined
  
  /**
    * URI of the health check for the load balancer.
    */
  var healthCheckUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the load balancer.
    */
  var loadBalancerType: js.UndefOr[String | Null] = js.undefined
}
object SchemaLoadBalancerInfo {
  
  inline def apply(): SchemaLoadBalancerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoadBalancerInfo]
  }
  
  extension [Self <: SchemaLoadBalancerInfo](x: Self) {
    
    inline def setBackendType(value: String): Self = StObject.set(x, "backendType", value.asInstanceOf[js.Any])
    
    inline def setBackendTypeNull: Self = StObject.set(x, "backendType", null)
    
    inline def setBackendTypeUndefined: Self = StObject.set(x, "backendType", js.undefined)
    
    inline def setBackendUri(value: String): Self = StObject.set(x, "backendUri", value.asInstanceOf[js.Any])
    
    inline def setBackendUriNull: Self = StObject.set(x, "backendUri", null)
    
    inline def setBackendUriUndefined: Self = StObject.set(x, "backendUri", js.undefined)
    
    inline def setBackends(value: js.Array[SchemaLoadBalancerBackend]): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
    
    inline def setBackendsUndefined: Self = StObject.set(x, "backends", js.undefined)
    
    inline def setBackendsVarargs(value: SchemaLoadBalancerBackend*): Self = StObject.set(x, "backends", js.Array(value*))
    
    inline def setHealthCheckUri(value: String): Self = StObject.set(x, "healthCheckUri", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUriNull: Self = StObject.set(x, "healthCheckUri", null)
    
    inline def setHealthCheckUriUndefined: Self = StObject.set(x, "healthCheckUri", js.undefined)
    
    inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeNull: Self = StObject.set(x, "loadBalancerType", null)
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
  }
}
