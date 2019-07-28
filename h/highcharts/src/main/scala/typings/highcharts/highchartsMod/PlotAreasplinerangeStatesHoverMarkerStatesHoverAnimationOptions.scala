package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplinerangeStatesHoverMarkerStatesHoverAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotAreasplinerangeStatesHoverMarkerStatesHoverAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotAreasplinerangeStatesHoverMarkerStatesHoverAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAreasplinerangeStatesHoverMarkerStatesHoverAnimationOptions]
  }
}

