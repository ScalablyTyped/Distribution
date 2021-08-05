package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseEdgesItem
import typings.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesInsightsFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/stories-insights.feed", "StoriesInsightsFeed")
  @js.native
  class StoriesInsightsFeed protected () extends Feed[StoriesInsightsFeedResponseRootObject, StoriesInsightsFeedResponseEdgesItem] {
    def this(client: IgApiClient) = this()
    
    /* private */ var nextCursor: js.Any = js.native
    
    def request(): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
    
    /* private */ var timeframe: js.Any = js.native
  }
}
