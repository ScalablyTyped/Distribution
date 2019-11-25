package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridPdfExportEvent extends PivotGridEvent {
  var promise: js.UndefOr[JQueryPromise[_]] = js.undefined
}

object PivotGridPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PivotGrid,
    promise: JQueryPromise[_] = null
  ): PivotGridPdfExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridPdfExportEvent]
  }
}

