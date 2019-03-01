package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimePickerAnimation extends js.Object {
  var close: js.UndefOr[DateTimePickerAnimationClose] = js.undefined
  var open: js.UndefOr[DateTimePickerAnimationOpen] = js.undefined
}

object DateTimePickerAnimation {
  @scala.inline
  def apply(close: DateTimePickerAnimationClose = null, open: DateTimePickerAnimationOpen = null): DateTimePickerAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[DateTimePickerAnimation]
  }
}

