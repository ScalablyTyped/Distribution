package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the ModifyAckDeadline method.
  */
@js.native
trait SchemaModifyAckDeadlineRequest extends js.Object {
  /**
    * The new ack deadline with respect to the time this request was sent to
    * the Pub/Sub system. Must be &gt;= 0. For example, if the value is 10, the
    * new ack deadline will expire 10 seconds after the `ModifyAckDeadline`
    * call was made. Specifying zero may immediately make the message available
    * for another pull request.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * The acknowledgment ID. Either this or ack_ids must be populated, but not
    * both.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * List of acknowledgment IDs.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyAckDeadlineRequest {
  @scala.inline
  def apply(
    ackDeadlineSeconds: js.UndefOr[Double] = js.undefined,
    ackId: String = null,
    ackIds: js.Array[String] = null
  ): SchemaModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackDeadlineSeconds)) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.get.asInstanceOf[js.Any])
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyAckDeadlineRequest]
  }
}

