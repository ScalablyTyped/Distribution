package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.eds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdsLoadBalancingConfig extends LoadBalancingConfig {
  
  var eds: EdsLbConfig = js.native
  
  var name: eds = js.native
}
object EdsLoadBalancingConfig {
  
  @scala.inline
  def apply(eds: EdsLbConfig, name: eds): EdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdsLoadBalancingConfig]
  }
  
  @scala.inline
  implicit class EdsLoadBalancingConfigOps[Self <: EdsLoadBalancingConfig] (val x: Self) extends AnyVal {
    
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
    def setEds(value: EdsLbConfig): Self = this.set("eds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: eds): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
