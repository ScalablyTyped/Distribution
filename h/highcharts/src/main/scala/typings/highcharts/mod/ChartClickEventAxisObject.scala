package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartClickEventAxisObject extends js.Object {
  /**
    * Axis at the clicked spot.
    */
  var axis: Axis
  /**
    * Axis value at the clicked spot.
    */
  var value: Double
}

object ChartClickEventAxisObject {
  @scala.inline
  def apply(axis: Axis, value: Double): ChartClickEventAxisObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartClickEventAxisObject]
  }
}

