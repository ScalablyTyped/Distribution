package typings.highcharts.highchartsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSelectionContextObject extends Event {
  /**
    * Arrays containing the axes of each dimension and each axis' min and max
    * values.
    */
  var xAxis: js.Array[ChartSelectionAxisContextObject] = js.native
  /**
    * Arrays containing the axes of each dimension and each axis' min and max
    * values.
    */
  var yAxis: js.Array[ChartSelectionAxisContextObject] = js.native
}

