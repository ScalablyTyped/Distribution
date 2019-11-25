package typings.kendoDashUi.kendo.dataviz.ui

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
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerTooltipAnimation]
  }
}

