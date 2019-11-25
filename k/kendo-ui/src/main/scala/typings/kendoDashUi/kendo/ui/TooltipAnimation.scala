package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipAnimation extends js.Object {
  var close: js.UndefOr[TooltipAnimationClose] = js.undefined
  var open: js.UndefOr[TooltipAnimationOpen] = js.undefined
}

object TooltipAnimation {
  @scala.inline
  def apply(close: TooltipAnimationClose = null, open: TooltipAnimationOpen = null): TooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipAnimation]
  }
}

