package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerAxisCoordinateObject extends js.Object {
  /**
    * Related axis.
    */
  var axis: Axis
  /**
    * Axis value.
    */
  var value: Double
}

object PointerAxisCoordinateObject {
  @scala.inline
  def apply(axis: Axis, value: Double): PointerAxisCoordinateObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointerAxisCoordinateObject]
  }
}

