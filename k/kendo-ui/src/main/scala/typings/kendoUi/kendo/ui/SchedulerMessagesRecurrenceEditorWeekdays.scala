package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditorWeekdays extends StObject {
  
  var day: js.UndefOr[String] = js.undefined
  
  var weekday: js.UndefOr[String] = js.undefined
  
  var weekend: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesRecurrenceEditorWeekdays {
  
  inline def apply(): SchedulerMessagesRecurrenceEditorWeekdays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekdays]
  }
  
  extension [Self <: SchedulerMessagesRecurrenceEditorWeekdays](x: Self) {
    
    inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setWeekend(value: String): Self = StObject.set(x, "weekend", value.asInstanceOf[js.Any])
    
    inline def setWeekendUndefined: Self = StObject.set(x, "weekend", js.undefined)
  }
}
