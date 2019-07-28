package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNatrAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotNatrAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotNatrAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNatrAnimationOptions]
  }
}

