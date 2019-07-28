package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotApoStatesHoverAnimationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The duration of the hover animation in
    * milliseconds. By default the hover state animates quickly in, and slowly
    * back to normal.
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotApoStatesHoverAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotApoStatesHoverAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotApoStatesHoverAnimationOptions]
  }
}

