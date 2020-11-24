package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.xds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XdsLoadBalancingConfig extends LoadBalancingConfig {
  
  var name: xds = js.native
  
  var xds: XdsConfig = js.native
}
object XdsLoadBalancingConfig {
  
  @scala.inline
  def apply(name: xds, xds: XdsConfig): XdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], xds = xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[XdsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class XdsLoadBalancingConfigOps[Self <: XdsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
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
    def setName(value: xds): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXds(value: XdsConfig): Self = this.set("xds", value.asInstanceOf[js.Any])
  }
}
