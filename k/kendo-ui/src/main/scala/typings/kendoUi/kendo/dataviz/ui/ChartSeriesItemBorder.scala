package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItemBorder extends js.Object {
  var color: js.UndefOr[String | js.Function] = js.native
  var dashType: js.UndefOr[String | js.Function] = js.native
  var opacity: js.UndefOr[Double | js.Function] = js.native
  var width: js.UndefOr[Double | js.Function] = js.native
}

object ChartSeriesItemBorder {
  @scala.inline
  def apply(): ChartSeriesItemBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemBorder]
  }
  @scala.inline
  implicit class ChartSeriesItemBorderOps[Self <: ChartSeriesItemBorder] (val x: Self) extends AnyVal {
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
    def setColor(value: String | js.Function): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDashType(value: String | js.Function): Self = this.set("dashType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashType: Self = this.set("dashType", js.undefined)
    @scala.inline
    def setOpacity(value: Double | js.Function): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setWidth(value: Double | js.Function): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

