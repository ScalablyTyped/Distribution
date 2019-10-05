package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadClearEvent extends UploadEvent {
  var e: js.UndefOr[js.Any] = js.undefined
}

object UploadClearEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload, e: js.Any = null): UploadClearEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (e != null) __obj.updateDynamic("e")(e)
    __obj.asInstanceOf[UploadClearEvent]
  }
}

