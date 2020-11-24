package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditorWeekdays extends js.Object {
  
  var day: js.UndefOr[String] = js.native
  
  var weekday: js.UndefOr[String] = js.native
  
  var weekend: js.UndefOr[String] = js.native
}
object SchedulerMessagesRecurrenceEditorWeekdays {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorWeekdays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorWeekdays]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorWeekdaysOps[Self <: SchedulerMessagesRecurrenceEditorWeekdays] (val x: Self) extends AnyVal {
    
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
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setWeekday(value: String): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekday: Self = this.set("weekday", js.undefined)
    
    @scala.inline
    def setWeekend(value: String): Self = this.set("weekend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekend: Self = this.set("weekend", js.undefined)
  }
}
