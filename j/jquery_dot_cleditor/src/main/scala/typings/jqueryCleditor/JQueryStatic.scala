package typings.jqueryCleditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var cleditor: JQueryCLEditorStatic
}
object JQueryStatic {
  
  inline def apply(cleditor: JQueryCLEditorStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(cleditor = cleditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setCleditor(value: JQueryCLEditorStatic): Self = StObject.set(x, "cleditor", value.asInstanceOf[js.Any])
  }
}
