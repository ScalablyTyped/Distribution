package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeIdString extends StObject {
  
  var nodeId: String
}
object NodeIdString {
  
  inline def apply(nodeId: String): NodeIdString = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIdString]
  }
  
  extension [Self <: NodeIdString](x: Self) {
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
