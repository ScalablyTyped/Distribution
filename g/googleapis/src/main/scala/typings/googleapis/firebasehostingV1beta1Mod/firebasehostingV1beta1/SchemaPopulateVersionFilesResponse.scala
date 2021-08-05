package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPopulateVersionFilesResponse extends StObject {
  
  /**
    * The content hashes of the specified files that need to be uploaded to the
    * specified endpoint.
    */
  var uploadRequiredHashes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URL to which the files should be uploaded, in the format:
    * &lt;br&gt;&quot;https://upload-firebasehosting.googleapis.com/upload/sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;/files&quot;.
    * &lt;br&gt;Perform a multipart `POST` of the Gzipped file contents to the
    * URL using a forward slash and the hash of the file appended to the end.
    */
  var uploadUrl: js.UndefOr[String] = js.undefined
}
object SchemaPopulateVersionFilesResponse {
  
  inline def apply(): SchemaPopulateVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopulateVersionFilesResponse]
  }
  
  extension [Self <: SchemaPopulateVersionFilesResponse](x: Self) {
    
    inline def setUploadRequiredHashes(value: js.Array[String]): Self = StObject.set(x, "uploadRequiredHashes", value.asInstanceOf[js.Any])
    
    inline def setUploadRequiredHashesUndefined: Self = StObject.set(x, "uploadRequiredHashes", js.undefined)
    
    inline def setUploadRequiredHashesVarargs(value: String*): Self = StObject.set(x, "uploadRequiredHashes", js.Array(value :_*))
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
  }
}
