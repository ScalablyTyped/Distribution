package typings.jqueryFileupload

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryFileUploadChangeObject extends js.Object {
  var fileInput: js.UndefOr[JQuery] = js.native
  var fileInputClone: js.UndefOr[JQuery] = js.native
  var files: js.Array[File] = js.native
  var form: js.UndefOr[JQuery] = js.native
  var originalFiles: js.Array[File] = js.native
}

object JQueryFileUploadChangeObject {
  @scala.inline
  def apply(files: js.Array[File], originalFiles: js.Array[File]): JQueryFileUploadChangeObject = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalFiles = originalFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadChangeObject]
  }
  @scala.inline
  implicit class JQueryFileUploadChangeObjectOps[Self <: JQueryFileUploadChangeObject] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalFilesVarargs(value: File*): Self = this.set("originalFiles", js.Array(value :_*))
    @scala.inline
    def setOriginalFiles(value: js.Array[File]): Self = this.set("originalFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileInput(value: JQuery): Self = this.set("fileInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileInput: Self = this.set("fileInput", js.undefined)
    @scala.inline
    def setFileInputClone(value: JQuery): Self = this.set("fileInputClone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileInputClone: Self = this.set("fileInputClone", js.undefined)
    @scala.inline
    def setForm(value: JQuery): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
  }
  
}

