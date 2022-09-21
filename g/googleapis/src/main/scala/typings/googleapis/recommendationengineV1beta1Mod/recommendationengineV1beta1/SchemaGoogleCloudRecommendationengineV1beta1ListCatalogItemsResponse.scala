package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse extends StObject {
  
  /**
    * The catalog items.
    */
  var catalogItems: js.UndefOr[js.Array[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]] = js.undefined
  
  /**
    * If empty, the list is complete. If nonempty, the token to pass to the next request's ListCatalogItemRequest.page_token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ListCatalogItemsResponse](x: Self) {
    
    inline def setCatalogItems(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1CatalogItem]): Self = StObject.set(x, "catalogItems", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemsUndefined: Self = StObject.set(x, "catalogItems", js.undefined)
    
    inline def setCatalogItemsVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1CatalogItem*): Self = StObject.set(x, "catalogItems", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
