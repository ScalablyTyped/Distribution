package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItemTargetLine extends js.Object {
  var width: js.UndefOr[Double | js.Function] = js.native
}

object ChartSeriesItemTargetLine {
  @scala.inline
  def apply(): ChartSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemTargetLine]
  }
  @scala.inline
  implicit class ChartSeriesItemTargetLineOps[Self <: ChartSeriesItemTargetLine] (val x: Self) extends AnyVal {
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
    def setWidth(value: Double | js.Function): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

