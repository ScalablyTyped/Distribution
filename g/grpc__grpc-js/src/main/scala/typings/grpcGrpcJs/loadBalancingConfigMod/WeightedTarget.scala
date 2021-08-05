package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedTarget extends StObject {
  
  var child_policy: js.Array[LoadBalancingConfig]
  
  var weight: Double
}
object WeightedTarget {
  
  inline def apply(child_policy: js.Array[LoadBalancingConfig], weight: Double): WeightedTarget = {
    val __obj = js.Dynamic.literal(child_policy = child_policy.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTarget]
  }
  
  extension [Self <: WeightedTarget](x: Self) {
    
    inline def setChild_policy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "child_policy", value.asInstanceOf[js.Any])
    
    inline def setChild_policyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "child_policy", js.Array(value :_*))
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
