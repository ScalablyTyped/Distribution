package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message and its corresponding acknowledgment ID.
  */
@js.native
trait SchemaReceivedMessage extends js.Object {
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * The message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
}

object SchemaReceivedMessage {
  @scala.inline
  def apply(ackId: String = null, message: SchemaPubsubMessage = null): SchemaReceivedMessage = {
    val __obj = js.Dynamic.literal()
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReceivedMessage]
  }
}

