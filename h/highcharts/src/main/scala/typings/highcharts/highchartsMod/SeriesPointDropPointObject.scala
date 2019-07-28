package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPointDropPointObject extends js.Object {
  /**
    * New values.
    */
  var newValues: Dictionary[Double]
  /**
    * Dragged point.
    */
  var point: Point
}

object SeriesPointDropPointObject {
  @scala.inline
  def apply(newValues: Dictionary[Double], point: Point): SeriesPointDropPointObject = {
    val __obj = js.Dynamic.literal(newValues = newValues, point = point)
  
    __obj.asInstanceOf[SeriesPointDropPointObject]
  }
}

