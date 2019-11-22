package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod.UserStoryFeedResponseItemsItem
import typings.instagramDashPrivateDashApi.distResponsesUserDashStoryDotFeedDotResponseMod.UserStoryFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/user-story.feed", JSImport.Namespace)
@js.native
object distFeedsUserDashStoryDotFeedMod extends js.Object {
  @js.native
  class UserStoryFeed () extends Feed[UserStoryFeedResponseRootObject, UserStoryFeedResponseItemsItem] {
    var userId: String | Double = js.native
    def request(): js.Promise[UserStoryFeedResponseRootObject] = js.native
  }
  
}

