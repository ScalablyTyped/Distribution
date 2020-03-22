package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedBubbleOptions_ extends js.Object {
  var dataLabels: js.UndefOr[PlotPackedBubbleDataLabelsOptions] = js.undefined
}

object PlotPackedBubbleOptions_ {
  @scala.inline
  def apply(dataLabels: PlotPackedBubbleDataLabelsOptions = null): PlotPackedBubbleOptions_ = {
    val __obj = js.Dynamic.literal()
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedBubbleOptions_]
  }
}

