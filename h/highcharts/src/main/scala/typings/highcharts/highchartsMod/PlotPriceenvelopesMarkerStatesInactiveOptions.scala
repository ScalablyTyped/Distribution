package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesMarkerStatesInactiveOptions extends js.Object {
  /**
    * (Highstock) Opacity of inactive markers.
    */
  var opacity: js.UndefOr[js.Any] = js.undefined
}

object PlotPriceenvelopesMarkerStatesInactiveOptions {
  @scala.inline
  def apply(opacity: js.Any = null): PlotPriceenvelopesMarkerStatesInactiveOptions = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    __obj.asInstanceOf[PlotPriceenvelopesMarkerStatesInactiveOptions]
  }
}

