package typings.instagramPrivateApi

import typings.instagramPrivateApi.blockedUsersFeedResponseMod.BlockedUsersFeedResponseRootObject
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.responsesMod.BlockedUsersFeedResponseBlockedListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/blocked-users.feed", JSImport.Namespace)
@js.native
object blockedUsersFeedMod extends js.Object {
  
  @js.native
  class BlockedUsersFeed () extends Feed[BlockedUsersFeedResponseRootObject, BlockedUsersFeedResponseBlockedListItem] {
    
    var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[BlockedUsersFeedResponseRootObject] = js.native
  }
}
