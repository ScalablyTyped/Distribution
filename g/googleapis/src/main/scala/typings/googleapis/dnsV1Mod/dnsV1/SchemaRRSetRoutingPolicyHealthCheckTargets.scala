package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRRSetRoutingPolicyHealthCheckTargets extends StObject {
  
  var internalLoadBalancers: js.UndefOr[js.Array[SchemaRRSetRoutingPolicyLoadBalancerTarget]] = js.undefined
}
object SchemaRRSetRoutingPolicyHealthCheckTargets {
  
  inline def apply(): SchemaRRSetRoutingPolicyHealthCheckTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRRSetRoutingPolicyHealthCheckTargets]
  }
  
  extension [Self <: SchemaRRSetRoutingPolicyHealthCheckTargets](x: Self) {
    
    inline def setInternalLoadBalancers(value: js.Array[SchemaRRSetRoutingPolicyLoadBalancerTarget]): Self = StObject.set(x, "internalLoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setInternalLoadBalancersUndefined: Self = StObject.set(x, "internalLoadBalancers", js.undefined)
    
    inline def setInternalLoadBalancersVarargs(value: SchemaRRSetRoutingPolicyLoadBalancerTarget*): Self = StObject.set(x, "internalLoadBalancers", js.Array(value*))
  }
}
