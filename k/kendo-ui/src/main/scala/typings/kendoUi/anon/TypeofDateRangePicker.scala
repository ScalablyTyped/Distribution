package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DateRangePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDateRangePicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DateRangePicker
  
  /* static member */
  var fn: DateRangePicker
}
object TypeofDateRangePicker {
  
  @scala.inline
  def apply(extend: js.Object => DateRangePicker, fn: DateRangePicker): TypeofDateRangePicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateRangePicker]
  }
  
  @scala.inline
  implicit class TypeofDateRangePickerMutableBuilder[Self <: TypeofDateRangePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => DateRangePicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: DateRangePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
