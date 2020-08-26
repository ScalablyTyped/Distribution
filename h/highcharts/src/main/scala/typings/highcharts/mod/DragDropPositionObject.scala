package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragDropPositionObject extends js.Object {
  /**
    * Chart x position
    */
  var chartX: Double = js.native
  /**
    * Chart y position
    */
  var chartY: Double = js.native
  /**
    * Drag and drop guide box.
    */
  var guideBox: js.UndefOr[BBoxObject] = js.native
  /**
    * Updated point data.
    */
  var points: Dictionary[Dictionary[Double]] = js.native
  /**
    * Delta of previous x position.
    */
  var prevdX: js.UndefOr[Double] = js.native
  /**
    * Delta of previous y position.
    */
  var prevdY: js.UndefOr[Double] = js.native
}

object DragDropPositionObject {
  @scala.inline
  def apply(chartX: Double, chartY: Double, points: Dictionary[Dictionary[Double]]): DragDropPositionObject = {
    val __obj = js.Dynamic.literal(chartX = chartX.asInstanceOf[js.Any], chartY = chartY.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragDropPositionObject]
  }
  @scala.inline
  implicit class DragDropPositionObjectOps[Self <: DragDropPositionObject] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPoints(value: Dictionary[Dictionary[Double]]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuideBox(value: BBoxObject): Self = this.set("guideBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuideBox: Self = this.set("guideBox", js.undefined)
    @scala.inline
    def setPrevdX(value: Double): Self = this.set("prevdX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevdX: Self = this.set("prevdX", js.undefined)
    @scala.inline
    def setPrevdY(value: Double): Self = this.set("prevdY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevdY: Self = this.set("prevdY", js.undefined)
  }
  
}

