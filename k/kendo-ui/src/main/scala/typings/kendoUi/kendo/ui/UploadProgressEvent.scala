package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadProgressEvent extends UploadEvent {
  var files: js.UndefOr[js.Array[_]] = js.native
  var percentComplete: js.UndefOr[Double] = js.native
}

object UploadProgressEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Upload): UploadProgressEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProgressEvent]
  }
  @scala.inline
  implicit class UploadProgressEventOps[Self <: UploadProgressEvent] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: js.Any*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[_]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
  }
  
}

