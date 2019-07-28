package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAnimation extends js.Object {
  var close: js.UndefOr[WindowAnimationClose] = js.undefined
  var open: js.UndefOr[WindowAnimationOpen] = js.undefined
}

object WindowAnimation {
  @scala.inline
  def apply(close: WindowAnimationClose = null, open: WindowAnimationOpen = null): WindowAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[WindowAnimation]
  }
}

