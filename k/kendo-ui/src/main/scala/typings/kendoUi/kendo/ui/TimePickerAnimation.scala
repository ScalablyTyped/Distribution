package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerAnimation extends js.Object {
  var close: js.UndefOr[TimePickerAnimationClose] = js.undefined
  var open: js.UndefOr[TimePickerAnimationOpen] = js.undefined
}

object TimePickerAnimation {
  @scala.inline
  def apply(close: TimePickerAnimationClose = null, open: TimePickerAnimationOpen = null): TimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAnimation]
  }
}

