package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatter3dStatesSelectAnimationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) The duration of the hover animation in
    * milliseconds. By default the hover state animates quickly in, and slowly
    * back to normal.
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotScatter3dStatesSelectAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotScatter3dStatesSelectAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatter3dStatesSelectAnimationOptions]
  }
}

