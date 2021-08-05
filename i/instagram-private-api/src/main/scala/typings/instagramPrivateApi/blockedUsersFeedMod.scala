package typings.instagramPrivateApi

import typings.instagramPrivateApi.blockedUsersFeedResponseMod.BlockedUsersFeedResponseRootObject
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.responsesMod.BlockedUsersFeedResponseBlockedListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockedUsersFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/blocked-users.feed", "BlockedUsersFeed")
  @js.native
  class BlockedUsersFeed protected () extends Feed[BlockedUsersFeedResponseRootObject, BlockedUsersFeedResponseBlockedListItem] {
    def this(client: IgApiClient) = this()
    
    /* private */ var nextMaxId: js.Any = js.native
    
    def request(): js.Promise[BlockedUsersFeedResponseRootObject] = js.native
  }
}
