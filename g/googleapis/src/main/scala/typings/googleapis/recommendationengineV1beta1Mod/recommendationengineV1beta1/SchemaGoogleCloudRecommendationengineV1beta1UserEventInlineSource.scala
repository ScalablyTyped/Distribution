package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource extends StObject {
  
  /**
    * Optional. A list of user events to import. Recommended max of 10k items.
    */
  var userEvents: js.UndefOr[js.Array[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1UserEventInlineSource](x: Self) {
    
    inline def setUserEvents(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEvents", value.asInstanceOf[js.Any])
    
    inline def setUserEventsUndefined: Self = StObject.set(x, "userEvents", js.undefined)
    
    inline def setUserEventsVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEvents", js.Array(value*))
  }
}
