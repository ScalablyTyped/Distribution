package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse extends StObject {
  
  /**
    * Output only. All the customer's catalogs.
    */
  var catalogs: js.UndefOr[js.Array[SchemaGoogleCloudRecommendationengineV1beta1Catalog]] = js.undefined
  
  /**
    * Pagination token, if not returned indicates the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ListCatalogsResponse](x: Self) {
    
    inline def setCatalogs(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1Catalog]): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
    
    inline def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
    
    inline def setCatalogsVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1Catalog*): Self = StObject.set(x, "catalogs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
