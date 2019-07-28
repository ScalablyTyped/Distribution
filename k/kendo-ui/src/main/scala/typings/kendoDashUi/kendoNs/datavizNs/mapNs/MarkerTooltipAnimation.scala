package typings.kendoDashUi.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerTooltipAnimation extends js.Object {
  var close: js.UndefOr[MarkerTooltipAnimationClose] = js.undefined
  var open: js.UndefOr[MarkerTooltipAnimationOpen] = js.undefined
}

object MarkerTooltipAnimation {
  @scala.inline
  def apply(close: MarkerTooltipAnimationClose = null, open: MarkerTooltipAnimationOpen = null): MarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[MarkerTooltipAnimation]
  }
}

