package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseItemsItem
import typings.instagramPrivateApi.musicTrendingFeedResponseMod.MusicTrendingFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicTrendingFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-trending.feed", "MusicTrendingFeed")
  @js.native
  class MusicTrendingFeed protected () extends Feed[MusicTrendingFeedResponseRootObject, MusicTrendingFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    /* protected */ var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicTrendingFeedResponseRootObject] = js.native
  }
}
