package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseItem
import typings.instagramPrivateApi.reelsMediaFeedResponseMod.ReelsMediaFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/reels-media.feed", JSImport.Namespace)
@js.native
object reelsMediaFeedMod extends js.Object {
  @js.native
  class ReelsMediaFeed () extends Feed[ReelsMediaFeedResponseRootObject, ReelsMediaFeedResponseItem] {
    var source: IgAppModule = js.native
    var userIds: js.Array[Double | String] = js.native
    def request(): js.Promise[ReelsMediaFeedResponseRootObject] = js.native
    /* protected */ def state(body: js.Any): js.Any = js.native
  }
  
}

