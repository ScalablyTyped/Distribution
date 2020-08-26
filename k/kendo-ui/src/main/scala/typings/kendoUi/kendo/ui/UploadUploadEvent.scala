package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadUploadEvent extends UploadEvent {
  var XMLHttpRequest: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var files: js.UndefOr[js.Array[_]] = js.native
  var formData: js.UndefOr[js.Any] = js.native
}

object UploadUploadEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadUploadEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadUploadEvent]
  }
  @scala.inline
  implicit class UploadUploadEventOps[Self <: UploadUploadEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXMLHttpRequest(value: js.Any): Self = this.set("XMLHttpRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMLHttpRequest: Self = this.set("XMLHttpRequest", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[_]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
  }
  
}

