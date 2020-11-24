package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthStatusForNetworkEndpoint extends js.Object {
  
  /** URL of the backend service associated with the health state of the network endpoint. */
  var backendService: js.UndefOr[BackendServiceReference] = js.native
  
  /** URL of the forwarding rule associated with the health state of the network endpoint. */
  var forwardingRule: js.UndefOr[ForwardingRuleReference] = js.native
  
  /** URL of the health check associated with the health state of the network endpoint. */
  var healthCheck: js.UndefOr[HealthCheckReference] = js.native
  
  /** URL of the health check service associated with the health state of the network endpoint. */
  var healthCheckService: js.UndefOr[HealthCheckServiceReference] = js.native
  
  /** Health state of the network endpoint determined based on the health checks configured. */
  var healthState: js.UndefOr[String] = js.native
}
object HealthStatusForNetworkEndpoint {
  
  @scala.inline
  def apply(): HealthStatusForNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthStatusForNetworkEndpoint]
  }
  
  @scala.inline
  implicit class HealthStatusForNetworkEndpointOps[Self <: HealthStatusForNetworkEndpoint] (val x: Self) extends AnyVal {
    
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
    def setBackendService(value: BackendServiceReference): Self = this.set("backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendService: Self = this.set("backendService", js.undefined)
    
    @scala.inline
    def setForwardingRule(value: ForwardingRuleReference): Self = this.set("forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardingRule: Self = this.set("forwardingRule", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheckReference): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    
    @scala.inline
    def setHealthCheckService(value: HealthCheckServiceReference): Self = this.set("healthCheckService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckService: Self = this.set("healthCheckService", js.undefined)
    
    @scala.inline
    def setHealthState(value: String): Self = this.set("healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthState: Self = this.set("healthState", js.undefined)
  }
}
