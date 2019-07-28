package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotWilliamsrAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotWilliamsrAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotWilliamsrAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotWilliamsrAnimationOptions]
  }
}

