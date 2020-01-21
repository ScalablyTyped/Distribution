package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOhlcAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOhlcAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotOhlcAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOhlcAnimationOptions]
  }
}

