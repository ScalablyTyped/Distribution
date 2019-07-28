package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotZigzagAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotZigzagAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotZigzagAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotZigzagAnimationOptions]
  }
}

