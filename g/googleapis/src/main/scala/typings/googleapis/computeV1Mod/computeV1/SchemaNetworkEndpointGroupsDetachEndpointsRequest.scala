package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupsDetachEndpointsRequest extends StObject {
  
  /**
    * The list of network endpoints to be detached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.undefined
}
object SchemaNetworkEndpointGroupsDetachEndpointsRequest {
  
  inline def apply(): SchemaNetworkEndpointGroupsDetachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsDetachEndpointsRequest]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupsDetachEndpointsRequest](x: Self) {
    
    inline def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    inline def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value :_*))
  }
}
