package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartClickEvent
  extends stdLib.Event {
  /**
           * Array containing the axes of each dimension and each axis' value at the clicked spot
           */
  var xAxis: js.Array[AxisValueOptions] = js.native
  /**
           * Array containing the axes of each dimension and each axis' value at the clicked spot
           */
  var yAxis: js.Array[AxisValueOptions] = js.native
}

