package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationMockPointOptionsObject extends js.Object {
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
  var xAxis: js.UndefOr[Double | String | Null] = js.undefined
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
  var yAxis: js.UndefOr[Double | String | Null] = js.undefined
}

object AnnotationMockPointOptionsObject {
  @scala.inline
  def apply(
    x: js.UndefOr[Double] = js.undefined,
    xAxis: js.UndefOr[Null | Double | String] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    yAxis: js.UndefOr[Null | Double | String] = js.undefined
  ): AnnotationMockPointOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xAxis)) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxis)) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationMockPointOptionsObject]
  }
}

