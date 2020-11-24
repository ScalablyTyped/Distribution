package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.cds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdsLoadBalancingConfig extends LoadBalancingConfig {
  
  var cds: CdsLbConfig = js.native
  
  var name: cds = js.native
}
object CdsLoadBalancingConfig {
  
  @scala.inline
  def apply(cds: CdsLbConfig, name: cds): CdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(cds = cds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class CdsLoadBalancingConfigOps[Self <: CdsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
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
    def setCds(value: CdsLbConfig): Self = this.set("cds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: cds): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
