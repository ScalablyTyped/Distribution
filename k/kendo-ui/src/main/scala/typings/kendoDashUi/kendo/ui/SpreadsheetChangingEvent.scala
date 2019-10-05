package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.spreadsheet.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetChangingEvent extends SpreadsheetEvent {
  var changeType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object SpreadsheetChangingEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Spreadsheet,
    changeType: String = null,
    data: js.Any = null,
    range: Range = null
  ): SpreadsheetChangingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (changeType != null) __obj.updateDynamic("changeType")(changeType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SpreadsheetChangingEvent]
  }
}

