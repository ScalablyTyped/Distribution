package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event indicating a received message or truncation event.
  */
@js.native
trait SchemaPubsubEvent extends js.Object {
  /**
    * Indicates that this subscription has been deleted. (Note that pull
    * subscribers will always receive NOT_FOUND in response in their pull
    * request on the subscription, rather than seeing this boolean.)
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * A received message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
  /**
    * The subscription that received the event.
    */
  var subscription: js.UndefOr[String] = js.native
  /**
    * Indicates that this subscription has been truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.native
}

object SchemaPubsubEvent {
  @scala.inline
  def apply(
    deleted: js.UndefOr[Boolean] = js.undefined,
    message: SchemaPubsubMessage = null,
    subscription: String = null,
    truncated: js.UndefOr[Boolean] = js.undefined
  ): SchemaPubsubEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (!js.isUndefined(truncated)) __obj.updateDynamic("truncated")(truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPubsubEvent]
  }
}

