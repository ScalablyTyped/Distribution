package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxAnimation extends js.Object {
  var close: js.UndefOr[ComboBoxAnimationClose] = js.undefined
  var open: js.UndefOr[ComboBoxAnimationOpen] = js.undefined
}

object ComboBoxAnimation {
  @scala.inline
  def apply(close: ComboBoxAnimationClose = null, open: ComboBoxAnimationOpen = null): ComboBoxAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxAnimation]
  }
}

