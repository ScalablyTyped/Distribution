package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditorMonthly extends StObject {
  
  var day: js.UndefOr[String] = js.undefined
  
  var interval: js.UndefOr[String] = js.undefined
  
  var repeatEvery: js.UndefOr[String] = js.undefined
  
  var repeatOn: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesRecurrenceEditorMonthly {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorMonthly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorMonthly]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorMonthlyMutableBuilder[Self <: SchedulerMessagesRecurrenceEditorMonthly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setRepeatEvery(value: String): Self = StObject.set(x, "repeatEvery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatEveryUndefined: Self = StObject.set(x, "repeatEvery", js.undefined)
    
    @scala.inline
    def setRepeatOn(value: String): Self = StObject.set(x, "repeatOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatOnUndefined: Self = StObject.set(x, "repeatOn", js.undefined)
  }
}
