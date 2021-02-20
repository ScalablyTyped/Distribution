package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var connections: ConnectionsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(connections: ConnectionsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: ConnectionsResource): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
  }
}
