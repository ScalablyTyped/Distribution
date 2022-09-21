package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse extends StObject {
  
  /**
    * If empty, the list is complete. If nonempty, the token to pass to the next request's ListUserEvents.page_token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user events.
    */
  var userEvents: js.UndefOr[js.Array[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ListUserEventsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserEvents(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    inline def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    inline def setUserEventsVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEvents", js.Array(value*))
  }
}
