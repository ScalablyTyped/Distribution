package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNegativeKeywordListsResponse extends StObject {
  
  /**
    * The list of negative keyword lists. This list will be absent if empty.
    */
  var negativeKeywordLists: js.UndefOr[js.Array[SchemaNegativeKeywordList]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListNegativeKeywordLists` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListNegativeKeywordListsResponse {
  
  inline def apply(): SchemaListNegativeKeywordListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNegativeKeywordListsResponse]
  }
  
  extension [Self <: SchemaListNegativeKeywordListsResponse](x: Self) {
    
    inline def setNegativeKeywordLists(value: js.Array[SchemaNegativeKeywordList]): Self = StObject.set(x, "negativeKeywordLists", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordListsUndefined: Self = StObject.set(x, "negativeKeywordLists", js.undefined)
    
    inline def setNegativeKeywordListsVarargs(value: SchemaNegativeKeywordList*): Self = StObject.set(x, "negativeKeywordLists", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
