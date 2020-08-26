package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription to receive Google PubSub notifications.
  */
@js.native
trait SchemaNotification extends js.Object {
  /**
    * An optional list of additional attributes to attach to each Cloud PubSub
    * message published for this notification subscription.
    */
  var custom_attributes: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * HTTP 1.1 Entity tag for this subscription notification.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * If present, only send notifications about listed event types. If empty,
    * sent notifications for all event types.
    */
  var event_types: js.UndefOr[js.Array[String]] = js.native
  /**
    * The ID of the notification.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For notifications, this is always
    * storage#notification.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If present, only apply this notification configuration to object names
    * that begin with this prefix.
    */
  var object_name_prefix: js.UndefOr[String] = js.native
  /**
    * The desired content of the Payload.
    */
  var payload_format: js.UndefOr[String] = js.native
  /**
    * The canonical URL of this notification.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The Cloud PubSub topic to which this subscription publishes. Formatted
    * as:
    * &#39;//pubsub.googleapis.com/projects/{project-identifier}/topics/{my-topic}&#39;
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaNotification {
  @scala.inline
  def apply(): SchemaNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotification]
  }
  @scala.inline
  implicit class SchemaNotificationOps[Self <: SchemaNotification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustom_attributes(value: StringDictionary[String]): Self = this.set("custom_attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom_attributes: Self = this.set("custom_attributes", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setEvent_typesVarargs(value: String*): Self = this.set("event_types", js.Array(value :_*))
    @scala.inline
    def setEvent_types(value: js.Array[String]): Self = this.set("event_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_types: Self = this.set("event_types", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setObject_name_prefix(value: String): Self = this.set("object_name_prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject_name_prefix: Self = this.set("object_name_prefix", js.undefined)
    @scala.inline
    def setPayload_format(value: String): Self = this.set("payload_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload_format: Self = this.set("payload_format", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

