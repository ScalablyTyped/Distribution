package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerPdfExportEvent extends SchedulerEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object SchedulerPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Scheduler,
    promise: JQueryPromise[_] = null
  ): SchedulerPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[SchedulerPdfExportEvent]
  }
}

