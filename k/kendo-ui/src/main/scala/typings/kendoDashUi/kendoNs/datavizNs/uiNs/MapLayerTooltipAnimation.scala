package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerTooltipAnimation extends js.Object {
  var close: js.UndefOr[MapLayerTooltipAnimationClose] = js.undefined
  var open: js.UndefOr[MapLayerTooltipAnimationOpen] = js.undefined
}

object MapLayerTooltipAnimation {
  @scala.inline
  def apply(close: MapLayerTooltipAnimationClose = null, open: MapLayerTooltipAnimationOpen = null): MapLayerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[MapLayerTooltipAnimation]
  }
}

