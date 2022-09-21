package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalNetworkEndpointGroupsDetachEndpointsRequest extends StObject {
  
  /** The list of network endpoints to be detached. */
  var networkEndpoints: js.UndefOr[js.Array[NetworkEndpoint]] = js.undefined
}
object GlobalNetworkEndpointGroupsDetachEndpointsRequest {
  
  inline def apply(): GlobalNetworkEndpointGroupsDetachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNetworkEndpointGroupsDetachEndpointsRequest]
  }
  
  extension [Self <: GlobalNetworkEndpointGroupsDetachEndpointsRequest](x: Self) {
    
    inline def setNetworkEndpoints(value: js.Array[NetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    inline def setNetworkEndpointsVarargs(value: NetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value*))
  }
}
