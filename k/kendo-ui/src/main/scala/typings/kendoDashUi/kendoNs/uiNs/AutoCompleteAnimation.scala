package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteAnimation extends js.Object {
  var close: js.UndefOr[AutoCompleteAnimationClose] = js.undefined
  var open: js.UndefOr[AutoCompleteAnimationOpen] = js.undefined
}

object AutoCompleteAnimation {
  @scala.inline
  def apply(close: AutoCompleteAnimationClose = null, open: AutoCompleteAnimationOpen = null): AutoCompleteAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[AutoCompleteAnimation]
  }
}

