package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadSuccessEvent extends UploadEvent {
  var XMLHttpRequest: js.UndefOr[js.Any] = js.undefined
  var files: js.UndefOr[js.Array[_]] = js.undefined
  var operation: js.UndefOr[String] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
}

object UploadSuccessEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Upload,
    XMLHttpRequest: js.Any = null,
    files: js.Array[_] = null,
    operation: String = null,
    response: js.Any = null
  ): UploadSuccessEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (XMLHttpRequest != null) __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSuccessEvent]
  }
}

