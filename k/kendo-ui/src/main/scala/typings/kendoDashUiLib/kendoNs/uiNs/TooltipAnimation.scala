package typings
package kendoDashUiLib.kendoNs.uiNs

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
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[TooltipAnimation]
  }
}

