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
  def apply(): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscription]
  }
  @scala.inline
  implicit class SchemaSubscriptionOps[Self <: SchemaSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentDetails(value: SchemaSubscriptionContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSnippet(value: SchemaSubscriptionSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setSubscriberSnippet(value: SchemaSubscriptionSubscriberSnippet): Self = this.set("subscriberSnippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriberSnippet: Self = this.set("subscriberSnippet", js.undefined)
  }
  
}

