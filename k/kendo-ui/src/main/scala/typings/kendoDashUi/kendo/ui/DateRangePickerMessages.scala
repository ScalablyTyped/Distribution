package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangePickerMessages extends js.Object {
  var endLabel: js.UndefOr[String] = js.undefined
  var startLabel: js.UndefOr[String] = js.undefined
}

object DateRangePickerMessages {
  @scala.inline
  def apply(endLabel: String = null, startLabel: String = null): DateRangePickerMessages = {
    val __obj = js.Dynamic.literal()
    if (endLabel != null) __obj.updateDynamic("endLabel")(endLabel.asInstanceOf[js.Any])
    if (startLabel != null) __obj.updateDynamic("startLabel")(startLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangePickerMessages]
  }
}

