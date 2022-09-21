package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaImportCompletionDataRequest extends StObject {
  
  /**
    * Required. The desired input location of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaCompletionDataInputConfig] = js.undefined
  
  /**
    * Pub/Sub topic for receiving notification. If this field is set, when the import is finished, a notification is sent to specified Pub/Sub topic. The message data is JSON string of a Operation. Format of the Pub/Sub topic is `projects/{project\}/topics/{topic\}`.
    */
  var notificationPubsubTopic: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaImportCompletionDataRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaImportCompletionDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaImportCompletionDataRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaImportCompletionDataRequest](x: Self) {
    
    inline def setInputConfig(value: SchemaGoogleCloudRetailV2betaCompletionDataInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setNotificationPubsubTopic(value: String): Self = StObject.set(x, "notificationPubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setNotificationPubsubTopicNull: Self = StObject.set(x, "notificationPubsubTopic", null)
    
    inline def setNotificationPubsubTopicUndefined: Self = StObject.set(x, "notificationPubsubTopic", js.undefined)
  }
}
