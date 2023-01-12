package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchItemsByViewUrlResponse extends StObject {
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SearchItemsByViewUrlResponse {
  
  inline def apply(): SearchItemsByViewUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchItemsByViewUrlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchItemsByViewUrlResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
