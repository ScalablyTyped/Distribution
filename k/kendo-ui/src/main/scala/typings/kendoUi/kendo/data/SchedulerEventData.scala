package typings.kendoUi.kendo.data

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerEventData extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[Date] = js.native
  
  var endTimezone: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var isAllDay: js.UndefOr[Boolean] = js.native
  
  var recurrenceException: js.UndefOr[String] = js.native
  
  var recurrenceId: js.UndefOr[js.Any] = js.native
  
  var recurrenceRule: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[Date] = js.native
  
  var startTimezone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SchedulerEventData {
  
  @scala.inline
  def apply(): SchedulerEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerEventData]
  }
  
  @scala.inline
  implicit class SchedulerEventDataOps[Self <: SchedulerEventData] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndTimezone(value: String): Self = this.set("endTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimezone: Self = this.set("endTimezone", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsAllDay(value: Boolean): Self = this.set("isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAllDay: Self = this.set("isAllDay", js.undefined)
    
    @scala.inline
    def setRecurrenceException(value: String): Self = this.set("recurrenceException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceException: Self = this.set("recurrenceException", js.undefined)
    
    @scala.inline
    def setRecurrenceId(value: js.Any): Self = this.set("recurrenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceId: Self = this.set("recurrenceId", js.undefined)
    
    @scala.inline
    def setRecurrenceRule(value: String): Self = this.set("recurrenceRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceRule: Self = this.set("recurrenceRule", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStartTimezone(value: String): Self = this.set("startTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimezone: Self = this.set("startTimezone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
