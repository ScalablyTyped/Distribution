package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerMessagesRecurrenceEditor extends StObject {
  
  var daily: js.UndefOr[SchedulerMessagesRecurrenceEditorDaily] = js.undefined
  
  var end: js.UndefOr[SchedulerMessagesRecurrenceEditorEnd] = js.undefined
  
  var frequencies: js.UndefOr[SchedulerMessagesRecurrenceEditorFrequencies] = js.undefined
  
  var monthly: js.UndefOr[SchedulerMessagesRecurrenceEditorMonthly] = js.undefined
  
  var offsetPositions: js.UndefOr[SchedulerMessagesRecurrenceEditorOffsetPositions] = js.undefined
  
  var recurrenceEditorTitle: js.UndefOr[String] = js.undefined
  
  var weekdays: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekdays] = js.undefined
  
  var weekly: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekly] = js.undefined
  
  var yearly: js.UndefOr[SchedulerMessagesRecurrenceEditorYearly] = js.undefined
}
object SchedulerMessagesRecurrenceEditor {
  
  inline def apply(): SchedulerMessagesRecurrenceEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditor]
  }
  
  extension [Self <: SchedulerMessagesRecurrenceEditor](x: Self) {
    
    inline def setDaily(value: SchedulerMessagesRecurrenceEditorDaily): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    inline def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
    
    inline def setEnd(value: SchedulerMessagesRecurrenceEditorEnd): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFrequencies(value: SchedulerMessagesRecurrenceEditorFrequencies): Self = StObject.set(x, "frequencies", value.asInstanceOf[js.Any])
    
    inline def setFrequenciesUndefined: Self = StObject.set(x, "frequencies", js.undefined)
    
    inline def setMonthly(value: SchedulerMessagesRecurrenceEditorMonthly): Self = StObject.set(x, "monthly", value.asInstanceOf[js.Any])
    
    inline def setMonthlyUndefined: Self = StObject.set(x, "monthly", js.undefined)
    
    inline def setOffsetPositions(value: SchedulerMessagesRecurrenceEditorOffsetPositions): Self = StObject.set(x, "offsetPositions", value.asInstanceOf[js.Any])
    
    inline def setOffsetPositionsUndefined: Self = StObject.set(x, "offsetPositions", js.undefined)
    
    inline def setRecurrenceEditorTitle(value: String): Self = StObject.set(x, "recurrenceEditorTitle", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceEditorTitleUndefined: Self = StObject.set(x, "recurrenceEditorTitle", js.undefined)
    
    inline def setWeekdays(value: SchedulerMessagesRecurrenceEditorWeekdays): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    inline def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    inline def setWeekly(value: SchedulerMessagesRecurrenceEditorWeekly): Self = StObject.set(x, "weekly", value.asInstanceOf[js.Any])
    
    inline def setWeeklyUndefined: Self = StObject.set(x, "weekly", js.undefined)
    
    inline def setYearly(value: SchedulerMessagesRecurrenceEditorYearly): Self = StObject.set(x, "yearly", value.asInstanceOf[js.Any])
    
    inline def setYearlyUndefined: Self = StObject.set(x, "yearly", js.undefined)
  }
}
