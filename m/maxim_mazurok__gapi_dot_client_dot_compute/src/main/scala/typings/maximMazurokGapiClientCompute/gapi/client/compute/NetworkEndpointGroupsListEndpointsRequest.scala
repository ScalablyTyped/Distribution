package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkEndpointGroupsListEndpointsRequest extends StObject {
  
  /**
    * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network
    * endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String] = js.native
}
object NetworkEndpointGroupsListEndpointsRequest {
  
  @scala.inline
  def apply(): NetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupsListEndpointsRequest]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupsListEndpointsRequestMutableBuilder[Self <: NetworkEndpointGroupsListEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: String): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
  }
}
