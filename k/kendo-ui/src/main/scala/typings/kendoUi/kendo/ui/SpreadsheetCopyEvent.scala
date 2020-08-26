package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetCopyEvent extends SpreadsheetEvent {
  var range: js.UndefOr[Range] = js.native
}

object SpreadsheetCopyEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetCopyEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetCopyEvent]
  }
  @scala.inline
  implicit class SpreadsheetCopyEventOps[Self <: SpreadsheetCopyEvent] (val x: Self) extends AnyVal {
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
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

