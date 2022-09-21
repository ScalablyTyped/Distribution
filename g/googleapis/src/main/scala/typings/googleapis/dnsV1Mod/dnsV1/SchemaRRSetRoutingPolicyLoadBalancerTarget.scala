package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyLoadBalancerTarget extends StObject {
  
  /**
    * The frontend IP address of the
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  var ipProtocol: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var loadBalancerType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified url of the network on which the ILB is
    */
  var networkUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Load Balancer to health check. The configured port of the Load Balancer.
    */
  var port: js.UndefOr[String | Null] = js.undefined
  
  /**
    * present. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project\}/global/networks/{network\} The project ID in which the ILB exists.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The region for regional ILBs.
    */
  var region: js.UndefOr[String | Null] = js.undefined
}
object SchemaRRSetRoutingPolicyLoadBalancerTarget {
  
  inline def apply(): SchemaRRSetRoutingPolicyLoadBalancerTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicyLoadBalancerTarget]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicyLoadBalancerTarget](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "ipProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolNull: Self = StObject.set(x, "ipProtocol", null)
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "ipProtocol", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoadBalancerType(value: String): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerTypeNull: Self = StObject.set(x, "loadBalancerType", null)
    
    inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
    
    inline def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    inline def setNetworkUrlNull: Self = StObject.set(x, "networkUrl", null)
    
    inline def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
