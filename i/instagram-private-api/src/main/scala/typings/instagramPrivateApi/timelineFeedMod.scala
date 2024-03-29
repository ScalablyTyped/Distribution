package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponse
import typings.instagramPrivateApi.timelineFeedResponseMod.TimelineFeedResponseMediaOrAd
import typings.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedReason
import typings.instagramPrivateApi.timelineFeedTypesMod.TimelineFeedsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/timeline.feed", "TimelineFeed")
  @js.native
  class TimelineFeed protected () extends Feed[TimelineFeedResponse, TimelineFeedResponseMediaOrAd] {
    def this(client: IgApiClient) = this()
    
    /* private */ var nextMaxId: js.Any = js.native
    
    var reason: TimelineFeedReason = js.native
    
    def request(): js.Promise[TimelineFeedResponse] = js.native
    def request(options: TimelineFeedsOptions): js.Promise[TimelineFeedResponse] = js.native
    
    def state_=(body: js.Any): Unit = js.native
    
    var tag: String = js.native
  }
}
