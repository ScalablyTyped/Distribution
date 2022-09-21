package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileUploadQuestion extends StObject {
  
  /**
    * Required. The ID of the Drive folder where uploaded files are stored.
    */
  var folderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of bytes allowed for any single file uploaded to this question.
    */
  var maxFileSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of files that can be uploaded for this question in a single response.
    */
  var maxFiles: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * File types accepted by this question.
    */
  var types: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFileUploadQuestion {
  
  inline def apply(): SchemaFileUploadQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileUploadQuestion]
  }
  
  extension [Self <: SchemaFileUploadQuestion](x: Self) {
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdNull: Self = StObject.set(x, "folderId", null)
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    inline def setMaxFileSize(value: String): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeNull: Self = StObject.set(x, "maxFileSize", null)
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
    
    inline def setMaxFilesNull: Self = StObject.set(x, "maxFiles", null)
    
    inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesNull: Self = StObject.set(x, "types", null)
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
