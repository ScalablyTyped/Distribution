package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSelectionAxisContextObject extends js.Object {
  /**
    * The selected Axis.
    */
  var axis: Axis
  /**
    * The maximum axis value, either automatic or set manually.
    */
  var max: Double
  /**
    * The minimum axis value, either automatic or set manually.
    */
  var min: Double
}

object ChartSelectionAxisContextObject {
  @scala.inline
  def apply(axis: Axis, max: Double, min: Double): ChartSelectionAxisContextObject = {
    val __obj = js.Dynamic.literal(axis = axis, max = max, min = min)
  
    __obj.asInstanceOf[ChartSelectionAxisContextObject]
  }
}

