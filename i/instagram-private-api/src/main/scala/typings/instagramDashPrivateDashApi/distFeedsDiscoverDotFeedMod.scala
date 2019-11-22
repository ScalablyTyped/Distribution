package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesDiscoverDotFeedDotResponseMod.DiscoverFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesMod.DiscoverFeedResponseUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/discover.feed", JSImport.Namespace)
@js.native
object distFeedsDiscoverDotFeedMod extends js.Object {
  @js.native
  class DiscoverFeed () extends Feed[DiscoverFeedResponseRootObject, DiscoverFeedResponseUser] {
    var nextMaxId: js.Any = js.native
    def request(): js.Promise[DiscoverFeedResponseRootObject] = js.native
  }
  
}

