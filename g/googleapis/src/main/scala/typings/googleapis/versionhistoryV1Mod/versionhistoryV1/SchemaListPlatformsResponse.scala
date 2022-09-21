package typings.googleapis.versionhistoryV1Mod.versionhistoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPlatformsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of platforms.
    */
  var platforms: js.UndefOr[js.Array[SchemaPlatform]] = js.undefined
}
object SchemaListPlatformsResponse {
  
  inline def apply(): SchemaListPlatformsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPlatformsResponse]
  }
  
  extension [Self <: SchemaListPlatformsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlatforms(value: js.Array[SchemaPlatform]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    inline def setPlatformsVarargs(value: SchemaPlatform*): Self = StObject.set(x, "platforms", js.Array(value*))
  }
}
