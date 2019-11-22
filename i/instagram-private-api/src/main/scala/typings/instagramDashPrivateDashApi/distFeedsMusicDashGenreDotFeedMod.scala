package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesMusicDashGenreDotFeedDotResponseMod.MusicGenreFeedResponseItemsItem
import typings.instagramDashPrivateDashApi.distResponsesMusicDashGenreDotFeedDotResponseMod.MusicGenreFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-genre.feed", JSImport.Namespace)
@js.native
object distFeedsMusicDashGenreDotFeedMod extends js.Object {
  @js.native
  class MusicGenreFeed () extends Feed[MusicGenreFeedResponseRootObject, MusicGenreFeedResponseItemsItem] {
    var id: Double | String = js.native
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    def request(): js.Promise[MusicGenreFeedResponseRootObject] = js.native
  }
  
}

