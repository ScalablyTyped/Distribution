package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2PubSubNotification extends StObject {
  
  /**
    * How much data to include in the Pub/Sub message. If the user wishes to limit the size of the message, they can use resource_name and fetch the profile fields they wish to. Per table profile (not per column).
    */
  var detailOfMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of event that triggers a Pub/Sub. At most one `PubSubNotification` per EventType is permitted.
    */
  var event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Conditions (e.g., data risk or sensitivity level) for triggering a Pub/Sub.
    */
  var pubsubCondition: js.UndefOr[SchemaGooglePrivacyDlpV2DataProfilePubSubCondition] = js.undefined
  
  /**
    * Cloud Pub/Sub topic to send notifications to. Format is projects/{project\}/topics/{topic\}.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2PubSubNotification {
  
  inline def apply(): SchemaGooglePrivacyDlpV2PubSubNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PubSubNotification]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2PubSubNotification](x: Self) {
    
    inline def setDetailOfMessage(value: String): Self = StObject.set(x, "detailOfMessage", value.asInstanceOf[js.Any])
    
    inline def setDetailOfMessageNull: Self = StObject.set(x, "detailOfMessage", null)
    
    inline def setDetailOfMessageUndefined: Self = StObject.set(x, "detailOfMessage", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setPubsubCondition(value: SchemaGooglePrivacyDlpV2DataProfilePubSubCondition): Self = StObject.set(x, "pubsubCondition", value.asInstanceOf[js.Any])
    
    inline def setPubsubConditionUndefined: Self = StObject.set(x, "pubsubCondition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
