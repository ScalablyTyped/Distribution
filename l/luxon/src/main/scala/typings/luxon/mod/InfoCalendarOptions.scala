package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoCalendarOptions
  extends StObject
     with InfoUnitOptions {
  
  var outputCalendar: js.UndefOr[CalendarSystem] = js.undefined
}
object InfoCalendarOptions {
  
  @scala.inline
  def apply(): InfoCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoCalendarOptions]
  }
  
  @scala.inline
  implicit class InfoCalendarOptionsMutableBuilder[Self <: InfoCalendarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputCalendar(value: CalendarSystem): Self = StObject.set(x, "outputCalendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCalendarUndefined: Self = StObject.set(x, "outputCalendar", js.undefined)
  }
}
