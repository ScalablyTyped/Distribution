package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeIdNumber extends StObject {
  
  var nodeId: Double
}
object NodeIdNumber {
  
  inline def apply(nodeId: Double): NodeIdNumber = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIdNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeIdNumber] (val x: Self) extends AnyVal {
    
    inline def setNodeId(value: Double): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
