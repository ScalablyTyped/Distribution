package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListConnectionsResponse is the response to list peering states for the
  * given service and consumer project.
  */
@js.native
trait SchemaListConnectionsResponse extends StObject {
  
  /**
    * The list of Connections.
    */
  var connections: js.UndefOr[js.Array[SchemaConnection]] = js.native
}
object SchemaListConnectionsResponse {
  
  @scala.inline
  def apply(): SchemaListConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListConnectionsResponseMutableBuilder[Self <: SchemaListConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: js.Array[SchemaConnection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: SchemaConnection*): Self = StObject.set(x, "connections", js.Array(value :_*))
  }
}
