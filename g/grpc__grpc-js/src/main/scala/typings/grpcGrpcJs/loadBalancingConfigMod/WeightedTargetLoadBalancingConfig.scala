package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.weighted_target
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
  implicit class WeightedTargetLoadBalancingConfigOps[Self <: WeightedTargetLoadBalancingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: weighted_target): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeighted_target(value: WeightedTargetLbConfig): Self = this.set("weighted_target", value.asInstanceOf[js.Any])
  }
}
