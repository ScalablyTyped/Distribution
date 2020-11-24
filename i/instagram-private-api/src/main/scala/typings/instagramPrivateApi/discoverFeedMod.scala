package typings.instagramPrivateApi

import typings.instagramPrivateApi.discoverFeedResponseMod.DiscoverFeedResponseRootObject
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.responsesMod.DiscoverFeedResponseUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/discover.feed", JSImport.Namespace)
@js.native
object discoverFeedMod extends js.Object {
  
  @js.native
  class DiscoverFeed () extends Feed[DiscoverFeedResponseRootObject, DiscoverFeedResponseUser] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[DiscoverFeedResponseRootObject] = js.native
  }
}
