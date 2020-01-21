package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerAnimation extends js.Object {
  var close: js.UndefOr[DatePickerAnimationClose] = js.undefined
  var open: js.UndefOr[DatePickerAnimationOpen] = js.undefined
}

object DatePickerAnimation {
  @scala.inline
  def apply(close: DatePickerAnimationClose = null, open: DatePickerAnimationOpen = null): DatePickerAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAnimation]
  }
}

