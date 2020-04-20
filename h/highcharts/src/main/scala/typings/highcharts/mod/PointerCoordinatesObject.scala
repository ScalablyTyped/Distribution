package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerCoordinatesObject extends js.Object {
  var chartX: Double
  var chartY: Double
}

object PointerCoordinatesObject {
  @scala.inline
  def apply(chartX: Double, chartY: Double): PointerCoordinatesObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerCoordinatesObject]
  }
}

