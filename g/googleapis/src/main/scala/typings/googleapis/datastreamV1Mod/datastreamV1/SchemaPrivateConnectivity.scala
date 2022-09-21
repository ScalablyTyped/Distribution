package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateConnectivity extends StObject {
  
  /**
    * Required. A reference to a private connection resource. Format: `projects/{project\}/locations/{location\}/privateConnections/{name\}`
    */
  var privateConnection: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrivateConnectivity {
  
  inline def apply(): SchemaPrivateConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateConnectivity]
  }
  
  extension [Self <: SchemaPrivateConnectivity](x: Self) {
    
    inline def setPrivateConnection(value: String): Self = StObject.set(x, "privateConnection", value.asInstanceOf[js.Any])
    
    inline def setPrivateConnectionNull: Self = StObject.set(x, "privateConnection", null)
    
    inline def setPrivateConnectionUndefined: Self = StObject.set(x, "privateConnection", js.undefined)
  }
}
