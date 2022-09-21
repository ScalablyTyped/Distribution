package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse extends StObject {
  
  /**
    * The total count of events purged as a result of the operation.
    */
  var purgedEventsCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A sampling of events deleted (or will be deleted) depending on the `force` property in the request. Max of 500 items will be returned.
    */
  var userEventsSample: js.UndefOr[js.Array[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsResponse](x: Self) {
    
    inline def setPurgedEventsCount(value: String): Self = StObject.set(x, "purgedEventsCount", value.asInstanceOf[js.Any])
    
    inline def setPurgedEventsCountNull: Self = StObject.set(x, "purgedEventsCount", null)
    
    inline def setPurgedEventsCountUndefined: Self = StObject.set(x, "purgedEventsCount", js.undefined)
    
    inline def setUserEventsSample(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1UserEvent]): Self = StObject.set(x, "userEventsSample", value.asInstanceOf[js.Any])
    
    inline def setUserEventsSampleUndefined: Self = StObject.set(x, "userEventsSample", js.undefined)
    
    inline def setUserEventsSampleVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1UserEvent*): Self = StObject.set(x, "userEventsSample", js.Array(value*))
  }
}
