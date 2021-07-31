package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditorDaily extends StObject {
  
  var interval: js.UndefOr[String] = js.undefined
  
  var repeatEvery: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesRecurrenceEditorDaily {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorDaily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorDaily]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorDailyMutableBuilder[Self <: SchedulerMessagesRecurrenceEditorDaily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setRepeatEvery(value: String): Self = StObject.set(x, "repeatEvery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatEveryUndefined: Self = StObject.set(x, "repeatEvery", js.undefined)
  }
}
