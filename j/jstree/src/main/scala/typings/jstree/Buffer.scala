package typings.jstree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buffer extends StObject {
  
  var inst: js.Any
  
  var mode: String
  
  var node: js.Array[js.Any]
}
object Buffer {
  
  @scala.inline
  def apply(inst: js.Any, mode: String, node: js.Array[js.Any]): Buffer = {
    val __obj = js.Dynamic.literal(inst = inst.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  
  @scala.inline
  implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInst(value: js.Any): Self = StObject.set(x, "inst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: js.Array[js.Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeVarargs(value: js.Any*): Self = StObject.set(x, "node", js.Array(value :_*))
  }
}
