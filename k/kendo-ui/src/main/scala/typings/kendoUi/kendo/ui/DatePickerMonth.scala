package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerMonth extends js.Object {
  
  var content: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[String] = js.native
  
  var weekNumber: js.UndefOr[String] = js.native
}
object DatePickerMonth {
  
  @scala.inline
  def apply(): DatePickerMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerMonth]
  }
  
  @scala.inline
  implicit class DatePickerMonthOps[Self <: DatePickerMonth] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: String): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
  }
}
