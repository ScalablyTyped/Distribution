package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRegionsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The regions from the specified merchant.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.undefined
}
object SchemaListRegionsResponse {
  
  inline def apply(): SchemaListRegionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRegionsResponse]
  }
  
  extension [Self <: SchemaListRegionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRegions(value: js.Array[SchemaRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: SchemaRegion*): Self = StObject.set(x, "regions", js.Array(value*))
  }
}
