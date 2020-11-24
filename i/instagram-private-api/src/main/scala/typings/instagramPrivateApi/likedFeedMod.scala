package typings.instagramPrivateApi

import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.likedFeedResponseMod.LikedFeedResponseItemsItem
import typings.instagramPrivateApi.likedFeedResponseMod.LikedFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/liked.feed", JSImport.Namespace)
@js.native
object likedFeedMod extends js.Object {
  
  @js.native
  class LikedFeed () extends Feed[LikedFeedResponseRootObject, LikedFeedResponseItemsItem] {
    
    var maxId: js.Any = js.native
    
    def request(): js.Promise[LikedFeedResponseRootObject] = js.native
  }
}
