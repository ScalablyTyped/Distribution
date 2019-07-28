package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPpoStatesHoverMarkerStatesHoverAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotPpoStatesHoverMarkerStatesHoverAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotPpoStatesHoverMarkerStatesHoverAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPpoStatesHoverMarkerStatesHoverAnimationOptions]
  }
}

