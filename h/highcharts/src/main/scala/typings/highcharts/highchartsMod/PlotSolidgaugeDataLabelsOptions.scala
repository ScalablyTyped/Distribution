package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSolidgaugeDataLabelsOptions extends js.Object {
  var y: js.UndefOr[Double] = js.undefined
}

object PlotSolidgaugeDataLabelsOptions {
  @scala.inline
  def apply(y: Int | Double = null): PlotSolidgaugeDataLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSolidgaugeDataLabelsOptions]
  }
}

