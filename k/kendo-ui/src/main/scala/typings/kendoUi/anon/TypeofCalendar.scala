package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCalendar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Calendar
  
  /* static member */
  var fn: typings.kendoUi.kendo.ui.Calendar
}
object TypeofCalendar {
  
  inline def apply(extend: js.Object => typings.kendoUi.kendo.ui.Calendar, fn: typings.kendoUi.kendo.ui.Calendar): TypeofCalendar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCalendar] (val x: Self) extends AnyVal {
    
    inline def setExtend(value: js.Object => typings.kendoUi.kendo.ui.Calendar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: typings.kendoUi.kendo.ui.Calendar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
