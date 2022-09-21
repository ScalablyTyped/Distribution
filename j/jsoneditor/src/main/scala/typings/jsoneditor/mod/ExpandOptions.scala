package typings.jsoneditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandOptions extends StObject {
  
  var isExpand: Boolean
  
  var path: js.Array[String]
  
  var recursive: Boolean
}
object ExpandOptions {
  
  inline def apply(isExpand: Boolean, path: js.Array[String], recursive: Boolean): ExpandOptions = {
    val __obj = js.Dynamic.literal(isExpand = isExpand.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandOptions]
  }
  
  extension [Self <: ExpandOptions](x: Self) {
    
    inline def setIsExpand(value: Boolean): Self = StObject.set(x, "isExpand", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
