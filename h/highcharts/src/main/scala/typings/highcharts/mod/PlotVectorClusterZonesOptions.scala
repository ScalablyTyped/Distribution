package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVectorClusterZonesOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Styled mode only. A custom class name for the
    * zone.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highmaps) The value where the zone starts.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highmaps) Settings for the cluster marker belonging to the
    * zone.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  /**
    * (Highcharts, Highmaps) The value where the zone ends.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PlotVectorClusterZonesOptions {
  @scala.inline
  def apply(
    className: String = null,
    from: js.UndefOr[Double] = js.undefined,
    marker: PointMarkerOptionsObject = null,
    to: js.UndefOr[Double] = js.undefined
  ): PlotVectorClusterZonesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVectorClusterZonesOptions]
  }
}

