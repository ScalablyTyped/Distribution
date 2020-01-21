package typings.kendoUi.kendo.ui

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
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Upload,
    XMLHttpRequest: js.Any = null,
    data: js.Any = null,
    files: js.Array[_] = null,
    formData: js.Any = null
  ): UploadUploadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (XMLHttpRequest != null) __obj.updateDynamic("XMLHttpRequest")(XMLHttpRequest.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadUploadEvent]
  }
}

