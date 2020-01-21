package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Subscriptions. This is the response from the server to GET
  * requests on the subscription collection.
  */
@js.native
trait SchemaSubscriptionsListResponse extends js.Object {
  /**
    * The list of subscriptions.
    */
  var items: js.UndefOr[js.Array[SchemaSubscription]] = js.native
  /**
    * The type of resource. This is always mirror#subscriptionsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSubscriptionsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaSubscription] = null, kind: String = null): SchemaSubscriptionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionsListResponse]
  }
}

