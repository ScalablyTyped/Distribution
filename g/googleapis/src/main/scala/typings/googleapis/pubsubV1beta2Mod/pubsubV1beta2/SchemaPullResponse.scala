package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `Pull` method.
  */
@js.native
trait SchemaPullResponse extends js.Object {
  /**
    * Received Pub/Sub messages. The Pub/Sub system will return zero messages
    * if there are no more available in the backlog. The Pub/Sub system may
    * return fewer than the `maxMessages` requested even if there are more
    * messages available in the backlog.
    */
  var receivedMessages: js.UndefOr[js.Array[SchemaReceivedMessage]] = js.native
}

object SchemaPullResponse {
  @scala.inline
  def apply(receivedMessages: js.Array[SchemaReceivedMessage] = null): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    if (receivedMessages != null) __obj.updateDynamic("receivedMessages")(receivedMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPullResponse]
  }
}

