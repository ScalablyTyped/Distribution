package typings.kendoUi.kendo.ui

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerPdfExportEvent extends SchedulerEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.native
}

object SchedulerPdfExportEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Scheduler): SchedulerPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerPdfExportEvent]
  }
  @scala.inline
  implicit class SchedulerPdfExportEventOps[Self <: SchedulerPdfExportEvent] (val x: Self) extends AnyVal {
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
    def setPromise(value: JQueryPromise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
  }
  
}

