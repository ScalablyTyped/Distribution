package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSeriesMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotSeriesMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotSeriesMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotSeriesMarkerStatesInactiveOptions]
  }
}

