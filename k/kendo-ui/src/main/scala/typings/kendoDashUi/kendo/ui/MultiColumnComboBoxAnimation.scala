package typings.kendoDashUi.kendo.ui

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
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxAnimation]
  }
}

