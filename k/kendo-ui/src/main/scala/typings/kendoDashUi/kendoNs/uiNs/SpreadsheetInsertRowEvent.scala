package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.spreadsheetNs.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetInsertRowEvent extends SpreadsheetEvent {
  var index: js.UndefOr[Double] = js.undefined
  var sheet: js.UndefOr[Sheet] = js.undefined
}

object SpreadsheetInsertRowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    index: Int | Double = null,
    sheet: Sheet = null
  ): SpreadsheetInsertRowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[SpreadsheetInsertRowEvent]
  }
}

