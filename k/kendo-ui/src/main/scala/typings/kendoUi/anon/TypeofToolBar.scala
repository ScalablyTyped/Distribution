package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.ToolBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofToolBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): ToolBar = js.native
  
  /* static member */
  var fn: ToolBar = js.native
}
object TypeofToolBar {
  
  @scala.inline
  def apply(extend: js.Object => ToolBar, fn: ToolBar): TypeofToolBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofToolBar]
  }
  
  @scala.inline
  implicit class TypeofToolBarMutableBuilder[Self <: TypeofToolBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => ToolBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: ToolBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
