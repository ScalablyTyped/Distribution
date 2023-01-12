package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.Pane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPane extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Pane
  
  /* static member */
  var fn: Pane
}
object TypeofPane {
  
  inline def apply(extend: js.Object => Pane, fn: Pane): TypeofPane = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPane]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPane] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => Pane): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Pane): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
