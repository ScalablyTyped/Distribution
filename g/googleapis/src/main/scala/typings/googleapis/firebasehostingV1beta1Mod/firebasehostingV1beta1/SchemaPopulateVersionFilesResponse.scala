package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPopulateVersionFilesResponse extends StObject {
  
  /**
    * The content hashes of the specified files that need to be uploaded to the specified URL.
    */
  var uploadRequiredHashes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URL to which the files should be uploaded, in the format: "https://upload-firebasehosting.googleapis.com/upload/sites/SITE_ID /versions/VERSION_ID/files" Perform a multipart `POST` of the Gzipped file contents to the URL using a forward slash and the hash of the file appended to the end.
    */
  var uploadUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaPopulateVersionFilesResponse {
  
  inline def apply(): SchemaPopulateVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopulateVersionFilesResponse]
  }
  
  extension [Self <: SchemaPopulateVersionFilesResponse](x: Self) {
    
    inline def setUploadRequiredHashes(value: js.Array[String]): Self = StObject.set(x, "uploadRequiredHashes", value.asInstanceOf[js.Any])
    
    inline def setUploadRequiredHashesNull: Self = StObject.set(x, "uploadRequiredHashes", null)
    
    inline def setUploadRequiredHashesUndefined: Self = StObject.set(x, "uploadRequiredHashes", js.undefined)
    
    inline def setUploadRequiredHashesVarargs(value: String*): Self = StObject.set(x, "uploadRequiredHashes", js.Array(value*))
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
