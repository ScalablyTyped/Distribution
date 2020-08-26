package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerCoordinatesObject extends js.Object {
  var chartX: Double = js.native
  var chartY: Double = js.native
}

object PointerCoordinatesObject {
  @scala.inline
  def apply(chartX: Double, chartY: Double): PointerCoordinatesObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerCoordinatesObject]
  }
  @scala.inline
  implicit class PointerCoordinatesObjectOps[Self <: PointerCoordinatesObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChartX(value: Double): Self = this.set("chartX", value.asInstanceOf[js.Any])
    @scala.inline
    def setChartY(value: Double): Self = this.set("chartY", value.asInstanceOf[js.Any])
  }
  
}

