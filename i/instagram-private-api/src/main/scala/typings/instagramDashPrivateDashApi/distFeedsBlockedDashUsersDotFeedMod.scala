package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesBlockedDashUsersDotFeedDotResponseMod.BlockedUsersFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesMod.BlockedUsersFeedResponseBlockedListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/blocked-users.feed", JSImport.Namespace)
@js.native
object distFeedsBlockedDashUsersDotFeedMod extends js.Object {
  @js.native
  class BlockedUsersFeed () extends Feed[BlockedUsersFeedResponseRootObject, BlockedUsersFeedResponseBlockedListItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[BlockedUsersFeedResponseRootObject] = js.native
  }
  
}

