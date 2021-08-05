package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.weighted_target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedTargetLoadBalancingConfig
  extends StObject
     with LoadBalancingConfig {
  
  var name: weighted_target
  
  var weighted_target: WeightedTargetLbConfig
}
object WeightedTargetLoadBalancingConfig {
  
  inline def apply(weighted_target: WeightedTargetLbConfig): WeightedTargetLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "weighted_target", weighted_target = weighted_target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTargetLoadBalancingConfig]
  }
  
  extension [Self <: WeightedTargetLoadBalancingConfig](x: Self) {
    
    inline def setName(value: weighted_target): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWeighted_target(value: WeightedTargetLbConfig): Self = StObject.set(x, "weighted_target", value.asInstanceOf[js.Any])
  }
}
