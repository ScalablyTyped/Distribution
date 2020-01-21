package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListTopicSubscriptions` method.
  */
@js.native
trait SchemaListTopicSubscriptionsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more subscriptions that match
    * the request; this value should be passed in a new
    * `ListTopicSubscriptionsRequest` to get more subscriptions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The names of the subscriptions that match the request.
    */
  var subscriptions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListTopicSubscriptionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, subscriptions: js.Array[String] = null): SchemaListTopicSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTopicSubscriptionsResponse]
  }
}

