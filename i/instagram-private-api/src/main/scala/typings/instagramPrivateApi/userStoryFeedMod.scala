package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.userStoryFeedResponseMod.UserStoryFeedResponseItemsItem
import typings.instagramPrivateApi.userStoryFeedResponseMod.UserStoryFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/user-story.feed", JSImport.Namespace)
@js.native
object userStoryFeedMod extends js.Object {
  @js.native
  class UserStoryFeed () extends Feed[UserStoryFeedResponseRootObject, UserStoryFeedResponseItemsItem] {
    var userId: String | Double = js.native
    def request(): js.Promise[UserStoryFeedResponseRootObject] = js.native
    /* protected */ def state(response: js.Any): js.Any = js.native
  }
  
}

