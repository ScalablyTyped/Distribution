package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results. It is set to empty if no items remain in results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tag details.
    */
  var tags: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1Tag]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ListTagsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTags(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SchemaGoogleCloudDatacatalogV1beta1Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
