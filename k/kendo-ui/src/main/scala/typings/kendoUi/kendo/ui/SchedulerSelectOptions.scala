package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerSelectOptions extends js.Object {
  
  var end: js.UndefOr[Date] = js.native
  
  var events: js.UndefOr[js.Array[_ | SchedulerEvent]] = js.native
  
  var isAllDay: js.UndefOr[Boolean] = js.native
  
  var resources: js.UndefOr[js.Array[_]] = js.native
  
  var start: js.UndefOr[Date] = js.native
}
object SchedulerSelectOptions {
  
  @scala.inline
  def apply(): SchedulerSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerSelectOptions]
  }
  
  @scala.inline
  implicit class SchedulerSelectOptionsOps[Self <: SchedulerSelectOptions] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (js.Any | SchedulerEvent)*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[_ | SchedulerEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setIsAllDay(value: Boolean): Self = this.set("isAllDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAllDay: Self = this.set("isAllDay", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: js.Any*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[_]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
}
