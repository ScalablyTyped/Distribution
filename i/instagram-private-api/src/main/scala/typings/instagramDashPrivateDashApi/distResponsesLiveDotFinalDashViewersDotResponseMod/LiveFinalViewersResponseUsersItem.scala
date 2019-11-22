package typings.instagramDashPrivateDashApi.distResponsesLiveDotFinalDashViewersDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveFinalViewersResponseUsersItem extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object LiveFinalViewersResponseUsersItem {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): LiveFinalViewersResponseUsersItem = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
  
    __obj.asInstanceOf[LiveFinalViewersResponseUsersItem]
  }
}

