package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsMarkerTooltipAnimation extends js.Object {
  var close: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimationClose] = js.undefined
  var open: js.UndefOr[MapLayerDefaultsMarkerTooltipAnimationOpen] = js.undefined
}

object MapLayerDefaultsMarkerTooltipAnimation {
  @scala.inline
  def apply(
    close: MapLayerDefaultsMarkerTooltipAnimationClose = null,
    open: MapLayerDefaultsMarkerTooltipAnimationOpen = null
  ): MapLayerDefaultsMarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipAnimation]
  }
}

