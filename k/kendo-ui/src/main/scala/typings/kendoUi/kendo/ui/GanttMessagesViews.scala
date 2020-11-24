package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttMessagesViews extends js.Object {
  
  var day: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var month: js.UndefOr[String] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var week: js.UndefOr[String] = js.native
  
  var year: js.UndefOr[String] = js.native
}
object GanttMessagesViews {
  
  @scala.inline
  def apply(): GanttMessagesViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttMessagesViews]
  }
  
  @scala.inline
  implicit class GanttMessagesViewsOps[Self <: GanttMessagesViews] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setWeek(value: String): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
