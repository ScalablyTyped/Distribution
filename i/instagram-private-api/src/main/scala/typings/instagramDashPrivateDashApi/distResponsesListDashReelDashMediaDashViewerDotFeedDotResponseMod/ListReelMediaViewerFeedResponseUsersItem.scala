package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseUsersItem extends js.Object {
  var friendship_status: js.UndefOr[ListReelMediaViewerFeedResponseFriendship_status] = js.undefined
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object ListReelMediaViewerFeedResponseUsersItem {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String,
    friendship_status: ListReelMediaViewerFeedResponseFriendship_status = null,
    latest_reel_media: Int | Double = null
  ): ListReelMediaViewerFeedResponseUsersItem = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
    if (friendship_status != null) __obj.updateDynamic("friendship_status")(friendship_status)
    if (latest_reel_media != null) __obj.updateDynamic("latest_reel_media")(latest_reel_media.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseUsersItem]
  }
}

