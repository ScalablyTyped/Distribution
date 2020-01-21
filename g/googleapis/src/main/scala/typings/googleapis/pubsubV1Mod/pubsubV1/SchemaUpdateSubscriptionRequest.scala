package typings.googleapis.pubsubV1Mod.pubsubV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the UpdateSubscription method.
  */
@js.native
trait SchemaUpdateSubscriptionRequest extends js.Object {
  /**
    * The updated subscription object.
    */
  var subscription: js.UndefOr[SchemaSubscription] = js.native
  /**
    * Indicates which fields in the provided subscription to update. Must be
    * specified and non-empty.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaUpdateSubscriptionRequest {
  @scala.inline
  def apply(subscription: SchemaSubscription = null, updateMask: String = null): SchemaUpdateSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateSubscriptionRequest]
  }
}

