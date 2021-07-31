package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUploadedEventUIParam extends StObject {
  
  /**
    * Gets the unique identifier of the file.
    */
  var fileId: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets reference to the fileInfo object - containing information for  fileName, fileSize, serverMessage(if returned from server side), etc.
    */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the name of the uploaded file.
    */
  var filePath: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the igUpload widget object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the file size of the uploaded file.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object FileUploadedEventUIParam {
  
  @scala.inline
  def apply(): FileUploadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadedEventUIParam]
  }
  
  @scala.inline
  implicit class FileUploadedEventUIParamMutableBuilder[Self <: FileUploadedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setFileInfo(value: js.Any): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInfoUndefined: Self = StObject.set(x, "fileInfo", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
