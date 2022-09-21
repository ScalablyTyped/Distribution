package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCreativesResponse extends StObject {
  
  /**
    * The list of creatives. This list will be absent if empty.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCreativesRequest` method to retrieve the next page of results. If this field is null, it means this is the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCreativesResponse {
  
  inline def apply(): SchemaListCreativesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativesResponse]
  }
  
  extension [Self <: SchemaListCreativesResponse](x: Self) {
    
    inline def setCreatives(value: js.Array[SchemaCreative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    inline def setCreativesUndefined: Self = StObject.set(x, "creatives", js.undefined)
    
    inline def setCreativesVarargs(value: SchemaCreative*): Self = StObject.set(x, "creatives", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
