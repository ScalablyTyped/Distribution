package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofView extends StObject {
  
  /* static member */
  def extend(proto: js.Object): View
  
  /* static member */
  var fn: View
}
object TypeofView {
  
  @scala.inline
  def apply(extend: js.Object => View, fn: View): TypeofView = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofView]
  }
  
  @scala.inline
  implicit class TypeofViewMutableBuilder[Self <: TypeofView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => View): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: View): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
