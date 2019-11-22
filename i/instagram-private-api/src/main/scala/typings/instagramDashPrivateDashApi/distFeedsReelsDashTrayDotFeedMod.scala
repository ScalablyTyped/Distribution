package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod.ReelsTrayFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod.ReelsTrayFeedResponseTrayItem
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.cold_start
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.pull_to_refresh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-tray.feed", JSImport.Namespace)
@js.native
object distFeedsReelsDashTrayDotFeedMod extends js.Object {
  @js.native
  class ReelsTrayFeed () extends Feed[ReelsTrayFeedResponseRootObject, ReelsTrayFeedResponseTrayItem] {
    var reason: cold_start | pull_to_refresh = js.native
    def request(): js.Promise[ReelsTrayFeedResponseRootObject] = js.native
  }
  
}

