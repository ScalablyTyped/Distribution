package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateRangePickerMessages extends js.Object {
  var endLabel: js.UndefOr[String] = js.native
  var startLabel: js.UndefOr[String] = js.native
}

object DateRangePickerMessages {
  @scala.inline
  def apply(): DateRangePickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangePickerMessages]
  }
  @scala.inline
  implicit class DateRangePickerMessagesOps[Self <: DateRangePickerMessages] (val x: Self) extends AnyVal {
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
    def setEndLabel(value: String): Self = this.set("endLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLabel: Self = this.set("endLabel", js.undefined)
    @scala.inline
    def setStartLabel(value: String): Self = this.set("startLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLabel: Self = this.set("startLabel", js.undefined)
  }
  
}

