package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNegativeKeywordsResponse extends StObject {
  
  /**
    * The list of negative keywords. This list will be absent if empty.
    */
  var negativeKeywords: js.UndefOr[js.Array[SchemaNegativeKeyword]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListNegativeKeywords` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListNegativeKeywordsResponse {
  
  inline def apply(): SchemaListNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNegativeKeywordsResponse]
  }
  
  extension [Self <: SchemaListNegativeKeywordsResponse](x: Self) {
    
    inline def setNegativeKeywords(value: js.Array[SchemaNegativeKeyword]): Self = StObject.set(x, "negativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordsUndefined: Self = StObject.set(x, "negativeKeywords", js.undefined)
    
    inline def setNegativeKeywordsVarargs(value: SchemaNegativeKeyword*): Self = StObject.set(x, "negativeKeywords", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
