package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetSelectSheetEvent extends SpreadsheetEvent {
  var sheet: js.UndefOr[Sheet] = js.native
}

object SpreadsheetSelectSheetEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetSelectSheetEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSelectSheetEvent]
  }
  @scala.inline
  implicit class SpreadsheetSelectSheetEventOps[Self <: SpreadsheetSelectSheetEvent] (val x: Self) extends AnyVal {
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
    def setSheet(value: Sheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
  }
  
}

