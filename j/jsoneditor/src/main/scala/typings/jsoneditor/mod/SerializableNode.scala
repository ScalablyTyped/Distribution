package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializableNode extends StObject {
  
  var path: JSONPath
  
  var value: Any
}
object SerializableNode {
  
  inline def apply(path: JSONPath, value: Any): SerializableNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializableNode] (val x: Self) extends AnyVal {
    
    inline def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
