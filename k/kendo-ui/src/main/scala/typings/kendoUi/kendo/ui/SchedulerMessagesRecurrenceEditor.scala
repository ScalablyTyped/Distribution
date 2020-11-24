package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditor extends js.Object {
  
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
  implicit class SchedulerMessagesRecurrenceEditorOps[Self <: SchedulerMessagesRecurrenceEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDaily(value: SchedulerMessagesRecurrenceEditorDaily): Self = this.set("daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaily: Self = this.set("daily", js.undefined)
    
    @scala.inline
    def setEnd(value: SchedulerMessagesRecurrenceEditorEnd): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFrequencies(value: SchedulerMessagesRecurrenceEditorFrequencies): Self = this.set("frequencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencies: Self = this.set("frequencies", js.undefined)
    
    @scala.inline
    def setMonthly(value: SchedulerMessagesRecurrenceEditorMonthly): Self = this.set("monthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthly: Self = this.set("monthly", js.undefined)
    
    @scala.inline
    def setOffsetPositions(value: SchedulerMessagesRecurrenceEditorOffsetPositions): Self = this.set("offsetPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetPositions: Self = this.set("offsetPositions", js.undefined)
    
    @scala.inline
    def setRecurrenceEditorTitle(value: String): Self = this.set("recurrenceEditorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceEditorTitle: Self = this.set("recurrenceEditorTitle", js.undefined)
    
    @scala.inline
    def setWeekdays(value: SchedulerMessagesRecurrenceEditorWeekdays): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
    
    @scala.inline
    def setWeekly(value: SchedulerMessagesRecurrenceEditorWeekly): Self = this.set("weekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekly: Self = this.set("weekly", js.undefined)
    
    @scala.inline
    def setYearly(value: SchedulerMessagesRecurrenceEditorYearly): Self = this.set("yearly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearly: Self = this.set("yearly", js.undefined)
  }
}
