package typings.highcharts.highchartsMod

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
    val __obj = js.Dynamic.literal(axis = axis, value = value)
  
    __obj.asInstanceOf[PointerAxisCoordinateObject]
  }
}

