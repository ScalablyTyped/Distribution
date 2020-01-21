package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Acknowledge method.
  */
@js.native
trait SchemaAcknowledgeRequest extends js.Object {
  /**
    * The acknowledgment ID for the messages being acknowledged that was
    * returned by the Pub/Sub system in the `Pull` response. Must not be empty.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAcknowledgeRequest {
  @scala.inline
  def apply(ackIds: js.Array[String] = null): SchemaAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAcknowledgeRequest]
  }
}

