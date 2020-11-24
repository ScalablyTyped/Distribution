package typings.instagramPrivateApi

import typings.instagramPrivateApi.directInboxFeedResponseMod.DirectInboxFeedResponse
import typings.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typings.instagramPrivateApi.feedMod.Feed
import typings.instagramPrivateApi.responsesMod.DirectInboxFeedResponseThreadsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/feeds/direct-pending.feed", JSImport.Namespace)
@js.native
object directPendingFeedMod extends js.Object {
  
  @js.native
  class DirectPendingInboxFeed () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    
    var cursor: js.Any = js.native
    
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
    
    var seqId: js.Any = js.native
  }
}
