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
    val __obj = js.Dynamic.literal(chaining_info = chaining_info.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_chaining_secondary_label = profile_chaining_secondary_label.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (profile_pic_id != null) __obj.updateDynamic("profile_pic_id")(profile_pic_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverRepositoryChainingResponseUsersItem]
  }
}

