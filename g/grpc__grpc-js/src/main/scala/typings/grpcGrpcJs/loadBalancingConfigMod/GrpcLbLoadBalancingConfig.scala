package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.grpclb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcLbLoadBalancingConfig extends LoadBalancingConfig {
  
  var grpclb: GrpcLbConfig = js.native
  
  var name: grpclb = js.native
}
object GrpcLbLoadBalancingConfig {
  
  @scala.inline
  def apply(grpclb: GrpcLbConfig, name: grpclb): GrpcLbLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcLbLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class GrpcLbLoadBalancingConfigOps[Self <: GrpcLbLoadBalancingConfig] (val x: Self) extends AnyVal {
    
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
    def setGrpclb(value: GrpcLbConfig): Self = this.set("grpclb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: grpclb): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
