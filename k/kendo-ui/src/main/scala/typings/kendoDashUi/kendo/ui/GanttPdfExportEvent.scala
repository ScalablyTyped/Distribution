package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttPdfExportEvent extends GanttEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object GanttPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    promise: JQueryPromise[_] = null
  ): GanttPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[GanttPdfExportEvent]
  }
}

