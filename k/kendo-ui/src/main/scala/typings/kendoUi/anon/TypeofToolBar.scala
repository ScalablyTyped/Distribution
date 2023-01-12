package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ToolBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofToolBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ToolBar
  
  /* static member */
  var fn: ToolBar
}
object TypeofToolBar {
  
  inline def apply(extend: js.Object => ToolBar, fn: ToolBar): TypeofToolBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToolBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofToolBar] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => ToolBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: ToolBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
