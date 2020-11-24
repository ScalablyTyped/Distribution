package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkRoutingConfig extends js.Object {
  
  /**
    * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If
    * set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
    */
  var routingMode: js.UndefOr[String] = js.native
}
object NetworkRoutingConfig {
  
  @scala.inline
  def apply(): NetworkRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkRoutingConfig]
  }
  
  @scala.inline
  implicit class NetworkRoutingConfigOps[Self <: NetworkRoutingConfig] (val x: Self) extends AnyVal {
    
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
    def setRoutingMode(value: String): Self = this.set("routingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingMode: Self = this.set("routingMode", js.undefined)
  }
}
