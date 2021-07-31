package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditorWeekly extends StObject {
  
  var interval: js.UndefOr[String] = js.undefined
  
  var repeatEvery: js.UndefOr[String] = js.undefined
  
  var repeatOn: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesRecurrenceEditorWeekly {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorWeekly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekly]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorWeeklyMutableBuilder[Self <: SchedulerMessagesRecurrenceEditorWeekly] (val x: Self) extends AnyVal {
    
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
