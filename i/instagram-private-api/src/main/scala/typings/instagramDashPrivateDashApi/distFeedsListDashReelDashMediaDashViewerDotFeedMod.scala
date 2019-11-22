package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreFeedMod.Feed
import typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod.ListReelMediaViewerFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod.ListReelMediaViewerFeedResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/feeds/list-reel-media-viewer.feed", JSImport.Namespace)
@js.native
object distFeedsListDashReelDashMediaDashViewerDotFeedMod extends js.Object {
  @js.native
  class ListReelMediaViewerFeed () extends Feed[
          ListReelMediaViewerFeedResponseRootObject, 
          ListReelMediaViewerFeedResponseUsersItem
        ] {
    var mediaId: js.Any = js.native
    var nextMaxId: js.UndefOr[js.Any] = js.native
    def request(): js.Promise[ListReelMediaViewerFeedResponseRootObject] = js.native
  }
  
}

