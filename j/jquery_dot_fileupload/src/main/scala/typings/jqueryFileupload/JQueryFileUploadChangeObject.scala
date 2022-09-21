package typings.jqueryFileupload

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFileUploadChangeObject extends StObject {
  
  var fileInput: js.UndefOr[JQuery] = js.undefined
  
  var fileInputClone: js.UndefOr[JQuery] = js.undefined
  
  var files: js.Array[File]
  
  var form: js.UndefOr[JQuery] = js.undefined
  
  var originalFiles: js.Array[File]
}
object JQueryFileUploadChangeObject {
  
  inline def apply(files: js.Array[File], originalFiles: js.Array[File]): JQueryFileUploadChangeObject = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], originalFiles = originalFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadChangeObject]
  }
  
  extension [Self <: JQueryFileUploadChangeObject](x: Self) {
    
    inline def setFileInput(value: JQuery): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
    
    inline def setFileInputClone(value: JQuery): Self = StObject.set(x, "fileInputClone", value.asInstanceOf[js.Any])
    
    inline def setFileInputCloneUndefined: Self = StObject.set(x, "fileInputClone", js.undefined)
    
    inline def setFileInputUndefined: Self = StObject.set(x, "fileInput", js.undefined)
    
    inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setForm(value: JQuery): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setOriginalFiles(value: js.Array[File]): Self = StObject.set(x, "originalFiles", value.asInstanceOf[js.Any])
    
    inline def setOriginalFilesVarargs(value: File*): Self = StObject.set(x, "originalFiles", js.Array(value*))
  }
}
