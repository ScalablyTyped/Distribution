package typings.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceConfigCanaryConfig extends js.Object {
  
  var clientHostname: js.UndefOr[js.Array[String]] = js.native
  
  var clientLanguage: js.UndefOr[js.Array[String]] = js.native
  
  var percentage: js.UndefOr[Double] = js.native
  
  var serviceConfig: ServiceConfig = js.native
}
object ServiceConfigCanaryConfig {
  
  @scala.inline
  def apply(serviceConfig: ServiceConfig): ServiceConfigCanaryConfig = {
    val __obj = js.Dynamic.literal(serviceConfig = serviceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfigCanaryConfig]
  }
  
  @scala.inline
  implicit class ServiceConfigCanaryConfigOps[Self <: ServiceConfigCanaryConfig] (val x: Self) extends AnyVal {
    
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
    def setServiceConfig(value: ServiceConfig): Self = this.set("serviceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientHostnameVarargs(value: String*): Self = this.set("clientHostname", js.Array(value :_*))
    
    @scala.inline
    def setClientHostname(value: js.Array[String]): Self = this.set("clientHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientHostname: Self = this.set("clientHostname", js.undefined)
    
    @scala.inline
    def setClientLanguageVarargs(value: String*): Self = this.set("clientLanguage", js.Array(value :_*))
    
    @scala.inline
    def setClientLanguage(value: js.Array[String]): Self = this.set("clientLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientLanguage: Self = this.set("clientLanguage", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
  }
}
