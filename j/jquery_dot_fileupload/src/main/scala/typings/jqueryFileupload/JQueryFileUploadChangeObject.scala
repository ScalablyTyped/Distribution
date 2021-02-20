package typings.jqueryFileupload

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryFileUploadChangeObject extends StObject {
  
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
  implicit class JQueryFileUploadChangeObjectMutableBuilder[Self <: JQueryFileUploadChangeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileInput(value: JQuery): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputClone(value: JQuery): Self = StObject.set(x, "fileInputClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputCloneUndefined: Self = StObject.set(x, "fileInputClone", js.undefined)
    
    @scala.inline
    def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setForm(value: JQuery): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setOriginalFiles(value: js.Array[File]): Self = StObject.set(x, "originalFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalFilesVarargs(value: File*): Self = StObject.set(x, "originalFiles", js.Array(value :_*))
  }
}
