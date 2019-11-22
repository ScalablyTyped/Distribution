package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod.PostsInsightsFeedResponseEdgesItem
import typings.instagramDashPrivateDashApi.distResponsesPostsDashInsightsDotFeedDotResponseMod.PostsInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/posts-insights.feed", JSImport.Namespace)
@js.native
object distFeedsPostsDashInsightsDotFeedMod extends js.Object {
  @js.native
  class PostsInsightsFeed () extends Feed[PostsInsightsFeedResponseRootObject, PostsInsightsFeedResponseEdgesItem] {
    var nextCursor: js.Any = js.native
    var options: js.Any = js.native
    def request(): js.Promise[PostsInsightsFeedResponseRootObject] = js.native
  }
  
}

