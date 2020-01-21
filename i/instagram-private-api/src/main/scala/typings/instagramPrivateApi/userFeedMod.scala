package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.userFeedResponseMod.UserFeedResponse
import typings.instagramPrivateApi.userFeedResponseMod.UserFeedResponseItemsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/user.feed", JSImport.Namespace)
@js.native
object userFeedMod extends js.Object {
  @js.native
  class UserFeed () extends Feed[UserFeedResponse, UserFeedResponseItemsItem] {
    var id: Double | String = js.native
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[UserFeedResponse] = js.native
  }
  
}

