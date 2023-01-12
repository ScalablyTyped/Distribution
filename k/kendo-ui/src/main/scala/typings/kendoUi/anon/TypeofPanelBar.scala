package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PanelBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPanelBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PanelBar
  
  /* static member */
  var fn: PanelBar
}
object TypeofPanelBar {
  
  inline def apply(extend: js.Object => PanelBar, fn: PanelBar): TypeofPanelBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPanelBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPanelBar] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => PanelBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PanelBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
