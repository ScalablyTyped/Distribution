package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotGanttAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotGanttAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotGanttAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotGanttAnimationOptions]
  }
}

