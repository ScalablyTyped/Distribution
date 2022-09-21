package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse extends StObject {
  
  /**
    * Number of user events that were joined with latest catalog items.
    */
  var rejoinedUserEventsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1RejoinUserEventsResponse](x: Self) {
    
    inline def setRejoinedUserEventsCount(value: String): Self = StObject.set(x, "rejoinedUserEventsCount", value.asInstanceOf[js.Any])
    
    inline def setRejoinedUserEventsCountNull: Self = StObject.set(x, "rejoinedUserEventsCount", null)
    
    inline def setRejoinedUserEventsCountUndefined: Self = StObject.set(x, "rejoinedUserEventsCount", js.undefined)
  }
}
