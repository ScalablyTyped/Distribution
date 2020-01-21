package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointDragDropObject extends js.Object {
  /**
    * New values.
    */
  var newValues: Dictionary[Double]
  /**
    * Updated point.
    */
  var point: Point
}

object PointDragDropObject {
  @scala.inline
  def apply(newValues: Dictionary[Double], point: Point): PointDragDropObject = {
    val __obj = js.Dynamic.literal(newValues = newValues.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PointDragDropObject]
  }
}

