package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesUserDotFeedDotResponseMod.UserFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesUserDotFeedDotResponseMod.UserFeedResponseItemsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/user.feed", JSImport.Namespace)
@js.native
object distFeedsUserDotFeedMod extends js.Object {
  @js.native
  class UserFeed () extends Feed[UserFeedResponse, UserFeedResponseItemsItem] {
    var id: Double | String = js.native
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[UserFeedResponse] = js.native
  }
  
}

