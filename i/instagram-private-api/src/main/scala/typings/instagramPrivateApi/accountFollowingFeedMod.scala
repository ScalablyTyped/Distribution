package typings.instagramPrivateApi

import typings.instagramPrivateApi.accountFollowingFeedResponseMod.AccountFollowingFeedResponse
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.responsesMod.AccountFollowingFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/account-following.feed", JSImport.Namespace)
@js.native
object accountFollowingFeedMod extends js.Object {
  @js.native
  class AccountFollowingFeed () extends Feed[AccountFollowingFeedResponse, AccountFollowingFeedResponseUsersItem] {
    var id: Double | String = js.native
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[AccountFollowingFeedResponse] = js.native
  }
  
}

