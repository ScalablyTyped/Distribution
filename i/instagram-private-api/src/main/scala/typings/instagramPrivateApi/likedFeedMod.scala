package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.likedFeedResponseMod.LikedFeedResponseItemsItem
import typings.instagramPrivateApi.likedFeedResponseMod.LikedFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object likedFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/liked.feed", "LikedFeed")
  @js.native
  class LikedFeed protected () extends Feed[LikedFeedResponseRootObject, LikedFeedResponseItemsItem] {
    def this(client: IgApiClient) = this()
    
    var maxId: js.Any = js.native
    
    def request(): js.Promise[LikedFeedResponseRootObject] = js.native
  }
}
