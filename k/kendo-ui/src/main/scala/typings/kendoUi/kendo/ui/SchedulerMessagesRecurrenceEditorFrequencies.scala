package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditorFrequencies extends js.Object {
  
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
  implicit class SchedulerMessagesRecurrenceEditorFrequenciesOps[Self <: SchedulerMessagesRecurrenceEditorFrequencies] (val x: Self) extends AnyVal {
    
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
    def setDaily(value: String): Self = this.set("daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaily: Self = this.set("daily", js.undefined)
    
    @scala.inline
    def setMonthly(value: String): Self = this.set("monthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthly: Self = this.set("monthly", js.undefined)
    
    @scala.inline
    def setNever(value: String): Self = this.set("never", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNever: Self = this.set("never", js.undefined)
    
    @scala.inline
    def setWeekly(value: String): Self = this.set("weekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekly: Self = this.set("weekly", js.undefined)
    
    @scala.inline
    def setYearly(value: String): Self = this.set("yearly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYearly: Self = this.set("yearly", js.undefined)
  }
}
