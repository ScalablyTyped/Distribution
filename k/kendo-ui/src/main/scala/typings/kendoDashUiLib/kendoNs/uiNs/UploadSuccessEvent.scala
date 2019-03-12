package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSuccessEvent extends UploadEvent {
  var XMLHttpRequest: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var operation: js.UndefOr[java.lang.String] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
}

object UploadSuccessEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Upload,
    XMLHttpRequest: js.Any = null,
    files: js.Array[_] = null,
    operation: java.lang.String = null,
    response: js.Any = null
  ): UploadSuccessEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (XMLHttpRequest != null) __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest)
    if (files != null) __obj.updateDynamic("files")(files)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[UploadSuccessEvent]
  }
}

