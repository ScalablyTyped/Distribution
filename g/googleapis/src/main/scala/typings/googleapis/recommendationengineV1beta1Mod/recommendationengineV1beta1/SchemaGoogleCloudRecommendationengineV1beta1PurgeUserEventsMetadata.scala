package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata extends StObject {
  
  /**
    * Operation create time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the request / operation.
    */
  var operationName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1PurgeUserEventsMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameNull: Self = StObject.set(x, "operationName", null)
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
  }
}
