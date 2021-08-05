package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var connections: ConnectionsResource
}
object LocationsResource {
  
  inline def apply(connections: ConnectionsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  extension [Self <: LocationsResource](x: Self) {
    
    inline def setConnections(value: ConnectionsResource): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
  }
}
