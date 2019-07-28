package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPdfExportEvent extends GridEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object GridPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    promise: JQueryPromise[_] = null
  ): GridPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[GridPdfExportEvent]
  }
}

