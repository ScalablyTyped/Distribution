package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVersionFilesResponse extends StObject {
  
  /**
    *  The list of paths to the hashes of the files in the specified version.
    */
  var files: js.UndefOr[js.Array[SchemaVersionFile]] = js.undefined
  
  /**
    * The pagination token, if more results exist beyond the ones in this response. Include this token in your next call to `ListVersionFiles`. Page tokens are short-lived and should not be stored.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListVersionFilesResponse {
  
  inline def apply(): SchemaListVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionFilesResponse]
  }
  
  extension [Self <: SchemaListVersionFilesResponse](x: Self) {
    
    inline def setFiles(value: js.Array[SchemaVersionFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaVersionFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
