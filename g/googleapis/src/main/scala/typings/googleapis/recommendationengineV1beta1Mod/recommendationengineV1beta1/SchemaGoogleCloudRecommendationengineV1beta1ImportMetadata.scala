package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ImportMetadata extends StObject {
  
  /**
    * Operation create time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of entries that encountered errors while processing.
    */
  var failureCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the operation.
    */
  var operationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of the request / operation. This is parroting back the requestId that was passed in the request.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of entries that were processed successfully.
    */
  var successCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Operation last update time. If the operation is done, this is also the finish time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ImportMetadata {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ImportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ImportMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ImportMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFailureCount(value: String): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountNull: Self = StObject.set(x, "failureCount", null)
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setOperationName(value: String): Self = StObject.set(x, "operationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameNull: Self = StObject.set(x, "operationName", null)
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "operationName", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSuccessCount(value: String): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountNull: Self = StObject.set(x, "successCount", null)
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
