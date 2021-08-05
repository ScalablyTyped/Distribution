package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseItemsItem
import typings.instagramPrivateApi.musicGenreFeedResponseMod.MusicGenreFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicGenreFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-genre.feed", "MusicGenreFeed")
  @js.native
  class MusicGenreFeed protected () extends Feed[MusicGenreFeedResponseRootObject, MusicGenreFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var id: Double | String = js.native
    
    /* protected */ var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicGenreFeedResponseRootObject] = js.native
  }
}
