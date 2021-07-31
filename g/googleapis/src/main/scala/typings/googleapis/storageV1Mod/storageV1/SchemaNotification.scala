package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subscription to receive Google PubSub notifications.
  */
trait SchemaNotification extends StObject {
  
  /**
    * An optional list of additional attributes to attach to each Cloud PubSub
    * message published for this notification subscription.
    */
  var custom_attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for this subscription notification.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * If present, only send notifications about listed event types. If empty,
    * sent notifications for all event types.
    */
  var event_types: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The ID of the notification.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of item this is. For notifications, this is always
    * storage#notification.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * If present, only apply this notification configuration to object names
    * that begin with this prefix.
    */
  var object_name_prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The desired content of the Payload.
    */
  var payload_format: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical URL of this notification.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The Cloud PubSub topic to which this subscription publishes. Formatted
    * as:
    * &#39;//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}&#39;
    */
  var topic: js.UndefOr[String] = js.undefined
}
object SchemaNotification {
  
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  
  @scala.inline
  implicit class SchemaNotificationMutableBuilder[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom_attributes(value: StringDictionary[String]): Self = StObject.set(x, "custom_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_attributesUndefined: Self = StObject.set(x, "custom_attributes", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setEvent_types(value: js.Array[String]): Self = StObject.set(x, "event_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_typesUndefined: Self = StObject.set(x, "event_types", js.undefined)
    
    @scala.inline
    def setEvent_typesVarargs(value: String*): Self = StObject.set(x, "event_types", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setObject_name_prefix(value: String): Self = StObject.set(x, "object_name_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject_name_prefixUndefined: Self = StObject.set(x, "object_name_prefix", js.undefined)
    
    @scala.inline
    def setPayload_format(value: String): Self = StObject.set(x, "payload_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload_formatUndefined: Self = StObject.set(x, "payload_format", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
