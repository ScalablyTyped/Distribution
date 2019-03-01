package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadClearEvent extends UploadEvent {
  var e: js.UndefOr[js.Any] = js.undefined
}

object UploadClearEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Upload,
    e: js.Any = null
  ): UploadClearEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (e != null) __obj.updateDynamic("e")(e)
    __obj.asInstanceOf[UploadClearEvent]
  }
}

