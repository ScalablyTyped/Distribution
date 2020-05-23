package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseRootObject extends js.Object {
  var next_max_id: String | Null
  var status: String
  var total_viewer_count: Double
  var updated_media: ListReelMediaViewerFeedResponseUpdatedMedia
  var user_count: Double
  var users: js.Array[ListReelMediaViewerFeedResponseUsersItem]
}

object ListReelMediaViewerFeedResponseRootObject {
  @scala.inline
  def apply(
    status: String,
    total_viewer_count: Double,
    updated_media: ListReelMediaViewerFeedResponseUpdatedMedia,
    user_count: Double,
    users: js.Array[ListReelMediaViewerFeedResponseUsersItem],
    next_max_id: String = null
  ): ListReelMediaViewerFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_viewer_count = total_viewer_count.asInstanceOf[js.Any], updated_media = updated_media.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseRootObject]
  }
}

