package typings.instagramDashPrivateDashApi.distResponsesLiveDotCommentsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveCommentsResponseUser extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var live_with_eligibility: js.UndefOr[String] = js.undefined
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object LiveCommentsResponseUser {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String,
    live_with_eligibility: String = null
  ): LiveCommentsResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
    if (live_with_eligibility != null) __obj.updateDynamic("live_with_eligibility")(live_with_eligibility)
    __obj.asInstanceOf[LiveCommentsResponseUser]
  }
}

