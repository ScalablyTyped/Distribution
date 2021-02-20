package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCalendar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): typings.kendoUi.kendo.ui.Calendar = js.native
  
  /* static member */
  var fn: typings.kendoUi.kendo.ui.Calendar = js.native
}
object TypeofCalendar {
  
  @scala.inline
  def apply(extend: js.Object => typings.kendoUi.kendo.ui.Calendar, fn: typings.kendoUi.kendo.ui.Calendar): TypeofCalendar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCalendar]
  }
  
  @scala.inline
  implicit class TypeofCalendarMutableBuilder[Self <: TypeofCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => typings.kendoUi.kendo.ui.Calendar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: typings.kendoUi.kendo.ui.Calendar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
