package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesAccountDashFriendshipsDotFeedDotResponseMod.PendingFriendshipsFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesMod.PendingFriendshipsFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/account-friendships.feed", JSImport.Namespace)
@js.native
object distFeedsAccountDashFriendshipsDotFeedMod extends js.Object {
  @js.native
  class PendingFriendshipsFeed () extends Feed[PendingFriendshipsFeedResponse, PendingFriendshipsFeedResponseUsersItem] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[PendingFriendshipsFeedResponse] = js.native
  }
  
}

