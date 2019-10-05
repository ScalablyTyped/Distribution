package typings.kendoDashUi.kendo.ui

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
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DatePickerAnimation]
  }
}

