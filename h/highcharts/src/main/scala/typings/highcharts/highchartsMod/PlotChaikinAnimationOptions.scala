package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotChaikinAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotChaikinAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotChaikinAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotChaikinAnimationOptions]
  }
}

