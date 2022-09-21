package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaImportMetadata extends StObject {
  
  /**
    * Operation create time.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of entries that encountered errors while processing.
    */
  var failureCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pub/Sub topic for receiving notification. If this field is set, when the import is finished, a notification is sent to specified Pub/Sub topic. The message data is JSON string of a Operation. Format of the Pub/Sub topic is `projects/{project\}/topics/{topic\}`.
    */
  var notificationPubsubTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. This field is never set.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of entries that were processed successfully.
    */
  var successCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata related to transform user events.
    */
  var transformedUserEventsMetadata: js.UndefOr[SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata] = js.undefined
  
  /**
    * Operation last update time. If the operation is done, this is also the finish time.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaImportMetadata {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaImportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaImportMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaImportMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setFailureCount(value: String): Self = StObject.set(x, "failureCount", value.asInstanceOf[js.Any])
    
    inline def setFailureCountNull: Self = StObject.set(x, "failureCount", null)
    
    inline def setFailureCountUndefined: Self = StObject.set(x, "failureCount", js.undefined)
    
    inline def setNotificationPubsubTopic(value: String): Self = StObject.set(x, "notificationPubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setNotificationPubsubTopicNull: Self = StObject.set(x, "notificationPubsubTopic", null)
    
    inline def setNotificationPubsubTopicUndefined: Self = StObject.set(x, "notificationPubsubTopic", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSuccessCount(value: String): Self = StObject.set(x, "successCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessCountNull: Self = StObject.set(x, "successCount", null)
    
    inline def setSuccessCountUndefined: Self = StObject.set(x, "successCount", js.undefined)
    
    inline def setTransformedUserEventsMetadata(value: SchemaGoogleCloudRetailV2alphaTransformedUserEventsMetadata): Self = StObject.set(x, "transformedUserEventsMetadata", value.asInstanceOf[js.Any])
    
    inline def setTransformedUserEventsMetadataUndefined: Self = StObject.set(x, "transformedUserEventsMetadata", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
