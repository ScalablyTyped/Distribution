package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.pick_first
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickFirstLoadBalancingConfig extends LoadBalancingConfig {
  
  var name: pick_first = js.native
  
  var pick_first: PickFirstConfig = js.native
}
object PickFirstLoadBalancingConfig {
  
  @scala.inline
  def apply(name: pick_first, pick_first: PickFirstConfig): PickFirstLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFirstLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class PickFirstLoadBalancingConfigOps[Self <: PickFirstLoadBalancingConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: pick_first): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPick_first(value: PickFirstConfig): Self = this.set("pick_first", value.asInstanceOf[js.Any])
  }
}
