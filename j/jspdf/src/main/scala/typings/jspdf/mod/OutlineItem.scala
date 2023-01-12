package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineItem extends StObject {
  
  var children: js.Array[Any]
  
  var options: Any
  
  var title: String
}
object OutlineItem {
  
  inline def apply(children: js.Array[Any], options: Any, title: String): OutlineItem = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlineItem] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
