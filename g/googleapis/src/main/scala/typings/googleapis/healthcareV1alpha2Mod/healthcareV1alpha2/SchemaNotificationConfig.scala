package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies where notifications should be sent upon changes to a data store.
  */
@js.native
trait SchemaNotificationConfig extends js.Object {
  /**
    * The [Cloud Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that
    * notifications of changes are published on. Supplied by the client.
    * PubsubMessage.Data will contain the resource name.
    * PubsubMessage.MessageId is the ID of this message. It is guaranteed to be
    * unique within the topic. PubsubMessage.PublishTime is the time at which
    * the message was published. Notifications are only sent if the topic is
    * non-empty. [Topic
    * names](https://cloud.google.com/pubsub/docs/overview#names) must be
    * scoped to a project. cloud-healthcare@system.gserviceaccount.com must
    * have publisher permissions on the given Cloud Pub/Sub topic. Not having
    * adequate permissions will cause the calls that send notifications to
    * fail.
    */
  var pubsubTopic: js.UndefOr[String] = js.native
}

object SchemaNotificationConfig {
  @scala.inline
  def apply(): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
  @scala.inline
  implicit class SchemaNotificationConfigOps[Self <: SchemaNotificationConfig] (val x: Self) extends AnyVal {
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
    def setPubsubTopic(value: String): Self = this.set("pubsubTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubsubTopic: Self = this.set("pubsubTopic", js.undefined)
  }
  
}

