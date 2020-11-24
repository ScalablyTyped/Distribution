package typings.instagramPrivateApi.accountRepositoryLoginResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRepositoryLoginResponseLoggedInUser extends js.Object {
  
  var account_type: Double = js.native
  
  var allow_contacts_sync: Boolean = js.native
  
  var allowed_commenter_type: String = js.native
  
  var can_boost_post: Boolean = js.native
  
  var can_see_organic_insights: Boolean = js.native
  
  var country_code: Double = js.native
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: Boolean = js.native
  
  var has_placed_orders: Boolean = js.native
  
  var is_business: Boolean = js.native
  
  var is_call_to_action_enabled: Null = js.native
  
  var is_private: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  var nametag: AccountRepositoryLoginResponseNametag = js.native
  
  var national_number: Double = js.native
  
  var phone_number: String = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var reel_auto_archive: String = js.native
  
  var show_insights_terms: Boolean = js.native
  
  var username: String = js.native
}
object AccountRepositoryLoginResponseLoggedInUser {
  
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
  ): AccountRepositoryLoginResponseLoggedInUser = {
    val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any], allow_contacts_sync = allow_contacts_sync.asInstanceOf[js.Any], allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], is_business = is_business.asInstanceOf[js.Any], is_call_to_action_enabled = is_call_to_action_enabled.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], nametag = nametag.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginResponseLoggedInUser]
  }
  
  @scala.inline
  implicit class AccountRepositoryLoginResponseLoggedInUserOps[Self <: AccountRepositoryLoginResponseLoggedInUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccount_type(value: Double): Self = this.set("account_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_contacts_sync(value: Boolean): Self = this.set("allow_contacts_sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = this.set("allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = this.set("can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = this.set("can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_code(value: Double): Self = this.set("country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_placed_orders(value: Boolean): Self = this.set("has_placed_orders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_business(value: Boolean): Self = this.set("is_business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_call_to_action_enabled(value: Null): Self = this.set("is_call_to_action_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNametag(value: AccountRepositoryLoginResponseNametag): Self = this.set("nametag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNational_number(value: Double): Self = this.set("national_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = this.set("reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = this.set("show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
