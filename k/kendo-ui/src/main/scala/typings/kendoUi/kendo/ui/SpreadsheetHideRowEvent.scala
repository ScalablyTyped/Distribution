package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetHideRowEvent extends SpreadsheetEvent {
  var index: js.UndefOr[Double] = js.native
  var sheet: js.UndefOr[Sheet] = js.native
}

object SpreadsheetHideRowEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Spreadsheet): SpreadsheetHideRowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetHideRowEvent]
  }
  @scala.inline
  implicit class SpreadsheetHideRowEventOps[Self <: SpreadsheetHideRowEvent] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setSheet(value: Sheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
  }
  
}

