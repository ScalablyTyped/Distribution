package typings.jqueryFileupload

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryFileUploadFilesObject extends StObject {
  
  var files: js.Array[File]
}
object JQueryFileUploadFilesObject {
  
  @scala.inline
  def apply(files: js.Array[File]): JQueryFileUploadFilesObject = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadFilesObject]
  }
  
  @scala.inline
  implicit class JQueryFileUploadFilesObjectMutableBuilder[Self <: JQueryFileUploadFilesObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
