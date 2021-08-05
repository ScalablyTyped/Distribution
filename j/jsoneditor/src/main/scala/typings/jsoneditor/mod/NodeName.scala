package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeName extends StObject {
  
  var path: js.Array[String]
  
  var size: Double
  
  var `type`: NodeType
}
object NodeName {
  
  inline def apply(path: js.Array[String], size: Double, `type`: NodeType): NodeName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeName]
  }
  
  extension [Self <: NodeName](x: Self) {
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
