package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxAnimation extends js.Object {
  var close: js.UndefOr[MultiColumnComboBoxAnimationClose] = js.undefined
  var open: js.UndefOr[MultiColumnComboBoxAnimationOpen] = js.undefined
}

object MultiColumnComboBoxAnimation {
  @scala.inline
  def apply(close: MultiColumnComboBoxAnimationClose = null, open: MultiColumnComboBoxAnimationOpen = null): MultiColumnComboBoxAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[MultiColumnComboBoxAnimation]
  }
}

