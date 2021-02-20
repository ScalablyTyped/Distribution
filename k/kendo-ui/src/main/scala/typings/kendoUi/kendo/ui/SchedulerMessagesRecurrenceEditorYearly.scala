package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditorYearly extends StObject {
  
  var interval: js.UndefOr[String] = js.native
  
  var of: js.UndefOr[String] = js.native
  
  var repeatEvery: js.UndefOr[String] = js.native
  
  var repeatOn: js.UndefOr[String] = js.native
}
object SchedulerMessagesRecurrenceEditorYearly {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorYearly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorYearly]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorYearlyMutableBuilder[Self <: SchedulerMessagesRecurrenceEditorYearly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setOf(value: String): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
    
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
