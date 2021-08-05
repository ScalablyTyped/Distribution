package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVersionFilesResponse extends StObject {
  
  /**
    * The list path/hashes in the specified version.
    */
  var files: js.UndefOr[js.Array[SchemaVersionFile]] = js.undefined
  
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListVersionFilesResponse {
  
  inline def apply(): SchemaListVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionFilesResponse]
  }
  
  extension [Self <: SchemaListVersionFilesResponse](x: Self) {
    
    inline def setFiles(value: js.Array[SchemaVersionFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaVersionFile*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
