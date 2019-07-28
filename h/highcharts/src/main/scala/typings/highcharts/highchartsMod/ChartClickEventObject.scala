package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartClickEventObject extends PointerEventObject {
  /**
    * Information about the x-axis on the clicked spot.
    */
  var xAxis: js.Array[ChartClickEventAxisObject] = js.native
  /**
    * Information about the y-axis on the clicked spot.
    */
  var yAxis: js.Array[ChartClickEventAxisObject] = js.native
  /**
    * Information about the z-axis on the clicked spot.
    */
  var zAxis: js.UndefOr[js.Array[ChartClickEventAxisObject]] = js.native
}

