package typings.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotLoginDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryLoginResponseLogged_in_user extends js.Object {
  var account_type: Double
  var allow_contacts_sync: Boolean
  var allowed_commenter_type: String
  var can_boost_post: Boolean
  var can_see_organic_insights: Boolean
  var country_code: Double
  var full_name: String
  var has_anonymous_profile_picture: Boolean
  var has_placed_orders: Boolean
  var is_business: Boolean
  var is_call_to_action_enabled: Null
  var is_private: Boolean
  var is_verified: Boolean
  var nametag: AccountRepositoryLoginResponseNametag
  var national_number: Double
  var phone_number: String
  var pk: Double
  var profile_pic_id: String
  var profile_pic_url: String
  var reel_auto_archive: String
  var show_insights_terms: Boolean
  var username: String
}

object AccountRepositoryLoginResponseLogged_in_user {
  @scala.inline
  def apply(
    account_type: Double,
    allow_contacts_sync: Boolean,
    allowed_commenter_type: String,
    can_boost_post: Boolean,
    can_see_organic_insights: Boolean,
    country_code: Double,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    has_placed_orders: Boolean,
    is_business: Boolean,
    is_call_to_action_enabled: Null,
    is_private: Boolean,
    is_verified: Boolean,
    nametag: AccountRepositoryLoginResponseNametag,
    national_number: Double,
    phone_number: String,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    reel_auto_archive: String,
    show_insights_terms: Boolean,
    username: String
  ): AccountRepositoryLoginResponseLogged_in_user = {
    val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any], allow_contacts_sync = allow_contacts_sync.asInstanceOf[js.Any], allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], is_business = is_business.asInstanceOf[js.Any], is_call_to_action_enabled = is_call_to_action_enabled.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], nametag = nametag.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountRepositoryLoginResponseLogged_in_user]
  }
}

