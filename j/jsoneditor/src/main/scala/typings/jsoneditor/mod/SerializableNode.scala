package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializableNode extends StObject {
  
  var path: JSONPath = js.native
  
  var value: js.Any = js.native
}
object SerializableNode {
  
  @scala.inline
  def apply(path: JSONPath, value: js.Any): SerializableNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableNode]
  }
  
  @scala.inline
  implicit class SerializableNodeMutableBuilder[Self <: SerializableNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
