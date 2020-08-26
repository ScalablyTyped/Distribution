package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadLocalization extends js.Object {
  var cancel: js.UndefOr[String] = js.native
  var clearSelectedFiles: js.UndefOr[String] = js.native
  var dropFilesHere: js.UndefOr[String] = js.native
  var headerStatusUploaded: js.UndefOr[String] = js.native
  var headerStatusUploading: js.UndefOr[String] = js.native
  var invalidFileExtension: js.UndefOr[String] = js.native
  var invalidFiles: js.UndefOr[String] = js.native
  var invalidMaxFileSize: js.UndefOr[String] = js.native
  var invalidMinFileSize: js.UndefOr[String] = js.native
  var remove: js.UndefOr[String] = js.native
  var retry: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var statusFailed: js.UndefOr[String] = js.native
  var statusUploaded: js.UndefOr[String] = js.native
  var statusUploading: js.UndefOr[String] = js.native
  var uploadFail: js.UndefOr[String] = js.native
  var uploadSelectedFiles: js.UndefOr[String] = js.native
  var uploadSuccess: js.UndefOr[String] = js.native
}

object UploadLocalization {
  @scala.inline
  def apply(): UploadLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadLocalization]
  }
  @scala.inline
  implicit class UploadLocalizationOps[Self <: UploadLocalization] (val x: Self) extends AnyVal {
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setClearSelectedFiles(value: String): Self = this.set("clearSelectedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearSelectedFiles: Self = this.set("clearSelectedFiles", js.undefined)
    @scala.inline
    def setDropFilesHere(value: String): Self = this.set("dropFilesHere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropFilesHere: Self = this.set("dropFilesHere", js.undefined)
    @scala.inline
    def setHeaderStatusUploaded(value: String): Self = this.set("headerStatusUploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStatusUploaded: Self = this.set("headerStatusUploaded", js.undefined)
    @scala.inline
    def setHeaderStatusUploading(value: String): Self = this.set("headerStatusUploading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStatusUploading: Self = this.set("headerStatusUploading", js.undefined)
    @scala.inline
    def setInvalidFileExtension(value: String): Self = this.set("invalidFileExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidFileExtension: Self = this.set("invalidFileExtension", js.undefined)
    @scala.inline
    def setInvalidFiles(value: String): Self = this.set("invalidFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidFiles: Self = this.set("invalidFiles", js.undefined)
    @scala.inline
    def setInvalidMaxFileSize(value: String): Self = this.set("invalidMaxFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidMaxFileSize: Self = this.set("invalidMaxFileSize", js.undefined)
    @scala.inline
    def setInvalidMinFileSize(value: String): Self = this.set("invalidMinFileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidMinFileSize: Self = this.set("invalidMinFileSize", js.undefined)
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setRetry(value: String): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setStatusFailed(value: String): Self = this.set("statusFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusFailed: Self = this.set("statusFailed", js.undefined)
    @scala.inline
    def setStatusUploaded(value: String): Self = this.set("statusUploaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusUploaded: Self = this.set("statusUploaded", js.undefined)
    @scala.inline
    def setStatusUploading(value: String): Self = this.set("statusUploading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusUploading: Self = this.set("statusUploading", js.undefined)
    @scala.inline
    def setUploadFail(value: String): Self = this.set("uploadFail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadFail: Self = this.set("uploadFail", js.undefined)
    @scala.inline
    def setUploadSelectedFiles(value: String): Self = this.set("uploadSelectedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadSelectedFiles: Self = this.set("uploadSelectedFiles", js.undefined)
    @scala.inline
    def setUploadSuccess(value: String): Self = this.set("uploadSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadSuccess: Self = this.set("uploadSuccess", js.undefined)
  }
  
}

