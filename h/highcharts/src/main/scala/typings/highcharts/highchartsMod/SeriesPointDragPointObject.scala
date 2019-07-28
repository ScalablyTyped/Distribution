package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointDragPointObject extends js.Object {
  /**
    * New values.
    */
  var newValues: Dictionary[Double]
  /**
    * Dragged point.
    */
  var point: Point
}

object SeriesPointDragPointObject {
  @scala.inline
  def apply(newValues: Dictionary[Double], point: Point): SeriesPointDragPointObject = {
    val __obj = js.Dynamic.literal(newValues = newValues, point = point)
  
    __obj.asInstanceOf[SeriesPointDragPointObject]
  }
}

