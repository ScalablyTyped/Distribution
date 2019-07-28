package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatter3dAnimationOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotScatter3dAnimationOptions {
  @scala.inline
  def apply(duration: Int | Double = null): PlotScatter3dAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScatter3dAnimationOptions]
  }
}

