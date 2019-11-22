package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseRootObject extends js.Object {
  var next_max_id: String | Null
  var status: String
  var total_viewer_count: Double
  var updated_media: ListReelMediaViewerFeedResponseUpdated_media
  var user_count: Double
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
}

object ListReelMediaViewerFeedResponseRootObject {
  @scala.inline
  def apply(
    status: String,
    total_viewer_count: Double,
    updated_media: ListReelMediaViewerFeedResponseUpdated_media,
    user_count: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem],
    next_max_id: String = null
  ): ListReelMediaViewerFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, total_viewer_count = total_viewer_count, updated_media = updated_media, user_count = user_count, users = users)
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id)
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseRootObject]
  }
}

