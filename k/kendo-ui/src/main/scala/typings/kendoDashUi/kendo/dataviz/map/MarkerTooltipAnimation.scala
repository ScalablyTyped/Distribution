package typings.kendoDashUi.kendo.dataviz.map

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
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerTooltipAnimation]
  }
}

