package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAdMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotAdMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotAdMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotAdMarkerStatesInactiveOptions]
  }
}

