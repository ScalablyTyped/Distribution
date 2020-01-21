package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start
import typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
import typings.instagramPrivateApi.reelsTrayFeedResponseMod.ReelsTrayFeedResponseRootObject
import typings.instagramPrivateApi.reelsTrayFeedResponseMod.ReelsTrayFeedResponseTrayItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-tray.feed", JSImport.Namespace)
@js.native
object reelsTrayFeedMod extends js.Object {
  @js.native
  class ReelsTrayFeed () extends Feed[ReelsTrayFeedResponseRootObject, ReelsTrayFeedResponseTrayItem] {
    var reason: cold_start | pull_to_refresh = js.native
    def request(): js.Promise[ReelsTrayFeedResponseRootObject] = js.native
  }
  
}

