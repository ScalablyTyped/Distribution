package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseEdgesItem
import typings.instagramPrivateApi.postsInsightsFeedResponseMod.PostsInsightsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postsInsightsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/posts-insights.feed", "PostsInsightsFeed")
  @js.native
  class PostsInsightsFeed protected () extends Feed[PostsInsightsFeedResponseRootObject, PostsInsightsFeedResponseEdgesItem] {
    def this(client: IgApiClient) = this()
    
    /* private */ var nextCursor: js.Any = js.native
    
    /* private */ var options: js.Any = js.native
    
    def request(): js.Promise[PostsInsightsFeedResponseRootObject] = js.native
  }
}
