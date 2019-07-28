package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockPointOptionsObject extends js.Object {
  /**
    * x value for the point in xAxis scale or pixels
    */
  var x: Double
  /**
    * xAxis index or id
    */
  var xAxis: js.UndefOr[Double | String | Axis] = js.undefined
  /**
    * y value for the point in yAxis scale or pixels
    */
  var y: Double
  /**
    * yAxis index or id
    */
  var yAxis: js.Any
}

object MockPointOptionsObject {
  @scala.inline
  def apply(x: Double, y: Double, yAxis: js.Any, xAxis: Double | String | Axis = null): MockPointOptionsObject = {
    val __obj = js.Dynamic.literal(x = x, y = y, yAxis = yAxis)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockPointOptionsObject]
  }
}

