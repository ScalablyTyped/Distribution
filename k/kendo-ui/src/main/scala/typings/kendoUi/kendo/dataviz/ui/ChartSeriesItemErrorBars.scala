package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItemErrorBars extends js.Object {
  var color: js.UndefOr[String] = js.native
  var endCaps: js.UndefOr[Boolean] = js.native
  var line: js.UndefOr[ChartSeriesItemErrorBarsLine] = js.native
  var value: js.UndefOr[String | Double | js.Any | js.Function] = js.native
  var visual: js.UndefOr[js.Function] = js.native
  var xValue: js.UndefOr[String | Double | js.Any | js.Function] = js.native
  var yValue: js.UndefOr[String | Double | js.Any | js.Function] = js.native
}

object ChartSeriesItemErrorBars {
  @scala.inline
  def apply(): ChartSeriesItemErrorBars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemErrorBars]
  }
  @scala.inline
  implicit class ChartSeriesItemErrorBarsOps[Self <: ChartSeriesItemErrorBars] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEndCaps(value: Boolean): Self = this.set("endCaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndCaps: Self = this.set("endCaps", js.undefined)
    @scala.inline
    def setLine(value: ChartSeriesItemErrorBarsLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setValue(value: String | Double | js.Any | js.Function): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
    @scala.inline
    def setXValue(value: String | Double | js.Any | js.Function): Self = this.set("xValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXValue: Self = this.set("xValue", js.undefined)
    @scala.inline
    def setYValue(value: String | Double | js.Any | js.Function): Self = this.set("yValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYValue: Self = this.set("yValue", js.undefined)
  }
  
}

