package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.TimeDurationPicker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTimeDurationPicker extends StObject {
  
  /* static member */
  def extend(proto: js.Object): TimeDurationPicker
  
  /* static member */
  var fn: TimeDurationPicker
}
object TypeofTimeDurationPicker {
  
  inline def apply(extend: js.Object => TimeDurationPicker, fn: TimeDurationPicker): TypeofTimeDurationPicker = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTimeDurationPicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTimeDurationPicker] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => TimeDurationPicker): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: TimeDurationPicker): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
