package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerTooltipAnimation extends js.Object {
  var close: js.UndefOr[MapMarkerTooltipAnimationClose] = js.undefined
  var open: js.UndefOr[MapMarkerTooltipAnimationOpen] = js.undefined
}

object MapMarkerTooltipAnimation {
  @scala.inline
  def apply(close: MapMarkerTooltipAnimationClose = null, open: MapMarkerTooltipAnimationOpen = null): MapMarkerTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerTooltipAnimation]
  }
}

