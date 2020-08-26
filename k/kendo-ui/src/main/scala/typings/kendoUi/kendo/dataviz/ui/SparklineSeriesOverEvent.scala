package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineSeriesOverEvent extends SparklineEvent {
  var category: js.UndefOr[js.Any] = js.native
  var dataItem: js.UndefOr[js.Any] = js.native
  var element: js.UndefOr[js.Any] = js.native
  var originalEvent: js.UndefOr[js.Any] = js.native
  var percentage: js.UndefOr[js.Any] = js.native
  var series: js.UndefOr[SparklineSeriesOverEventSeries] = js.native
  var stackValue: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object SparklineSeriesOverEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sparkline): SparklineSeriesOverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesOverEvent]
  }
  @scala.inline
  implicit class SparklineSeriesOverEventOps[Self <: SparklineSeriesOverEvent] (val x: Self) extends AnyVal {
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
    def setCategory(value: js.Any): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDataItem(value: js.Any): Self = this.set("dataItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataItem: Self = this.set("dataItem", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    @scala.inline
    def setPercentage(value: js.Any): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    @scala.inline
    def setSeries(value: SparklineSeriesOverEventSeries): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setStackValue(value: js.Any): Self = this.set("stackValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackValue: Self = this.set("stackValue", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

