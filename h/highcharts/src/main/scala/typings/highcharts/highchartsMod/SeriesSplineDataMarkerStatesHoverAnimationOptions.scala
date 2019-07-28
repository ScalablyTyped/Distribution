package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesSplineDataMarkerStatesHoverAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesSplineDataMarkerStatesHoverAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): SeriesSplineDataMarkerStatesHoverAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesSplineDataMarkerStatesHoverAnimationOptions]
  }
}

