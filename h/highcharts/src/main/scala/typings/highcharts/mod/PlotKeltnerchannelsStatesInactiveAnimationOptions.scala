package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsStatesInactiveAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotKeltnerchannelsStatesInactiveAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotKeltnerchannelsStatesInactiveAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotKeltnerchannelsStatesInactiveAnimationOptions]
  }
}

