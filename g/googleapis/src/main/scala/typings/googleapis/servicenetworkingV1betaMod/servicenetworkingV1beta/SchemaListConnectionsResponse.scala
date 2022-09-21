package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConnectionsResponse extends StObject {
  
  /**
    * The list of Connections.
    */
  var connections: js.UndefOr[js.Array[SchemaGoogleCloudServicenetworkingV1betaConnection]] = js.undefined
}
object SchemaListConnectionsResponse {
  
  inline def apply(): SchemaListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectionsResponse]
  }
  
  extension [Self <: SchemaListConnectionsResponse](x: Self) {
    
    inline def setConnections(value: js.Array[SchemaGoogleCloudServicenetworkingV1betaConnection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: SchemaGoogleCloudServicenetworkingV1betaConnection*): Self = StObject.set(x, "connections", js.Array(value*))
  }
}
