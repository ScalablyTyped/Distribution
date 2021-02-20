package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditorFrequencies extends StObject {
  
  var daily: js.UndefOr[String] = js.native
  
  var monthly: js.UndefOr[String] = js.native
  
  var never: js.UndefOr[String] = js.native
  
  var weekly: js.UndefOr[String] = js.native
  
  var yearly: js.UndefOr[String] = js.native
}
object SchedulerMessagesRecurrenceEditorFrequencies {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorFrequencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorFrequencies]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorFrequenciesMutableBuilder[Self <: SchedulerMessagesRecurrenceEditorFrequencies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaily(value: String): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
    
    @scala.inline
    def setMonthly(value: String): Self = StObject.set(x, "monthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyUndefined: Self = StObject.set(x, "monthly", js.undefined)
    
    @scala.inline
    def setNever(value: String): Self = StObject.set(x, "never", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverUndefined: Self = StObject.set(x, "never", js.undefined)
    
    @scala.inline
    def setWeekly(value: String): Self = StObject.set(x, "weekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyUndefined: Self = StObject.set(x, "weekly", js.undefined)
    
    @scala.inline
    def setYearly(value: String): Self = StObject.set(x, "yearly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearlyUndefined: Self = StObject.set(x, "yearly", js.undefined)
  }
}
