package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesAccountDashFollowingDotFeedDotResponseMod.AccountFollowingFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesMod.AccountFollowingFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/account-following.feed", JSImport.Namespace)
@js.native
object distFeedsAccountDashFollowingDotFeedMod extends js.Object {
  @js.native
  class AccountFollowingFeed () extends Feed[AccountFollowingFeedResponse, AccountFollowingFeedResponseUsersItem] {
    var id: Double | String = js.native
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[AccountFollowingFeedResponse] = js.native
  }
  
}

