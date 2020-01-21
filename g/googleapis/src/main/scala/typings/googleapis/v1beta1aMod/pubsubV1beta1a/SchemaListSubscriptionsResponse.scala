package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the ListSubscriptions method.
  */
@js.native
trait SchemaListSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there are more subscriptions that match the
    * request and this value should be passed to the next
    * &lt;code&gt;ListSubscriptionsRequest&lt;/code&gt; to continue.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The subscriptions that match the request.
    */
  var subscription: js.UndefOr[js.Array[SchemaSubscription]] = js.native
}

object SchemaListSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subscription: js.Array[SchemaSubscription] = null): SchemaListSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListSubscriptionsResponse]
  }
}

