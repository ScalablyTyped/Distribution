package typings.instagramDashPrivateDashApi.distResponsesMediaDotRepositoryDotLikersDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRepositoryLikersResponseUsersItem extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var latest_reel_media: js.UndefOr[Double] = js.undefined
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object MediaRepositoryLikersResponseUsersItem {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    latest_reel_media: Int | Double = null,
    profile_pic_id: String = null
  ): MediaRepositoryLikersResponseUsersItem = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_url = profile_pic_url, username = username)
    if (latest_reel_media != null) __obj.updateDynamic("latest_reel_media")(latest_reel_media.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    __obj.asInstanceOf[MediaRepositoryLikersResponseUsersItem]
  }
}

