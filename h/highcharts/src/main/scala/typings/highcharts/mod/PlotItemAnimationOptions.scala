package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotItemAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotItemAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotItemAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotItemAnimationOptions]
  }
}

