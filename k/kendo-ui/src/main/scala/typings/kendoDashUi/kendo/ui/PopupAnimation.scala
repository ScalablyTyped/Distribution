package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupAnimation extends js.Object {
  var close: js.UndefOr[PopupAnimationClose] = js.undefined
  var open: js.UndefOr[PopupAnimationOpen] = js.undefined
}

object PopupAnimation {
  @scala.inline
  def apply(close: PopupAnimationClose = null, open: PopupAnimationOpen = null): PopupAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupAnimation]
  }
}

