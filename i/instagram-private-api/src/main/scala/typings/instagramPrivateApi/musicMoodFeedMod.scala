package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.musicMoodFeedResponseMod.MusicMoodFeedResponseItemsItem
import typings.instagramPrivateApi.musicMoodFeedResponseMod.MusicMoodFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicMoodFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/music-mood.feed", "MusicMoodFeed")
  @js.native
  class MusicMoodFeed protected () extends Feed[MusicMoodFeedResponseRootObject, MusicMoodFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var id: Double | String = js.native
    
    var nextCursor: js.UndefOr[String] = js.native
    
    var product: IgAppModule = js.native
    
    def request(): js.Promise[MusicMoodFeedResponseRootObject] = js.native
  }
}
