package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadUploadEvent extends UploadEvent {
  var XMLHttpRequest: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var formData: js.UndefOr[js.Any] = js.undefined
}

object UploadUploadEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Upload,
    XMLHttpRequest: js.Any = null,
    data: js.Any = null,
    files: js.Array[_] = null,
    formData: js.Any = null
  ): UploadUploadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (XMLHttpRequest != null) __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest)
    if (data != null) __obj.updateDynamic("data")(data)
    if (files != null) __obj.updateDynamic("files")(files)
    if (formData != null) __obj.updateDynamic("formData")(formData)
    __obj.asInstanceOf[UploadUploadEvent]
  }
}

