package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSavedQueriesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of savedQueries. */
  var savedQueries: js.UndefOr[js.Array[SavedQuery]] = js.undefined
}
object ListSavedQueriesResponse {
  
  inline def apply(): ListSavedQueriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSavedQueriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSavedQueriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSavedQueries(value: js.Array[SavedQuery]): Self = StObject.set(x, "savedQueries", value.asInstanceOf[js.Any])
    
    inline def setSavedQueriesUndefined: Self = StObject.set(x, "savedQueries", js.undefined)
    
    inline def setSavedQueriesVarargs(value: SavedQuery*): Self = StObject.set(x, "savedQueries", js.Array(value*))
  }
}
