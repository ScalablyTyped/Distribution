package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotItemMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highcharts) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotItemMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotItemMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotItemMarkerStatesInactiveOptions]
  }
}

