package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegendItemHoverEvent extends ChartEvent {
  var element: js.UndefOr[js.Any] = js.native
  var pointIndex: js.UndefOr[Double] = js.native
  var series: js.UndefOr[js.Any] = js.native
  var seriesIndex: js.UndefOr[Double] = js.native
  var text: js.UndefOr[String] = js.native
}

object ChartLegendItemHoverEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartLegendItemHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendItemHoverEvent]
  }
  @scala.inline
  implicit class ChartLegendItemHoverEventOps[Self <: ChartLegendItemHoverEvent] (val x: Self) extends AnyVal {
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
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setPointIndex(value: Double): Self = this.set("pointIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointIndex: Self = this.set("pointIndex", js.undefined)
    @scala.inline
    def setSeries(value: js.Any): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

