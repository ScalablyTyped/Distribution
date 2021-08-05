package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.directInboxFeedResponseMod.DirectInboxFeedResponse
import typings.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.responsesMod.DirectInboxFeedResponseThreadsItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directPendingFeedMod {
  
  @JSImport("instagram-private-api/dist/feeds/direct-pending.feed", "DirectPendingInboxFeed")
  @js.native
  class DirectPendingInboxFeed protected () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    def this(client: IgApiClient) = this()
    
    /* private */ var cursor: js.Any = js.native
    
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
    
    /* private */ var seqId: js.Any = js.native
  }
}
