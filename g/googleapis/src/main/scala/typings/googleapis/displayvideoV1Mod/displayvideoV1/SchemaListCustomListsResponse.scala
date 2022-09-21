package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCustomListsResponse extends StObject {
  
  /**
    * The list of custom lists. This list will be absent if empty.
    */
  var customLists: js.UndefOr[js.Array[SchemaCustomList]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListCustomLists` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCustomListsResponse {
  
  inline def apply(): SchemaListCustomListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCustomListsResponse]
  }
  
  extension [Self <: SchemaListCustomListsResponse](x: Self) {
    
    inline def setCustomLists(value: js.Array[SchemaCustomList]): Self = StObject.set(x, "customLists", value.asInstanceOf[js.Any])
    
    inline def setCustomListsUndefined: Self = StObject.set(x, "customLists", js.undefined)
    
    inline def setCustomListsVarargs(value: SchemaCustomList*): Self = StObject.set(x, "customLists", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
