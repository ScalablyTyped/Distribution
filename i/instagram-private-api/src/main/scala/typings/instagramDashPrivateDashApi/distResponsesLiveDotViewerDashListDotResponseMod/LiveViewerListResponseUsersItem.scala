package typings.instagramDashPrivateDashApi.distResponsesLiveDotViewerDashListDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveViewerListResponseUsersItem extends js.Object {
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var live_with_eligibility: String
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var username: String
}

object LiveViewerListResponseUsersItem {
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    live_with_eligibility: String,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): LiveViewerListResponseUsersItem = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, live_with_eligibility = live_with_eligibility, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
  
    __obj.asInstanceOf[LiveViewerListResponseUsersItem]
  }
}

