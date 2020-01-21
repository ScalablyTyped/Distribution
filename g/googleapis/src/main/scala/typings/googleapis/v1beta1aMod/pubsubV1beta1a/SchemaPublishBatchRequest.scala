package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the PublishBatch method.
  */
@js.native
trait SchemaPublishBatchRequest extends js.Object {
  /**
    * The messages to publish.
    */
  var messages: js.UndefOr[js.Array[SchemaPubsubMessage]] = js.native
  /**
    * The messages in the request will be published on this topic.
    */
  var topic: js.UndefOr[String] = js.native
}

object SchemaPublishBatchRequest {
  @scala.inline
  def apply(messages: js.Array[SchemaPubsubMessage] = null, topic: String = null): SchemaPublishBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublishBatchRequest]
  }
}

