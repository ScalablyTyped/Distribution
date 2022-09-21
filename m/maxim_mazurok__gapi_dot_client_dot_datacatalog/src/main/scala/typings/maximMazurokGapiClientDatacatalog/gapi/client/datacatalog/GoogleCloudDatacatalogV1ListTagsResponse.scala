package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1ListTagsResponse extends StObject {
  
  /** Pagination token of the next results page. Empty if there are no more items in results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Tag details. */
  var tags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1Tag]] = js.undefined
}
object GoogleCloudDatacatalogV1ListTagsResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1ListTagsResponse]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1ListTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTags(value: js.Array[GoogleCloudDatacatalogV1Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: GoogleCloudDatacatalogV1Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
