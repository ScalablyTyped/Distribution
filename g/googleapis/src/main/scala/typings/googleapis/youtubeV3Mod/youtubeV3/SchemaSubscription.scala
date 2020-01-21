package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription resource contains information about a YouTube user
  * subscription. A subscription notifies a user when new videos are added to a
  * channel or when another user takes one of several actions on YouTube, such
  * as uploading a video, rating a video, or commenting on a video.
  */
@js.native
trait SchemaSubscription extends js.Object {
  /**
    * The contentDetails object contains basic statistics about the
    * subscription.
    */
  var contentDetails: js.UndefOr[SchemaSubscriptionContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#subscription&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the subscription,
    * including its title and the channel that the user subscribed to.
    */
  var snippet: js.UndefOr[SchemaSubscriptionSnippet] = js.native
  /**
    * The subscriberSnippet object contains basic details about the sbuscriber.
    */
  var subscriberSnippet: js.UndefOr[SchemaSubscriptionSubscriberSnippet] = js.native
}

object SchemaSubscription {
  @scala.inline
  def apply(
    contentDetails: SchemaSubscriptionContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: SchemaSubscriptionSnippet = null,
    subscriberSnippet: SchemaSubscriptionSubscriberSnippet = null
  ): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (subscriberSnippet != null) __obj.updateDynamic("subscriberSnippet")(subscriberSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscription]
  }
}

