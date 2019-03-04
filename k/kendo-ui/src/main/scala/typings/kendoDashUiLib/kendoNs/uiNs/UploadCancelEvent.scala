package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadCancelEvent extends UploadEvent {
  var files: js.UndefOr[js.Array[_]] = js.undefined
}

object UploadCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Upload,
    files: js.Array[_] = null
  ): UploadCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[UploadCancelEvent]
  }
}

