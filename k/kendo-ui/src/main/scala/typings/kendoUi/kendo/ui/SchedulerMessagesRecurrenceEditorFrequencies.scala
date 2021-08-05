package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditorFrequencies extends StObject {
  
  var daily: js.UndefOr[String] = js.undefined
  
  var monthly: js.UndefOr[String] = js.undefined
  
  var never: js.UndefOr[String] = js.undefined
  
  var weekly: js.UndefOr[String] = js.undefined
  
  var yearly: js.UndefOr[String] = js.undefined
}
object SchedulerMessagesRecurrenceEditorFrequencies {
  
  inline def apply(): SchedulerMessagesRecurrenceEditorFrequencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorFrequencies]
  }
  
  extension [Self <: SchedulerMessagesRecurrenceEditorFrequencies](x: Self) {
    
    inline def setDaily(value: String): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    inline def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
    
    inline def setMonthly(value: String): Self = StObject.set(x, "monthly", value.asInstanceOf[js.Any])
    
    inline def setMonthlyUndefined: Self = StObject.set(x, "monthly", js.undefined)
    
    inline def setNever(value: String): Self = StObject.set(x, "never", value.asInstanceOf[js.Any])
    
    inline def setNeverUndefined: Self = StObject.set(x, "never", js.undefined)
    
    inline def setWeekly(value: String): Self = StObject.set(x, "weekly", value.asInstanceOf[js.Any])
    
    inline def setWeeklyUndefined: Self = StObject.set(x, "weekly", js.undefined)
    
    inline def setYearly(value: String): Self = StObject.set(x, "yearly", value.asInstanceOf[js.Any])
    
    inline def setYearlyUndefined: Self = StObject.set(x, "yearly", js.undefined)
  }
}
