package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotCandlestickAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotCandlestickAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotCandlestickAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotCandlestickAnimationOptions]
  }
}

