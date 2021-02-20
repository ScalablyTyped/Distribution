package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.weighted_target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightedTargetLoadBalancingConfig extends LoadBalancingConfig {
  
  var name: weighted_target = js.native
  
  var weighted_target: WeightedTargetLbConfig = js.native
}
object WeightedTargetLoadBalancingConfig {
  
  @scala.inline
  def apply(name: weighted_target, weighted_target: WeightedTargetLbConfig): WeightedTargetLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weighted_target = weighted_target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTargetLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class WeightedTargetLoadBalancingConfigMutableBuilder[Self <: WeightedTargetLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: weighted_target): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeighted_target(value: WeightedTargetLbConfig): Self = StObject.set(x, "weighted_target", value.asInstanceOf[js.Any])
  }
}
