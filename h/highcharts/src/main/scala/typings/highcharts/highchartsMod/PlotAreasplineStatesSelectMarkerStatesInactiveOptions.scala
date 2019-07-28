package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAreasplineStatesSelectMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotAreasplineStatesSelectMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotAreasplineStatesSelectMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotAreasplineStatesSelectMarkerStatesInactiveOptions]
  }
}

