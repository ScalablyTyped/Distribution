package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaImportProductsRequest extends StObject {
  
  /**
    * The desired location of errors incurred during the Import.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaImportErrorsConfig] = js.undefined
  
  /**
    * Required. The desired input location of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaProductInputConfig] = js.undefined
  
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
    * If true, this performs the FULL import even if it would delete a large proportion of the products in the default branch, which could potentially cause outages if you have live predict/search traffic. Only supported when ImportProductsRequest.reconciliation_mode is set to `FULL`.
    */
  var skipDefaultBranchProtection: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates which fields in the provided imported `products` to update. If not set, all fields are updated.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaImportProductsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaImportProductsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaImportProductsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaImportProductsRequest](x: Self) {
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2alphaImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudRetailV2alphaProductInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
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
    
    inline def setSkipDefaultBranchProtection(value: Boolean): Self = StObject.set(x, "skipDefaultBranchProtection", value.asInstanceOf[js.Any])
    
    inline def setSkipDefaultBranchProtectionNull: Self = StObject.set(x, "skipDefaultBranchProtection", null)
    
    inline def setSkipDefaultBranchProtectionUndefined: Self = StObject.set(x, "skipDefaultBranchProtection", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
