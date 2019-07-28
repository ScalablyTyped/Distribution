package typings.kendoDashUi.kendoNs.uiNs

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
    if (endLabel != null) __obj.updateDynamic("endLabel")(endLabel)
    if (startLabel != null) __obj.updateDynamic("startLabel")(startLabel)
    __obj.asInstanceOf[DateRangePickerMessages]
  }
}

