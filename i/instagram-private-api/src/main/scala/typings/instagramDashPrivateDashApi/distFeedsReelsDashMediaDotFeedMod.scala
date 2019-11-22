package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod.ReelsMediaFeedResponseItem
import typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod.ReelsMediaFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-media.feed", JSImport.Namespace)
@js.native
object distFeedsReelsDashMediaDotFeedMod extends js.Object {
  @js.native
  class ReelsMediaFeed () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    var source: IgAppModule = js.native
    var userIds: js.Array[Double | String] = js.native
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
  }
  
}

