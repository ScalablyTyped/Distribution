package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkEndpointGroupsListEndpointsRequest extends StObject {
  
  /**
    * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network
    * endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String] = js.undefined
}
object NetworkEndpointGroupsListEndpointsRequest {
  
  inline def apply(): NetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkEndpointGroupsListEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkEndpointGroupsListEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setHealthStatus(value: String): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
  }
}
