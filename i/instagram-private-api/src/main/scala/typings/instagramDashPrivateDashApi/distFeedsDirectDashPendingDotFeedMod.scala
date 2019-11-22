package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distEntitiesMod.DirectThreadEntity
import typings.instagramDashPrivateDashApi.distResponsesDirectDashInboxDotFeedDotResponseMod.DirectInboxFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesMod.DirectInboxFeedResponseThreadsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/direct-pending.feed", JSImport.Namespace)
@js.native
object distFeedsDirectDashPendingDotFeedMod extends js.Object {
  @js.native
  class DirectPendingInboxFeed () extends Feed[DirectInboxFeedResponse, DirectInboxFeedResponseThreadsItem] {
    var cursor: js.Any = js.native
    var seqId: js.Any = js.native
    def records(): js.Promise[js.Array[DirectThreadEntity]] = js.native
    def request(): js.Promise[DirectInboxFeedResponse] = js.native
  }
  
}

