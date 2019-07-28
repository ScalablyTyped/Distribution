package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorSeriesMarkerOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object NavigatorSeriesMarkerOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): NavigatorSeriesMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[NavigatorSeriesMarkerOptions]
  }
}

