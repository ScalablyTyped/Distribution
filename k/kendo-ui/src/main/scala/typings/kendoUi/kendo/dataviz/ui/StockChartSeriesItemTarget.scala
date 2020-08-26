package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartSeriesItemTarget extends js.Object {
  var border: js.UndefOr[js.Function | StockChartSeriesItemTargetBorder] = js.native
  var color: js.UndefOr[String | js.Function] = js.native
  var line: js.UndefOr[StockChartSeriesItemTargetLine] = js.native
}

object StockChartSeriesItemTarget {
  @scala.inline
  def apply(): StockChartSeriesItemTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemTarget]
  }
  @scala.inline
  implicit class StockChartSeriesItemTargetOps[Self <: StockChartSeriesItemTarget] (val x: Self) extends AnyVal {
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
    def setBorder(value: js.Function | StockChartSeriesItemTargetBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String | js.Function): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLine(value: StockChartSeriesItemTargetLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

