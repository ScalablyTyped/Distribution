package typings.instagramDashPrivateDashApi.distResponsesDiscoverDotRepositoryDotChainingDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverRepositoryChainingResponseUsersItem extends js.Object {
  var chaining_info: DiscoverRepositoryChainingResponseChaining_info
  var full_name: String
  var is_private: Boolean
  var is_verified: Boolean
  var pk: Double
  var profile_chaining_secondary_label: String
  var profile_pic_id: js.UndefOr[String] = js.undefined
  var profile_pic_url: String
  var social_context: String
  var username: String
}

object DiscoverRepositoryChainingResponseUsersItem {
  @scala.inline
  def apply(
    chaining_info: DiscoverRepositoryChainingResponseChaining_info,
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_chaining_secondary_label: String,
    profile_pic_url: String,
    social_context: String,
    username: String,
    profile_pic_id: String = null
  ): DiscoverRepositoryChainingResponseUsersItem = {
    val __obj = js.Dynamic.literal(chaining_info = chaining_info, full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_chaining_secondary_label = profile_chaining_secondary_label, profile_pic_url = profile_pic_url, social_context = social_context, username = username)
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id)
    __obj.asInstanceOf[DiscoverRepositoryChainingResponseUsersItem]
  }
}

