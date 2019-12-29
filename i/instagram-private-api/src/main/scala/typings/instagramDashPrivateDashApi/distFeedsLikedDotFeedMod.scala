package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesLikedDotFeedDotResponseMod.LikedFeedResponseItemsItem
import typings.instagramDashPrivateDashApi.distResponsesLikedDotFeedDotResponseMod.LikedFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/liked.feed", JSImport.Namespace)
@js.native
object distFeedsLikedDotFeedMod extends js.Object {
  @js.native
  class LikedFeed () extends Feed[LikedFeedResponseRootObject, LikedFeedResponseItemsItem] {
    var maxId: js.Any = js.native
    def request(): js.Promise[LikedFeedResponseRootObject] = js.native
  }
  
}

