package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.DateTimePicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDateTimePicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): DateTimePicker
  
  /* static member */
  var fn: DateTimePicker
}
object TypeofDateTimePicker {
  
  @scala.inline
  def apply(extend: js.Object => DateTimePicker, fn: DateTimePicker): TypeofDateTimePicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDateTimePicker]
  }
  
  @scala.inline
  implicit class TypeofDateTimePickerMutableBuilder[Self <: TypeofDateTimePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => DateTimePicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: DateTimePicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
