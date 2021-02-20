package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.PanelBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPanelBar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PanelBar = js.native
  
  /* static member */
  var fn: PanelBar = js.native
}
object TypeofPanelBar {
  
  @scala.inline
  def apply(extend: js.Object => PanelBar, fn: PanelBar): TypeofPanelBar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPanelBar]
  }
  
  @scala.inline
  implicit class TypeofPanelBarMutableBuilder[Self <: TypeofPanelBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => PanelBar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: PanelBar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
