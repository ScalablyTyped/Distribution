package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod.TimelineFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod.TimelineFeedResponseMedia_or_ad
import typings.instagramDashPrivateDashApi.distTypesTimelineDashFeedDotTypesMod.TimelineFeedReason
import typings.instagramDashPrivateDashApi.distTypesTimelineDashFeedDotTypesMod.TimelineFeedsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/timeline.feed", JSImport.Namespace)
@js.native
object distFeedsTimelineDotFeedMod extends js.Object {
  @js.native
  class TimelineFeed () extends Feed[TimelineFeedResponse, TimelineFeedResponseMedia_or_ad] {
    var nextMaxId: js.Any = js.native
    var reason: TimelineFeedReason = js.native
    var tag: String = js.native
    def request(): js.Promise[TimelineFeedResponse] = js.native
    def request(options: TimelineFeedsOptions): js.Promise[TimelineFeedResponse] = js.native
  }
  
}

