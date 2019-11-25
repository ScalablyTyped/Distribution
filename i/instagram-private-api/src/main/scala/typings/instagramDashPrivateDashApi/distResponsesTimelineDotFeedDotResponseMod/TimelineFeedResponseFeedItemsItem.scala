package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseFeedItemsItem extends js.Object {
  var media_or_ad: TimelineFeedResponseMedia_or_ad
  var stories_netego: js.UndefOr[TimelineFeedResponseStories_netego] = js.undefined
}

object TimelineFeedResponseFeedItemsItem {
  @scala.inline
  def apply(
    media_or_ad: TimelineFeedResponseMedia_or_ad,
    stories_netego: TimelineFeedResponseStories_netego = null
  ): TimelineFeedResponseFeedItemsItem = {
    val __obj = js.Dynamic.literal(media_or_ad = media_or_ad.asInstanceOf[js.Any])
    if (stories_netego != null) __obj.updateDynamic("stories_netego")(stories_netego.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseFeedItemsItem]
  }
}

