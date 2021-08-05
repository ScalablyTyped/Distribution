package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes EventTrigger, used to request events be sent from another
  * service.
  */
trait SchemaEventTrigger extends StObject {
  
  /**
    * `event_type` names contain the service that is sending an event and the
    * kind of event that was fired. Must be of the form
    * `providers/x/eventTypes/x e.g. Directly handle a Message published to
    * Google Cloud Pub/Sub `providers/cloud.pubsub/eventTypes/topic.publish`.
    * Handle an object changing in Google Cloud Storage:
    * `providers/cloud.storage/eventTypes/object.change`  Handle a write to the
    * Firebase Realtime Database:
    * `providers/google.firebase.database/eventTypes/ref.write`
    */
  var eventType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies policy for failed executions.
    */
  var failurePolicy: js.UndefOr[SchemaFailurePolicy] = js.undefined
  
  /**
    * Which instance of the source&#39;s service should send events. E.g. for
    * Pub/Sub this would be a Pub/Sub topic at `projects/x/topics/x. For Google
    * Cloud Storage this would be a bucket at `projects/x/buckets/x. For any
    * source that only supports one instance per-project, this should be the
    * name of the project (`projects/x)
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    * The hostname of the service that should be observed.  If no string is
    * provided, the default service implementing the API will be used. For
    * example, `storage.googleapis.com` is the default for all event types in
    * the `google.storage` namespace.
    */
  var service: js.UndefOr[String] = js.undefined
}
object SchemaEventTrigger {
  
  inline def apply(): SchemaEventTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventTrigger]
  }
  
  extension [Self <: SchemaEventTrigger](x: Self) {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFailurePolicy(value: SchemaFailurePolicy): Self = StObject.set(x, "failurePolicy", value.asInstanceOf[js.Any])
    
    inline def setFailurePolicyUndefined: Self = StObject.set(x, "failurePolicy", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
