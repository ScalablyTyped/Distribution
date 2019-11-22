package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseUser extends js.Object {
  var friendship_status: js.UndefOr[ReelsTrayFeedResponseFriendship_status] = js.undefined
  var full_name: js.UndefOr[String] = js.undefined
  var is_private: js.UndefOr[Boolean] = js.undefined
  var is_verified: js.UndefOr[Boolean] = js.undefined
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ReelsTrayFeedResponseUser {
  @scala.inline
  def apply(
    pk: Double,
    friendship_status: ReelsTrayFeedResponseFriendship_status = null,
    full_name: String = null,
    is_private: js.UndefOr[Boolean] = js.undefined,
    is_verified: js.UndefOr[Boolean] = js.undefined,
    profile_pic_id: String = null,
    profile_pic_url: String = null,
    username: String = null
  ): ReelsTrayFeedResponseUser = {
    val __obj = js.Dynamic.literal(pk = pk)
    if (friendship_status != null) __obj.updateDynamic("friendship_status")(friendship_status)
    if (full_name != null) __obj.updateDynamic("full_name")(full_name)
    if (!js.isUndefined(is_private)) __obj.updateDynamic("is_private")(is_private)
    if (!js.isUndefined(is_verified)) __obj.updateDynamic("is_verified")(is_verified)
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    if (profile_pic_url != null) __obj.updateDynamic("profile_pic_url")(profile_pic_url)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ReelsTrayFeedResponseUser]
  }
}

