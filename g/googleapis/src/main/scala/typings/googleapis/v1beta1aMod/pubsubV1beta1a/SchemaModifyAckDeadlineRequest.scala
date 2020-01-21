package typings.googleapis.v1beta1aMod.pubsubV1beta1a

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
    * new ack deadline will expire 10 seconds after the ModifyAckDeadline call
    * was made. Specifying zero may immediately make the message available for
    * another pull request.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  /**
    * The acknowledgment ID. Either this or ack_ids must be populated, not
    * both.
    */
  var ackId: js.UndefOr[String] = js.native
  /**
    * List of acknowledgment IDs. Either this field or ack_id should be
    * populated, not both.
    */
  var ackIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Next Index: 5 The name of the subscription from which messages are being
    * pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaModifyAckDeadlineRequest {
  @scala.inline
  def apply(
    ackDeadlineSeconds: Int | Double = null,
    ackId: String = null,
    ackIds: js.Array[String] = null,
    subscription: String = null
  ): SchemaModifyAckDeadlineRequest = {
    val __obj = js.Dynamic.literal()
    if (ackDeadlineSeconds != null) __obj.updateDynamic("ackDeadlineSeconds")(ackDeadlineSeconds.asInstanceOf[js.Any])
    if (ackId != null) __obj.updateDynamic("ackId")(ackId.asInstanceOf[js.Any])
    if (ackIds != null) __obj.updateDynamic("ackIds")(ackIds.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModifyAckDeadlineRequest]
  }
}

