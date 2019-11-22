package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod.TagsFeedResponse
import typings.instagramDashPrivateDashApi.distResponsesTagsDotFeedDotResponseMod.TagsFeedResponseMedia
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.places
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.recent
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/tags.feed", JSImport.Namespace)
@js.native
object distFeedsTagsDotFeedMod extends js.Object {
  @js.native
  class TagsFeed () extends Feed[TagsFeedResponse, TagsFeedResponseMedia] {
    var nextMaxId: js.Any = js.native
    var nextMediaIds: js.Any = js.native
    var nextPage: js.Any = js.native
    var tab: top | recent | places = js.native
    var tag: String = js.native
    def request(): js.Promise[TagsFeedResponse] = js.native
  }
  
}

