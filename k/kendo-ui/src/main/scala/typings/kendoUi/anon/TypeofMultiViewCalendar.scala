package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.MultiViewCalendar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMultiViewCalendar extends StObject {
  
  /* static member */
  def extend(proto: js.Object): MultiViewCalendar = js.native
  
  /* static member */
  var fn: MultiViewCalendar = js.native
}
object TypeofMultiViewCalendar {
  
  @scala.inline
  def apply(extend: js.Object => MultiViewCalendar, fn: MultiViewCalendar): TypeofMultiViewCalendar = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMultiViewCalendar]
  }
  
  @scala.inline
  implicit class TypeofMultiViewCalendarMutableBuilder[Self <: TypeofMultiViewCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => MultiViewCalendar): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: MultiViewCalendar): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
