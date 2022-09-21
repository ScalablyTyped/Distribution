package typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTriggerPubsubExecutionRequest extends StObject {
  
  /**
    * Required. LINT: LEGACY_NAMES The query parameter value for __GCP_CloudEventsMode, set by the Eventarc service when configuring triggers.
    */
  var GCPCloudEventsMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The message of the Pub/Sub push notification.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.undefined
  
  /**
    * Required. The subscription of the Pub/Sub push notification. Format: projects/{project\}/subscriptions/{sub\}
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaTriggerPubsubExecutionRequest {
  
  inline def apply(): SchemaTriggerPubsubExecutionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTriggerPubsubExecutionRequest]
  }
  
  extension [Self <: SchemaTriggerPubsubExecutionRequest](x: Self) {
    
    inline def setGCPCloudEventsMode(value: String): Self = StObject.set(x, "GCPCloudEventsMode", value.asInstanceOf[js.Any])
    
    inline def setGCPCloudEventsModeNull: Self = StObject.set(x, "GCPCloudEventsMode", null)
    
    inline def setGCPCloudEventsModeUndefined: Self = StObject.set(x, "GCPCloudEventsMode", js.undefined)
    
    inline def setMessage(value: SchemaPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
