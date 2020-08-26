package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineDragEndEvent extends SparklineEvent {
  var axisRanges: js.UndefOr[js.Any] = js.native
  var originalEvent: js.UndefOr[js.Any] = js.native
}

object SparklineDragEndEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sparkline): SparklineDragEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineDragEndEvent]
  }
  @scala.inline
  implicit class SparklineDragEndEventOps[Self <: SparklineDragEndEvent] (val x: Self) extends AnyVal {
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
    def setAxisRanges(value: js.Any): Self = this.set("axisRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisRanges: Self = this.set("axisRanges", js.undefined)
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
  }
  
}

