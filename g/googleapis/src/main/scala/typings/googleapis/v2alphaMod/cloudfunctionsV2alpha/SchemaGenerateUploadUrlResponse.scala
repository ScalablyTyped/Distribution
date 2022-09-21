package typings.googleapis.v2alphaMod.cloudfunctionsV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateUploadUrlResponse extends StObject {
  
  /**
    * The location of the source code in the upload bucket. Once the archive is uploaded using the `upload_url` use this field to set the `function.build_config.source.storage_source` during CreateFunction and UpdateFunction. Generation defaults to 0, as Cloud Storage provides a new generation only upon uploading a new object or version of an object.
    */
  var storageSource: js.UndefOr[SchemaStorageSource] = js.undefined
  
  /**
    * The generated Google Cloud Storage signed URL that should be used for a function source code upload. The uploaded file should be a zip archive which contains a function.
    */
  var uploadUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateUploadUrlResponse {
  
  inline def apply(): SchemaGenerateUploadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateUploadUrlResponse]
  }
  
  extension [Self <: SchemaGenerateUploadUrlResponse](x: Self) {
    
    inline def setStorageSource(value: SchemaStorageSource): Self = StObject.set(x, "storageSource", value.asInstanceOf[js.Any])
    
    inline def setStorageSourceUndefined: Self = StObject.set(x, "storageSource", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
