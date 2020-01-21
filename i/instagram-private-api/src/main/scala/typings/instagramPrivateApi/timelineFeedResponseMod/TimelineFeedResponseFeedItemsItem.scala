package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseFeedItemsItem extends js.Object {
  var media_or_ad: TimelineFeedResponseMediaOrAd
  var stories_netego: js.UndefOr[TimelineFeedResponseStoriesNetego] = js.undefined
}

object TimelineFeedResponseFeedItemsItem {
  @scala.inline
  def apply(
    media_or_ad: TimelineFeedResponseMediaOrAd,
    stories_netego: TimelineFeedResponseStoriesNetego = null
  ): TimelineFeedResponseFeedItemsItem = {
    val __obj = js.Dynamic.literal(media_or_ad = media_or_ad.asInstanceOf[js.Any])
    if (stories_netego != null) __obj.updateDynamic("stories_netego")(stories_netego.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseFeedItemsItem]
  }
}

