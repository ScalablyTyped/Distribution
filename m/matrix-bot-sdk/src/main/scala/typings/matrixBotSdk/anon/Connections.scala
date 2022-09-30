package typings.matrixBotSdk.anon

import typings.matrixBotSdk.adminApisMod.WhoisConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connections extends StObject {
  
  var connections: js.Array[WhoisConnectionInfo]
}
object Connections {
  
  inline def apply(connections: js.Array[WhoisConnectionInfo]): Connections = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
  
  extension [Self <: Connections](x: Self) {
    
    inline def setConnections(value: js.Array[WhoisConnectionInfo]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsVarargs(value: WhoisConnectionInfo*): Self = StObject.set(x, "connections", js.Array(value*))
  }
}
