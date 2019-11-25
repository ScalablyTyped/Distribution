package typings.kendoDashUi.kendo.ui

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
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteAnimation]
  }
}

