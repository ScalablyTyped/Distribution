package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseEdgesItem
import typings.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/posts-insights.feed", JSImport.Namespace)
@js.native
object postsInsightsFeedMod extends js.Object {
  @js.native
  class PostsInsightsFeed () extends Feed[PostsInsightsFeedResponseRootObject, PostsInsightsFeedResponseEdgesItem] {
    var nextCursor: js.Any = js.native
    var options: js.Any = js.native
    def request(): js.Promise[PostsInsightsFeedResponseRootObject] = js.native
  }
  
}

