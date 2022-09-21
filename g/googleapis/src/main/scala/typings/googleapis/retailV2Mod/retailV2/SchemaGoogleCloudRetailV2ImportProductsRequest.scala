package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ImportProductsRequest extends StObject {
  
  /**
    * The desired location of errors incurred during the Import.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2ImportErrorsConfig] = js.undefined
  
  /**
    * Required. The desired input location of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudRetailV2ProductInputConfig] = js.undefined
  
  /**
    * Full Pub/Sub topic name for receiving notification. If this field is set, when the import is finished, a notification is sent to specified Pub/Sub topic. The message data is JSON string of a Operation. Format of the Pub/Sub topic is `projects/{project\}/topics/{topic\}`. It has to be within the same project as ImportProductsRequest.parent. Make sure that `service-@gcp-sa-retail.iam.gserviceaccount.com` has the `pubsub.topics.publish` IAM permission on the topic.
    */
  var notificationPubsubTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mode of reconciliation between existing products and the products to be imported. Defaults to ReconciliationMode.INCREMENTAL.
    */
  var reconciliationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates which fields in the provided imported `products` to update. If not set, all fields are updated.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2ImportProductsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2ImportProductsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ImportProductsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ImportProductsRequest](x: Self) {
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudRetailV2ProductInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setNotificationPubsubTopic(value: String): Self = StObject.set(x, "notificationPubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setNotificationPubsubTopicNull: Self = StObject.set(x, "notificationPubsubTopic", null)
    
    inline def setNotificationPubsubTopicUndefined: Self = StObject.set(x, "notificationPubsubTopic", js.undefined)
    
    inline def setReconciliationMode(value: String): Self = StObject.set(x, "reconciliationMode", value.asInstanceOf[js.Any])
    
    inline def setReconciliationModeNull: Self = StObject.set(x, "reconciliationMode", null)
    
    inline def setReconciliationModeUndefined: Self = StObject.set(x, "reconciliationMode", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
