package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEndpointGroupsDetachEndpointsRequest extends StObject {
  
  /** The list of network endpoints to be detached. */
  var networkEndpoints: js.UndefOr[js.Array[NetworkEndpoint]] = js.undefined
}
object NetworkEndpointGroupsDetachEndpointsRequest {
  
  @scala.inline
  def apply(): NetworkEndpointGroupsDetachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupsDetachEndpointsRequest]
  }
  
  @scala.inline
  implicit class NetworkEndpointGroupsDetachEndpointsRequestMutableBuilder[Self <: NetworkEndpointGroupsDetachEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[NetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    @scala.inline
    def setNetworkEndpointsVarargs(value: NetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value :_*))
  }
}
