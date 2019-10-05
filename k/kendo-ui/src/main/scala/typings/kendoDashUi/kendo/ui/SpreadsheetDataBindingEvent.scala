package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetDataBindingEvent extends SpreadsheetEvent {
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetDataBindingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    sheet: Sheet = null
  ): SpreadsheetDataBindingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetDataBindingEvent]
  }
}

