package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the PublishBatch method.
  */
@js.native
trait SchemaPublishBatchResponse extends js.Object {
  /**
    * The server-assigned ID of each published message, in the same order as
    * the messages in the request. IDs are guaranteed to be unique within the
    * topic.
    */
  var messageIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPublishBatchResponse {
  @scala.inline
  def apply(messageIds: js.Array[String] = null): SchemaPublishBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (messageIds != null) __obj.updateDynamic("messageIds")(messageIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublishBatchResponse]
  }
}

