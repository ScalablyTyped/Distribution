package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DatePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDatePicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DatePicker
  
  /* static member */
  var fn: DatePicker
}
object TypeofDatePicker {
  
  inline def apply(extend: js.Object => DatePicker, fn: DatePicker): TypeofDatePicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDatePicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDatePicker] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => DatePicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: DatePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
