package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Pane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPane extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Pane = js.native
  
  /* static member */
  var fn: Pane = js.native
}
object TypeofPane {
  
  @scala.inline
  def apply(extend: js.Object => Pane, fn: Pane): TypeofPane = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPane]
  }
  
  @scala.inline
  implicit class TypeofPaneMutableBuilder[Self <: TypeofPane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Pane): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Pane): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
