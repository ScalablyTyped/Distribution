package typings.kendoDashUi.kendo.dataviz.ui

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
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerDefaultsMarkerTooltipAnimation]
  }
}

