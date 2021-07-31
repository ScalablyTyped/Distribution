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
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorWeekdays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekdays]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorWeekdaysMutableBuilder[Self <: SchedulerMessagesRecurrenceEditorWeekdays] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    @scala.inline
    def setWeekend(value: String): Self = StObject.set(x, "weekend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekendUndefined: Self = StObject.set(x, "weekend", js.undefined)
  }
}
