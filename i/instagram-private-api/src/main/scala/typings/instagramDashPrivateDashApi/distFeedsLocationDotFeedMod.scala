package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod.LocationFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesLocationDotFeedDotResponseMod.LocationFeedResponseMedia
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.ranked
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.recent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/location.feed", JSImport.Namespace)
@js.native
object distFeedsLocationDotFeedMod extends js.Object {
  @js.native
  class LocationFeed () extends Feed[LocationFeedResponse, LocationFeedResponseMedia] {
    var id: String | Double = js.native
    var nextMaxId: js.Any = js.native
    var nextMediaIds: js.Any = js.native
    var nextPage: js.Any = js.native
    var tab: recent | ranked = js.native
    def request(): js.Promise[LocationFeedResponse] = js.native
  }
  
}

