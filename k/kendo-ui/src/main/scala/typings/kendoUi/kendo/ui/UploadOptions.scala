package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadOptions extends js.Object {
  
  var async: js.UndefOr[UploadAsync] = js.native
  
  var cancel: js.UndefOr[js.Function1[/* e */ UploadCancelEvent, Unit]] = js.native
  
  var clear: js.UndefOr[js.Function1[/* e */ UploadClearEvent, Unit]] = js.native
  
  var complete: js.UndefOr[js.Function1[/* e */ UploadEvent, Unit]] = js.native
  
  var directory: js.UndefOr[Boolean] = js.native
  
  var directoryDrop: js.UndefOr[Boolean] = js.native
  
  var dropZone: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[js.Function1[/* e */ UploadErrorEvent, Unit]] = js.native
  
  var files: js.UndefOr[js.Array[UploadFile]] = js.native
  
  var localization: js.UndefOr[UploadLocalization] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pause: js.UndefOr[js.Function1[/* e */ UploadPauseEvent, Unit]] = js.native
  
  var progress: js.UndefOr[js.Function1[/* e */ UploadProgressEvent, Unit]] = js.native
  
  var remove: js.UndefOr[js.Function1[/* e */ UploadRemoveEvent, Unit]] = js.native
  
  var resume: js.UndefOr[js.Function1[/* e */ UploadEvent, Unit]] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ UploadSelectEvent, Unit]] = js.native
  
  var showFileList: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[js.Function1[/* e */ UploadSuccessEvent, Unit]] = js.native
  
  var template: js.UndefOr[String | js.Function] = js.native
  
  var upload: js.UndefOr[js.Function1[/* e */ UploadUploadEvent, Unit]] = js.native
  
  var validation: js.UndefOr[UploadValidation] = js.native
}
object UploadOptions {
  
  @scala.inline
  def apply(): UploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptions]
  }
  
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: UploadAsync): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ UploadCancelEvent => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setClear(value: /* e */ UploadClearEvent => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setComplete(value: /* e */ UploadEvent => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDirectory(value: Boolean): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    
    @scala.inline
    def setDirectoryDrop(value: Boolean): Self = this.set("directoryDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryDrop: Self = this.set("directoryDrop", js.undefined)
    
    @scala.inline
    def setDropZone(value: String): Self = this.set("dropZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropZone: Self = this.set("dropZone", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ UploadErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: UploadFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[UploadFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setLocalization(value: UploadLocalization): Self = this.set("localization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalization: Self = this.set("localization", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPause(value: /* e */ UploadPauseEvent => Unit): Self = this.set("pause", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setProgress(value: /* e */ UploadProgressEvent => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ UploadRemoveEvent => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setResume(value: /* e */ UploadEvent => Unit): Self = this.set("resume", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResume: Self = this.set("resume", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ UploadSelectEvent => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setShowFileList(value: Boolean): Self = this.set("showFileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFileList: Self = this.set("showFileList", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* e */ UploadSuccessEvent => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setUpload(value: /* e */ UploadUploadEvent => Unit): Self = this.set("upload", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    
    @scala.inline
    def setValidation(value: UploadValidation): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidation: Self = this.set("validation", js.undefined)
  }
}
