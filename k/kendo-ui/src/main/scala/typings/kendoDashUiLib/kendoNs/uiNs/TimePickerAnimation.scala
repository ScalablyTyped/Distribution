package typings
package kendoDashUiLib.kendoNs.uiNs

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
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[TimePickerAnimation]
  }
}

