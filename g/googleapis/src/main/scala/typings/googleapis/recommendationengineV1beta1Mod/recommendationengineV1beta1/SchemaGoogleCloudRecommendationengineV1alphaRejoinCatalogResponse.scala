package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1alphaRejoinCatalogResponse extends StObject {
  
  /**
    * Number of user events that were joined with latest catalog items.
    */
  var rejoinedUserEventsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1alphaRejoinCatalogResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1alphaRejoinCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1alphaRejoinCatalogResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1alphaRejoinCatalogResponse](x: Self) {
    
    inline def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    inline def setRejoinedUserEventsCountNull: Self = StObject.set(x, "rejoinedUserEventsCount", null)
    
    inline def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
