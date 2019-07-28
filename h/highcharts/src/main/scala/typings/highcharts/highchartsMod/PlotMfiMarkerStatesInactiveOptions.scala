package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMfiMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotMfiMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotMfiMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotMfiMarkerStatesInactiveOptions]
  }
}

