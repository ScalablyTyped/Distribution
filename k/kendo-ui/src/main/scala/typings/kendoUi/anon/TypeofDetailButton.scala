package typings.kendoUi.anon

import typings.kendoUi.kendo.mobile.ui.DetailButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDetailButton extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DetailButton
  
  /* static member */
  var fn: DetailButton
}
object TypeofDetailButton {
  
  @scala.inline
  def apply(extend: js.Object => DetailButton, fn: DetailButton): TypeofDetailButton = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDetailButton]
  }
  
  @scala.inline
  implicit class TypeofDetailButtonMutableBuilder[Self <: TypeofDetailButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => DetailButton): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: DetailButton): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
