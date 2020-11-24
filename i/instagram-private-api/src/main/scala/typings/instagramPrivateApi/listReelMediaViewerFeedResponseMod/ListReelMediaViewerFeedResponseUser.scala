package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReelMediaViewerFeedResponseUser extends js.Object {
  
  var account_type: js.UndefOr[Double] = js.native
  
  var address_street: js.UndefOr[String] = js.native
  
  var allowed_commenter_type: js.UndefOr[String] = js.native
  
  var biography: js.UndefOr[String] = js.native
  
  var biography_with_entities: js.UndefOr[ListReelMediaViewerFeedResponseBiographyWithEntities] = js.native
  
  var business_contact_method: js.UndefOr[String] = js.native
  
  var can_boost_post: js.UndefOr[Boolean] = js.native
  
  var can_hide_category: js.UndefOr[Boolean] = js.native
  
  var can_hide_public_contacts: js.UndefOr[Boolean] = js.native
  
  var can_see_organic_insights: js.UndefOr[Boolean] = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var city_id: js.UndefOr[Double] = js.native
  
  var city_name: js.UndefOr[String] = js.native
  
  var contact_phone_number: js.UndefOr[String] = js.native
  
  var direct_messaging: js.UndefOr[String] = js.native
  
  var external_lynx_url: js.UndefOr[String] = js.native
  
  var external_url: js.UndefOr[String] = js.native
  
  var fb_page_call_to_action_id: js.UndefOr[String] = js.native
  
  var follower_count: js.UndefOr[Double] = js.native
  
  var following_count: js.UndefOr[Double] = js.native
  
  var following_tag_count: js.UndefOr[Double] = js.native
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  
  var has_biography_translation: js.UndefOr[Boolean] = js.native
  
  var instagram_location_id: js.UndefOr[String] = js.native
  
  var is_business: js.UndefOr[Boolean] = js.native
  
  var is_call_to_action_enabled: js.UndefOr[Boolean] = js.native
  
  var is_private: Boolean = js.native
  
  var is_unpublished: js.UndefOr[Boolean] = js.native
  
  var is_verified: Boolean = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  var media_count: js.UndefOr[Double] = js.native
  
  var mutual_followers_count: js.UndefOr[Double] = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var public_email: js.UndefOr[String] = js.native
  
  var public_phone_country_code: js.UndefOr[String] = js.native
  
  var public_phone_number: js.UndefOr[String] = js.native
  
  var reel_auto_archive: js.UndefOr[String] = js.native
  
  var should_show_category: js.UndefOr[Boolean] = js.native
  
  var should_show_public_contacts: js.UndefOr[Boolean] = js.native
  
  var should_show_tabbed_inbox: js.UndefOr[Boolean] = js.native
  
  var show_insights_terms: js.UndefOr[Boolean] = js.native
  
  var username: String = js.native
  
  var zip: js.UndefOr[String] = js.native
}
object ListReelMediaViewerFeedResponseUser {
  
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): ListReelMediaViewerFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseUser]
  }
  
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseUserOps[Self <: ListReelMediaViewerFeedResponseUser] (val x: Self) extends AnyVal {
    
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
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_type(value: Double): Self = this.set("account_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount_type: Self = this.set("account_type", js.undefined)
    
    @scala.inline
    def setAddress_street(value: String): Self = this.set("address_street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_street: Self = this.set("address_street", js.undefined)
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = this.set("allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_commenter_type: Self = this.set("allowed_commenter_type", js.undefined)
    
    @scala.inline
    def setBiography(value: String): Self = this.set("biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiography: Self = this.set("biography", js.undefined)
    
    @scala.inline
    def setBiography_with_entities(value: ListReelMediaViewerFeedResponseBiographyWithEntities): Self = this.set("biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiography_with_entities: Self = this.set("biography_with_entities", js.undefined)
    
    @scala.inline
    def setBusiness_contact_method(value: String): Self = this.set("business_contact_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusiness_contact_method: Self = this.set("business_contact_method", js.undefined)
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = this.set("can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_boost_post: Self = this.set("can_boost_post", js.undefined)
    
    @scala.inline
    def setCan_hide_category(value: Boolean): Self = this.set("can_hide_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_hide_category: Self = this.set("can_hide_category", js.undefined)
    
    @scala.inline
    def setCan_hide_public_contacts(value: Boolean): Self = this.set("can_hide_public_contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_hide_public_contacts: Self = this.set("can_hide_public_contacts", js.undefined)
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = this.set("can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_see_organic_insights: Self = this.set("can_see_organic_insights", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCity_id(value: Double): Self = this.set("city_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity_id: Self = this.set("city_id", js.undefined)
    
    @scala.inline
    def setCity_name(value: String): Self = this.set("city_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity_name: Self = this.set("city_name", js.undefined)
    
    @scala.inline
    def setContact_phone_number(value: String): Self = this.set("contact_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact_phone_number: Self = this.set("contact_phone_number", js.undefined)
    
    @scala.inline
    def setDirect_messaging(value: String): Self = this.set("direct_messaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirect_messaging: Self = this.set("direct_messaging", js.undefined)
    
    @scala.inline
    def setExternal_lynx_url(value: String): Self = this.set("external_lynx_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_lynx_url: Self = this.set("external_lynx_url", js.undefined)
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_url: Self = this.set("external_url", js.undefined)
    
    @scala.inline
    def setFb_page_call_to_action_id(value: String): Self = this.set("fb_page_call_to_action_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFb_page_call_to_action_id: Self = this.set("fb_page_call_to_action_id", js.undefined)
    
    @scala.inline
    def setFollower_count(value: Double): Self = this.set("follower_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollower_count: Self = this.set("follower_count", js.undefined)
    
    @scala.inline
    def setFollowing_count(value: Double): Self = this.set("following_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowing_count: Self = this.set("following_count", js.undefined)
    
    @scala.inline
    def setFollowing_tag_count(value: Double): Self = this.set("following_tag_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowing_tag_count: Self = this.set("following_tag_count", js.undefined)
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_anonymous_profile_picture: Self = this.set("has_anonymous_profile_picture", js.undefined)
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = this.set("has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_biography_translation: Self = this.set("has_biography_translation", js.undefined)
    
    @scala.inline
    def setInstagram_location_id(value: String): Self = this.set("instagram_location_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstagram_location_id: Self = this.set("instagram_location_id", js.undefined)
    
    @scala.inline
    def setIs_business(value: Boolean): Self = this.set("is_business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_business: Self = this.set("is_business", js.undefined)
    
    @scala.inline
    def setIs_call_to_action_enabled(value: Boolean): Self = this.set("is_call_to_action_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_call_to_action_enabled: Self = this.set("is_call_to_action_enabled", js.undefined)
    
    @scala.inline
    def setIs_unpublished(value: Boolean): Self = this.set("is_unpublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_unpublished: Self = this.set("is_unpublished", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_count: Self = this.set("media_count", js.undefined)
    
    @scala.inline
    def setMutual_followers_count(value: Double): Self = this.set("mutual_followers_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutual_followers_count: Self = this.set("mutual_followers_count", js.undefined)
    
    @scala.inline
    def setPublic_email(value: String): Self = this.set("public_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_email: Self = this.set("public_email", js.undefined)
    
    @scala.inline
    def setPublic_phone_country_code(value: String): Self = this.set("public_phone_country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_phone_country_code: Self = this.set("public_phone_country_code", js.undefined)
    
    @scala.inline
    def setPublic_phone_number(value: String): Self = this.set("public_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_phone_number: Self = this.set("public_phone_number", js.undefined)
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = this.set("reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReel_auto_archive: Self = this.set("reel_auto_archive", js.undefined)
    
    @scala.inline
    def setShould_show_category(value: Boolean): Self = this.set("should_show_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShould_show_category: Self = this.set("should_show_category", js.undefined)
    
    @scala.inline
    def setShould_show_public_contacts(value: Boolean): Self = this.set("should_show_public_contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShould_show_public_contacts: Self = this.set("should_show_public_contacts", js.undefined)
    
    @scala.inline
    def setShould_show_tabbed_inbox(value: Boolean): Self = this.set("should_show_tabbed_inbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShould_show_tabbed_inbox: Self = this.set("should_show_tabbed_inbox", js.undefined)
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = this.set("show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_insights_terms: Self = this.set("show_insights_terms", js.undefined)
    
    @scala.inline
    def setZip(value: String): Self = this.set("zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZip: Self = this.set("zip", js.undefined)
  }
}
