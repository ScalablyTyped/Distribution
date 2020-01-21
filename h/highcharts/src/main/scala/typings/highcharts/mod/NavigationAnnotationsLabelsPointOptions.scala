package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationAnnotationsLabelsPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which xAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the xAxis array. If the option is not configured or the
    * axis is not found the point's x coordinate refers to the chart pixels.
    */
  var xAxis: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the point.
    * Units can be either in axis or chart pixel coordinates.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This number defines which yAxis
    * the point is connected to. It refers to either the axis id or the index
    * of the axis in the yAxis array. If the option is not configured or the
    * axis is not found the point's y coordinate refers to the chart pixels.
    */
  var yAxis: js.UndefOr[Double | String] = js.undefined
}

object NavigationAnnotationsLabelsPointOptions {
  @scala.inline
  def apply(
    x: Int | Double = null,
    xAxis: Double | String = null,
    y: Int | Double = null,
    yAxis: Double | String = null
  ): NavigationAnnotationsLabelsPointOptions = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAnnotationsLabelsPointOptions]
  }
}

