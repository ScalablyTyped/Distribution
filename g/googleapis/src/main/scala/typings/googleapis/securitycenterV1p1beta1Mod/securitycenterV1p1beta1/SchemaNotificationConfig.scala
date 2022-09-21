package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotificationConfig extends StObject {
  
  /**
    * The description of the notification config (max of 1024 characters).
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of events the config is for, e.g. FINDING.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: &quot;organizations/{organization_id}/notificationConfigs/notify_public_bucket&quot;.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Pub/Sub topic to send notifications to. Its format is &quot;projects/[project_id]/topics/[topic]&quot;.
    */
  var pubsubTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The service account that needs &quot;pubsub.topics.publish&quot; permission to publish to the Pub/Sub topic.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The config for triggering streaming-based notifications.
    */
  var streamingConfig: js.UndefOr[SchemaStreamingConfig] = js.undefined
}
object SchemaNotificationConfig {
  
  inline def apply(): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
  
  extension [Self <: SchemaNotificationConfig](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNull: Self = StObject.set(x, "pubsubTopic", null)
    
    inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setStreamingConfig(value: SchemaStreamingConfig): Self = StObject.set(x, "streamingConfig", value.asInstanceOf[js.Any])
    
    inline def setStreamingConfigUndefined: Self = StObject.set(x, "streamingConfig", js.undefined)
  }
}
