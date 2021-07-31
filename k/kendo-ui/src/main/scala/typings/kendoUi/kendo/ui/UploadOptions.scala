package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOptions extends StObject {
  
  var async: js.UndefOr[UploadAsync] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ UploadCancelEvent, Unit]] = js.undefined
  
  var clear: js.UndefOr[js.Function1[/* e */ UploadClearEvent, Unit]] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* e */ UploadEvent, Unit]] = js.undefined
  
  var directory: js.UndefOr[Boolean] = js.undefined
  
  var directoryDrop: js.UndefOr[Boolean] = js.undefined
  
  var dropZone: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ UploadErrorEvent, Unit]] = js.undefined
  
  var files: js.UndefOr[js.Array[UploadFile]] = js.undefined
  
  var localization: js.UndefOr[UploadLocalization] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pause: js.UndefOr[js.Function1[/* e */ UploadPauseEvent, Unit]] = js.undefined
  
  var progress: js.UndefOr[js.Function1[/* e */ UploadProgressEvent, Unit]] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ UploadRemoveEvent, Unit]] = js.undefined
  
  var resume: js.UndefOr[js.Function1[/* e */ UploadEvent, Unit]] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ UploadSelectEvent, Unit]] = js.undefined
  
  var showFileList: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* e */ UploadSuccessEvent, Unit]] = js.undefined
  
  var template: js.UndefOr[String | js.Function] = js.undefined
  
  var upload: js.UndefOr[js.Function1[/* e */ UploadUploadEvent, Unit]] = js.undefined
  
  var validation: js.UndefOr[UploadValidation] = js.undefined
}
object UploadOptions {
  
  @scala.inline
  def apply(): UploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptions]
  }
  
  @scala.inline
  implicit class UploadOptionsMutableBuilder[Self <: UploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: UploadAsync): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ UploadCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setClear(value: /* e */ UploadClearEvent => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    @scala.inline
    def setComplete(value: /* e */ UploadEvent => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryDrop(value: Boolean): Self = StObject.set(x, "directoryDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryDropUndefined: Self = StObject.set(x, "directoryDrop", js.undefined)
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setDropZone(value: String): Self = StObject.set(x, "dropZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropZoneUndefined: Self = StObject.set(x, "dropZone", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ UploadErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[UploadFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: UploadFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setLocalization(value: UploadLocalization): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPause(value: /* e */ UploadPauseEvent => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setProgress(value: /* e */ UploadProgressEvent => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ UploadRemoveEvent => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setResume(value: /* e */ UploadEvent => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ UploadSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setShowFileList(value: Boolean): Self = StObject.set(x, "showFileList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFileListUndefined: Self = StObject.set(x, "showFileList", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* e */ UploadSuccessEvent => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | js.Function): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setUpload(value: /* e */ UploadUploadEvent => Unit): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    
    @scala.inline
    def setValidation(value: UploadValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
