package typings.highcharts.modulesParallelDashCoordinatesMod.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  /**
    * Flag used in parallel coordinates plot to check if chart has
    * ||-coords (parallel coords).
    */
  var hasParallelCoordinates: Boolean
}

object Chart {
  @scala.inline
  def apply(hasParallelCoordinates: Boolean): Chart = {
    val __obj = js.Dynamic.literal(hasParallelCoordinates = hasParallelCoordinates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Chart]
  }
}

