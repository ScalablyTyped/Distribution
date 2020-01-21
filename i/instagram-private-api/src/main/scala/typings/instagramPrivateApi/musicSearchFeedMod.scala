package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseItemsItem
import typings.instagramPrivateApi.musicSearchFeedResponseMod.MusicSearchFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-search.feed", JSImport.Namespace)
@js.native
object musicSearchFeedMod extends js.Object {
  @js.native
  class MusicSearchFeed () extends Feed[MusicSearchFeedResponseRootObject, MusicSearchFeedResponseItemsItem] {
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    var query: String = js.native
    var searchSessionId: String = js.native
    def request(): js.Promise[MusicSearchFeedResponseRootObject] = js.native
    /* protected */ def state(response: js.Any): js.Any = js.native
  }
  
}

