package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPdfExportEvent extends GridEvent {
  var promise: js.UndefOr[kendoDashUiLib.JQueryPromise[_]] = js.undefined
}

object GridPdfExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    promise: kendoDashUiLib.JQueryPromise[_] = null
  ): GridPdfExportEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (promise != null) __obj.updateDynamic("promise")(promise)
    __obj.asInstanceOf[GridPdfExportEvent]
  }
}

