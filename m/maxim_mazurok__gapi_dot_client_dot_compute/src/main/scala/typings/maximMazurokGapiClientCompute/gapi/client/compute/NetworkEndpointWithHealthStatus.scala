package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointWithHealthStatus extends StObject {
  
  /** [Output only] The health status of network endpoint; */
  var healths: js.UndefOr[js.Array[HealthStatusForNetworkEndpoint]] = js.native
  
  /** [Output only] The network endpoint; */
  var networkEndpoint: js.UndefOr[NetworkEndpoint] = js.native
}
object NetworkEndpointWithHealthStatus {
  
  @scala.inline
  def apply(): NetworkEndpointWithHealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointWithHealthStatus]
  }
  
  @scala.inline
  implicit class NetworkEndpointWithHealthStatusMutableBuilder[Self <: NetworkEndpointWithHealthStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealths(value: js.Array[HealthStatusForNetworkEndpoint]): Self = StObject.set(x, "healths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthsUndefined: Self = StObject.set(x, "healths", js.undefined)
    
    @scala.inline
    def setHealthsVarargs(value: HealthStatusForNetworkEndpoint*): Self = StObject.set(x, "healths", js.Array(value :_*))
    
    @scala.inline
    def setNetworkEndpoint(value: NetworkEndpoint): Self = StObject.set(x, "networkEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointUndefined: Self = StObject.set(x, "networkEndpoint", js.undefined)
  }
}
