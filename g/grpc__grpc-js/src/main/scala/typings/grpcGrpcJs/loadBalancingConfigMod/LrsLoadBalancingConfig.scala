package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.lrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LrsLoadBalancingConfig extends LoadBalancingConfig {
  
  var lrs: LrsLbConfig = js.native
  
  var name: lrs = js.native
}
object LrsLoadBalancingConfig {
  
  @scala.inline
  def apply(lrs: LrsLbConfig, name: lrs): LrsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(lrs = lrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LrsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class LrsLoadBalancingConfigOps[Self <: LrsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
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
    def setLrs(value: LrsLbConfig): Self = this.set("lrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: lrs): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
