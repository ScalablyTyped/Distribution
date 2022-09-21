package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ListTagsResponse extends StObject {
  
  /**
    * Pagination token of the next results page. Empty if there are no more items in results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag details.
    */
  var tags: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1Tag]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ListTagsResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ListTagsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ListTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTags(value: js.Array[SchemaGoogleCloudDatacatalogV1Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SchemaGoogleCloudDatacatalogV1Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
