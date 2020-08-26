package typings.kendoUi.kendo.dataviz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPlotAreaEvent extends js.Object {
  var preventDefault: js.Function = js.native
  var sender: ChartPlotArea = js.native
  def isDefaultPrevented(): Boolean = js.native
}

object ChartPlotAreaEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ChartPlotArea): ChartPlotAreaEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPlotAreaEvent]
  }
  @scala.inline
  implicit class ChartPlotAreaEventOps[Self <: ChartPlotAreaEvent] (val x: Self) extends AnyVal {
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
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: ChartPlotArea): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
  
}

