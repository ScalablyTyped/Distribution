package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthStatusForNetworkEndpoint extends StObject {
  
  /** URL of the backend service associated with the health state of the network endpoint. */
  var backendService: js.UndefOr[BackendServiceReference] = js.undefined
  
  /** URL of the forwarding rule associated with the health state of the network endpoint. */
  var forwardingRule: js.UndefOr[ForwardingRuleReference] = js.undefined
  
  /** URL of the health check associated with the health state of the network endpoint. */
  var healthCheck: js.UndefOr[HealthCheckReference] = js.undefined
  
  /** URL of the health check service associated with the health state of the network endpoint. */
  var healthCheckService: js.UndefOr[HealthCheckServiceReference] = js.undefined
  
  /** Health state of the network endpoint determined based on the health checks configured. */
  var healthState: js.UndefOr[String] = js.undefined
}
object HealthStatusForNetworkEndpoint {
  
  @scala.inline
  def apply(): HealthStatusForNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthStatusForNetworkEndpoint]
  }
  
  @scala.inline
  implicit class HealthStatusForNetworkEndpointMutableBuilder[Self <: HealthStatusForNetworkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendService(value: BackendServiceReference): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    @scala.inline
    def setForwardingRule(value: ForwardingRuleReference): Self = StObject.set(x, "forwardingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardingRuleUndefined: Self = StObject.set(x, "forwardingRule", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: HealthCheckReference): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckService(value: HealthCheckServiceReference): Self = StObject.set(x, "healthCheckService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckServiceUndefined: Self = StObject.set(x, "healthCheckService", js.undefined)
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    @scala.inline
    def setHealthState(value: String): Self = StObject.set(x, "healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStateUndefined: Self = StObject.set(x, "healthState", js.undefined)
  }
}
