package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventTrigger extends StObject {
  
  /**
    * Optional. The name of the channel associated with the trigger in `projects/{project\}/locations/{location\}/channels/{channel\}` format. You must provide a channel to receive events from Eventarc SaaS partners.
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Criteria used to filter events.
    */
  var eventFilters: js.UndefOr[js.Array[SchemaEventFilter]] = js.undefined
  
  /**
    * Required. The type of event to observe. For example: `google.cloud.audit.log.v1.written` or `google.cloud.pubsub.topic.v1.messagePublished`.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The name of a Pub/Sub topic in the same project that will be used as the transport topic for the event delivery. Format: `projects/{project\}/topics/{topic\}`. This is only valid for events of type `google.cloud.pubsub.topic.v1.messagePublished`. The topic provided here will not be deleted at function deletion.
    */
  var pubsubTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If unset, then defaults to ignoring failures (i.e. not retrying them).
    */
  var retryPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The email of the trigger's service account. The service account must have permission to invoke Cloud Run services, the permission is `run.routes.invoke`. If empty, defaults to the Compute Engine default service account: `{project_number\}-compute@developer.gserviceaccount.com`.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the Eventarc trigger. The format of this field is `projects/{project\}/locations/{region\}/triggers/{trigger\}`.
    */
  var trigger: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The region that the trigger will be in. The trigger will only receive events originating in this region. It can be the same region as the function, a different region or multi-region, or the global region. If not provided, defaults to the same region as the function.
    */
  var triggerRegion: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventTrigger {
  
  inline def apply(): SchemaEventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTrigger]
  }
  
  extension [Self <: SchemaEventTrigger](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setEventFilters(value: js.Array[SchemaEventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    inline def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    inline def setEventFiltersVarargs(value: SchemaEventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value*))
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNull: Self = StObject.set(x, "pubsubTopic", null)
    
    inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
    
    inline def setRetryPolicy(value: String): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyNull: Self = StObject.set(x, "retryPolicy", null)
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
    
    inline def setTriggerRegion(value: String): Self = StObject.set(x, "triggerRegion", value.asInstanceOf[js.Any])
    
    inline def setTriggerRegionNull: Self = StObject.set(x, "triggerRegion", null)
    
    inline def setTriggerRegionUndefined: Self = StObject.set(x, "triggerRegion", js.undefined)
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
