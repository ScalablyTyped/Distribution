package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVersionsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of versions.
    */
  var versions: js.UndefOr[js.Array[SchemaVersion]] = js.undefined
}
object SchemaListVersionsResponse {
  
  inline def apply(): SchemaListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVersionsResponse]
  }
  
  extension [Self <: SchemaListVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVersions(value: js.Array[SchemaVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: SchemaVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
