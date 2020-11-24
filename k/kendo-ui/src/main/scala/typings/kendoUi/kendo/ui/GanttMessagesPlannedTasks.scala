package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttMessagesPlannedTasks extends js.Object {
  
  var days: js.UndefOr[String] = js.native
  
  var hours: js.UndefOr[String] = js.native
  
  var minutes: js.UndefOr[String] = js.native
  
  var offsetTooltipAdvanced: js.UndefOr[String] = js.native
  
  var offsetTooltipDelay: js.UndefOr[String] = js.native
  
  var seconds: js.UndefOr[String] = js.native
  
  var switchText: js.UndefOr[String] = js.native
}
object GanttMessagesPlannedTasks {
  
  @scala.inline
  def apply(): GanttMessagesPlannedTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesPlannedTasks]
  }
  
  @scala.inline
  implicit class GanttMessagesPlannedTasksOps[Self <: GanttMessagesPlannedTasks] (val x: Self) extends AnyVal {
    
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
    def setDays(value: String): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setHours(value: String): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: String): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setOffsetTooltipAdvanced(value: String): Self = this.set("offsetTooltipAdvanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetTooltipAdvanced: Self = this.set("offsetTooltipAdvanced", js.undefined)
    
    @scala.inline
    def setOffsetTooltipDelay(value: String): Self = this.set("offsetTooltipDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetTooltipDelay: Self = this.set("offsetTooltipDelay", js.undefined)
    
    @scala.inline
    def setSeconds(value: String): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setSwitchText(value: String): Self = this.set("switchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchText: Self = this.set("switchText", js.undefined)
  }
}
