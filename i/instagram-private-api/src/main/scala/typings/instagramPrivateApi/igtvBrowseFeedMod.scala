package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.igtvBrowseFeedResponseMod.IgtvBrowseFeedResponseBrowseItemsItem
import typings.instagramPrivateApi.igtvBrowseFeedResponseMod.IgtvBrowseFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/igtv.browse.feed", JSImport.Namespace)
@js.native
object igtvBrowseFeedMod extends js.Object {
  @js.native
  class IgtvBrowseFeed () extends Feed[IgtvBrowseFeedResponseRootObject, IgtvBrowseFeedResponseBrowseItemsItem] {
    var isPrefetch: Boolean = js.native
    var maxId: js.Any = js.native
    def request(): js.Promise[IgtvBrowseFeedResponseRootObject] = js.native
    /* protected */ def state(response: js.Any): js.Any = js.native
  }
  
}

