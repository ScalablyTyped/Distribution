package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionStatusesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The collectionstatuses listed. */
  var resources: js.UndefOr[js.Array[CollectionStatus]] = js.undefined
}
object ListCollectionStatusesResponse {
  
  inline def apply(): ListCollectionStatusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionStatusesResponse]
  }
  
  extension [Self <: ListCollectionStatusesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[CollectionStatus]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: CollectionStatus*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
