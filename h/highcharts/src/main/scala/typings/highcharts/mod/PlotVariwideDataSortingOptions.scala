package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVariwideDataSortingOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Enable or disable data sorting for the series.
    * Use xAxis.reversed to change the sorting order.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Whether to allow matching points by name in an
    * update. If this option is disabled, points will be matched by order.
    */
  var matchByName: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Determines what data value should be used to sort
    * by.
    */
  var sortKey: js.UndefOr[String] = js.undefined
}

object PlotVariwideDataSortingOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    matchByName: js.UndefOr[Boolean] = js.undefined,
    sortKey: String = null
  ): PlotVariwideDataSortingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(matchByName)) __obj.updateDynamic("matchByName")(matchByName.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVariwideDataSortingOptions]
  }
}

