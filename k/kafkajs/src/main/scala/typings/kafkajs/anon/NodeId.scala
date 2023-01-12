package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeId extends StObject {
  
  var nodeId: String
}
object NodeId {
  
  inline def apply(nodeId: String): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeId] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: String): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
