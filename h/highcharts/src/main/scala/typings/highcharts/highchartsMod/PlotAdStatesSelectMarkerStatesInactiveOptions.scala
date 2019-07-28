package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAdStatesSelectMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotAdStatesSelectMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotAdStatesSelectMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotAdStatesSelectMarkerStatesInactiveOptions]
  }
}

