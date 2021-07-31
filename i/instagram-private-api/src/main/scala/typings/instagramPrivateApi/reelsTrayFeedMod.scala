package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start
import typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
import typings.instagramPrivateApi.reelsTrayFeedResponseMod.ReelsTrayFeedResponseRootObject
import typings.instagramPrivateApi.reelsTrayFeedResponseMod.ReelsTrayFeedResponseTrayItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reelsTrayFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/reels-tray.feed", "ReelsTrayFeed")
  @js.native
  class ReelsTrayFeed protected () extends Feed[ReelsTrayFeedResponseRootObject, ReelsTrayFeedResponseTrayItem] {
    def this(client: IgApiClient) = this()
    
    var reason: cold_start | pull_to_refresh = js.native
    
    def request(): js.Promise[ReelsTrayFeedResponseRootObject] = js.native
  }
}
