package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadErrorEvent extends UploadEvent {
  var XMLHttpRequest: js.UndefOr[js.Any] = js.native
  var files: js.UndefOr[js.Array[_]] = js.native
  var operation: js.UndefOr[String] = js.native
}

object UploadErrorEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadErrorEvent]
  }
  @scala.inline
  implicit class UploadErrorEventOps[Self <: UploadErrorEvent] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: js.Any*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[_]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
  }
  
}

