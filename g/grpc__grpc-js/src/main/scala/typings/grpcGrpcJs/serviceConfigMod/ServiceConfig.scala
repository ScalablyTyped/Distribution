package typings.grpcGrpcJs.serviceConfigMod

import typings.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceConfig extends js.Object {
  
  var loadBalancingConfig: js.Array[LoadBalancingConfig] = js.native
  
  var loadBalancingPolicy: js.UndefOr[String] = js.native
  
  var methodConfig: js.Array[MethodConfig] = js.native
}
object ServiceConfig {
  
  @scala.inline
  def apply(loadBalancingConfig: js.Array[LoadBalancingConfig], methodConfig: js.Array[MethodConfig]): ServiceConfig = {
    val __obj = js.Dynamic.literal(loadBalancingConfig = loadBalancingConfig.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancingConfigVarargs(value: LoadBalancingConfig*): Self = this.set("loadBalancingConfig", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancingConfig(value: js.Array[LoadBalancingConfig]): Self = this.set("loadBalancingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodConfigVarargs(value: MethodConfig*): Self = this.set("methodConfig", js.Array(value :_*))
    
    @scala.inline
    def setMethodConfig(value: js.Array[MethodConfig]): Self = this.set("methodConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancingPolicy(value: String): Self = this.set("loadBalancingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancingPolicy: Self = this.set("loadBalancingPolicy", js.undefined)
  }
}
