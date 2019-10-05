package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerDefaultsTooltipAnimation extends js.Object {
  var close: js.UndefOr[MapMarkerDefaultsTooltipAnimationClose] = js.undefined
  var open: js.UndefOr[MapMarkerDefaultsTooltipAnimationOpen] = js.undefined
}

object MapMarkerDefaultsTooltipAnimation {
  @scala.inline
  def apply(
    close: MapMarkerDefaultsTooltipAnimationClose = null,
    open: MapMarkerDefaultsTooltipAnimationOpen = null
  ): MapMarkerDefaultsTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[MapMarkerDefaultsTooltipAnimation]
  }
}

