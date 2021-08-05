package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseItemsItem
import typings.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicSearchFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-search.feed", "MusicSearchFeed")
  @js.native
  class MusicSearchFeed protected () extends Feed[MusicSearchFeedResponseRootObject, MusicSearchFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    /* protected */ var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    var query: String = js.native
    
    def request(): js.Promise[MusicSearchFeedResponseRootObject] = js.native
    
    var searchSessionId: String = js.native
    
    /* protected */ def state_=(response: js.Any): Unit = js.native
  }
}
