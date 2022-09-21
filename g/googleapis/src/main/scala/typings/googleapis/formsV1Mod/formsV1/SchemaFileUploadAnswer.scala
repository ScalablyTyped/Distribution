package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileUploadAnswer extends StObject {
  
  /**
    * Output only. The ID of the Google Drive file.
    */
  var fileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The file name, as stored in Google Drive on upload.
    */
  var fileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The MIME type of the file, as stored in Google Drive on upload.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileUploadAnswer {
  
  inline def apply(): SchemaFileUploadAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileUploadAnswer]
  }
  
  extension [Self <: SchemaFileUploadAnswer](x: Self) {
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdNull: Self = StObject.set(x, "fileId", null)
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
