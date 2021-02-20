package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditor extends StObject {
  
  var daily: js.UndefOr[SchedulerMessagesRecurrenceEditorDaily] = js.native
  
  var end: js.UndefOr[SchedulerMessagesRecurrenceEditorEnd] = js.native
  
  var frequencies: js.UndefOr[SchedulerMessagesRecurrenceEditorFrequencies] = js.native
  
  var monthly: js.UndefOr[SchedulerMessagesRecurrenceEditorMonthly] = js.native
  
  var offsetPositions: js.UndefOr[SchedulerMessagesRecurrenceEditorOffsetPositions] = js.native
  
  var recurrenceEditorTitle: js.UndefOr[String] = js.native
  
  var weekdays: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekdays] = js.native
  
  var weekly: js.UndefOr[SchedulerMessagesRecurrenceEditorWeekly] = js.native
  
  var yearly: js.UndefOr[SchedulerMessagesRecurrenceEditorYearly] = js.native
}
object SchedulerMessagesRecurrenceEditor {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditor]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorMutableBuilder[Self <: SchedulerMessagesRecurrenceEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaily(value: SchedulerMessagesRecurrenceEditorDaily): Self = StObject.set(x, "daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyUndefined: Self = StObject.set(x, "daily", js.undefined)
    
    @scala.inline
    def setEnd(value: SchedulerMessagesRecurrenceEditorEnd): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFrequencies(value: SchedulerMessagesRecurrenceEditorFrequencies): Self = StObject.set(x, "frequencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequenciesUndefined: Self = StObject.set(x, "frequencies", js.undefined)
    
    @scala.inline
    def setMonthly(value: SchedulerMessagesRecurrenceEditorMonthly): Self = StObject.set(x, "monthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyUndefined: Self = StObject.set(x, "monthly", js.undefined)
    
    @scala.inline
    def setOffsetPositions(value: SchedulerMessagesRecurrenceEditorOffsetPositions): Self = StObject.set(x, "offsetPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetPositionsUndefined: Self = StObject.set(x, "offsetPositions", js.undefined)
    
    @scala.inline
    def setRecurrenceEditorTitle(value: String): Self = StObject.set(x, "recurrenceEditorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceEditorTitleUndefined: Self = StObject.set(x, "recurrenceEditorTitle", js.undefined)
    
    @scala.inline
    def setWeekdays(value: SchedulerMessagesRecurrenceEditorWeekdays): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdaysUndefined: Self = StObject.set(x, "weekdays", js.undefined)
    
    @scala.inline
    def setWeekly(value: SchedulerMessagesRecurrenceEditorWeekly): Self = StObject.set(x, "weekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeklyUndefined: Self = StObject.set(x, "weekly", js.undefined)
    
    @scala.inline
    def setYearly(value: SchedulerMessagesRecurrenceEditorYearly): Self = StObject.set(x, "yearly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearlyUndefined: Self = StObject.set(x, "yearly", js.undefined)
  }
}
