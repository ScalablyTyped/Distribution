package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var inst: Any
  
  var mode: String
  
  var node: js.Array[Any]
}
object Buffer {
  
  inline def apply(inst: Any, mode: String, node: js.Array[Any]): Buffer = {
    val __obj = js.Dynamic.literal(inst = inst.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    inline def setInst(value: Any): Self = StObject.set(x, "inst", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNode(value: js.Array[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: Any*): Self = StObject.set(x, "node", js.Array(value*))
  }
}
