package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityChild extends js.Object {
  
  var config: js.Array[LoadBalancingConfig] = js.native
}
object PriorityChild {
  
  @scala.inline
  def apply(config: js.Array[LoadBalancingConfig]): PriorityChild = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityChild]
  }
  
  @scala.inline
  implicit class PriorityChildOps[Self <: PriorityChild] (val x: Self) extends AnyVal {
    
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
    def setConfigVarargs(value: LoadBalancingConfig*): Self = this.set("config", js.Array(value :_*))
    
    @scala.inline
    def setConfig(value: js.Array[LoadBalancingConfig]): Self = this.set("config", value.asInstanceOf[js.Any])
  }
}
