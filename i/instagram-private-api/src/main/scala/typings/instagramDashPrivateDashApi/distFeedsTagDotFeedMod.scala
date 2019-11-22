package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod.TagFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod.TagFeedResponseItemsItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/tag.feed", JSImport.Namespace)
@js.native
object distFeedsTagDotFeedMod extends js.Object {
  @js.native
  class TagFeed () extends Feed[TagFeedResponse, TagFeedResponseItemsItem] {
    var nextMaxId: js.Any = js.native
    var tag: String = js.native
    def request(): js.Promise[TagFeedResponse] = js.native
  }
  
}

