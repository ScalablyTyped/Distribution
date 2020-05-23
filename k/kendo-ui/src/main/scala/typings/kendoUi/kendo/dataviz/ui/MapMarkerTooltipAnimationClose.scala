package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerTooltipAnimationClose extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var effects: js.UndefOr[String] = js.undefined
}

object MapMarkerTooltipAnimationClose {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, effects: String = null): MapMarkerTooltipAnimationClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerTooltipAnimationClose]
  }
}

