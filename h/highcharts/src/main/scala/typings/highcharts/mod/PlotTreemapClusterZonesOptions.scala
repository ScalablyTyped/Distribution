package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTreemapClusterZonesOptions extends js.Object {
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

object PlotTreemapClusterZonesOptions {
  @scala.inline
  def apply(
    className: String = null,
    from: Int | Double = null,
    marker: PointMarkerOptionsObject = null,
    to: Int | Double = null
  ): PlotTreemapClusterZonesOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTreemapClusterZonesOptions]
  }
}

