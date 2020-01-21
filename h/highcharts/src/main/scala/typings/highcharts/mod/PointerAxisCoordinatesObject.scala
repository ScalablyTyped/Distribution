package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerAxisCoordinatesObject extends js.Object {
  /**
    * Positions on the x-axis.
    */
  var xAxis: js.Array[PointerAxisCoordinateObject]
  /**
    * Positions on the y-axis.
    */
  var yAxis: js.Array[PointerAxisCoordinateObject]
}

object PointerAxisCoordinatesObject {
  @scala.inline
  def apply(xAxis: js.Array[PointerAxisCoordinateObject], yAxis: js.Array[PointerAxisCoordinateObject]): PointerAxisCoordinatesObject = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointerAxisCoordinatesObject]
  }
}

