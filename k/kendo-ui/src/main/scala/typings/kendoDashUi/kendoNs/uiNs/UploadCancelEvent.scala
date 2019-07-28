package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadCancelEvent extends UploadEvent {
  var files: js.UndefOr[js.Array[_]] = js.undefined
}

object UploadCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Upload,
    files: js.Array[_] = null
  ): UploadCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[UploadCancelEvent]
  }
}

