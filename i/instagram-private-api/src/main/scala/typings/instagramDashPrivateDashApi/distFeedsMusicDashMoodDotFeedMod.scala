package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesMusicDashMoodDotFeedDotResponseMod.MusicMoodFeedResponseItemsItem
import typings.instagramDashPrivateDashApi.distResponsesMusicDashMoodDotFeedDotResponseMod.MusicMoodFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/music-mood.feed", JSImport.Namespace)
@js.native
object distFeedsMusicDashMoodDotFeedMod extends js.Object {
  @js.native
  class MusicMoodFeed () extends Feed[MusicMoodFeedResponseRootObject, MusicMoodFeedResponseItemsItem] {
    var id: Double | String = js.native
    var nextCursor: js.UndefOr[String] = js.native
    var product: IgAppModule = js.native
    def request(): js.Promise[MusicMoodFeedResponseRootObject] = js.native
  }
  
}

