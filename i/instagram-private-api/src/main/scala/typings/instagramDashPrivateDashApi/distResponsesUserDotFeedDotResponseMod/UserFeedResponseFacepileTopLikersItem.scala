package typings.instagramDashPrivateDashApi.distResponsesUserDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFeedResponseFacepileTopLikersItem extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var username: String
}

object UserFeedResponseFacepileTopLikersItem {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String,
    profile_pic_id: String = null
  ): UserFeedResponseFacepileTopLikersItem = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_url = profile_pic_url, username = username)
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    __obj.asInstanceOf[UserFeedResponseFacepileTopLikersItem]
  }
}

