package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesMusicDashTrendingDotFeedDotResponseMod.MusicTrendingFeedResponseItemsItem
import typings.instagramDashPrivateDashApi.distResponsesMusicDashTrendingDotFeedDotResponseMod.MusicTrendingFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-trending.feed", JSImport.Namespace)
@js.native
object distFeedsMusicDashTrendingDotFeedMod extends js.Object {
  @js.native
  class MusicTrendingFeed () extends Feed[MusicTrendingFeedResponseRootObject, MusicTrendingFeedResponseItemsItem] {
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    def request(): js.Promise[MusicTrendingFeedResponseRootObject] = js.native
  }
  
}

