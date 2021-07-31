package typings.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReelMediaViewerFeedResponseUser extends StObject {
  
  var account_type: js.UndefOr[Double] = js.undefined
  
  var address_street: js.UndefOr[String] = js.undefined
  
  var allowed_commenter_type: js.UndefOr[String] = js.undefined
  
  var biography: js.UndefOr[String] = js.undefined
  
  var biography_with_entities: js.UndefOr[ListReelMediaViewerFeedResponseBiographyWithEntities] = js.undefined
  
  var business_contact_method: js.UndefOr[String] = js.undefined
  
  var can_boost_post: js.UndefOr[Boolean] = js.undefined
  
  var can_hide_category: js.UndefOr[Boolean] = js.undefined
  
  var can_hide_public_contacts: js.UndefOr[Boolean] = js.undefined
  
  var can_see_organic_insights: js.UndefOr[Boolean] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var city_id: js.UndefOr[Double] = js.undefined
  
  var city_name: js.UndefOr[String] = js.undefined
  
  var contact_phone_number: js.UndefOr[String] = js.undefined
  
  var direct_messaging: js.UndefOr[String] = js.undefined
  
  var external_lynx_url: js.UndefOr[String] = js.undefined
  
  var external_url: js.UndefOr[String] = js.undefined
  
  var fb_page_call_to_action_id: js.UndefOr[String] = js.undefined
  
  var follower_count: js.UndefOr[Double] = js.undefined
  
  var following_count: js.UndefOr[Double] = js.undefined
  
  var following_tag_count: js.UndefOr[Double] = js.undefined
  
  var full_name: String
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  
  var has_biography_translation: js.UndefOr[Boolean] = js.undefined
  
  var instagram_location_id: js.UndefOr[String] = js.undefined
  
  var is_business: js.UndefOr[Boolean] = js.undefined
  
  var is_call_to_action_enabled: js.UndefOr[Boolean] = js.undefined
  
  var is_private: Boolean
  
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  
  var is_verified: Boolean
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var media_count: js.UndefOr[Double] = js.undefined
  
  var mutual_followers_count: js.UndefOr[Double] = js.undefined
  
  var pk: Double
  
  var profile_pic_id: String
  
  var profile_pic_url: String
  
  var public_email: js.UndefOr[String] = js.undefined
  
  var public_phone_country_code: js.UndefOr[String] = js.undefined
  
  var public_phone_number: js.UndefOr[String] = js.undefined
  
  var reel_auto_archive: js.UndefOr[String] = js.undefined
  
  var should_show_category: js.UndefOr[Boolean] = js.undefined
  
  var should_show_public_contacts: js.UndefOr[Boolean] = js.undefined
  
  var should_show_tabbed_inbox: js.UndefOr[Boolean] = js.undefined
  
  var show_insights_terms: js.UndefOr[Boolean] = js.undefined
  
  var username: String
  
  var zip: js.UndefOr[String] = js.undefined
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
  implicit class ListReelMediaViewerFeedResponseUserMutableBuilder[Self <: ListReelMediaViewerFeedResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_type(value: Double): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_typeUndefined: Self = StObject.set(x, "account_type", js.undefined)
    
    @scala.inline
    def setAddress_street(value: String): Self = StObject.set(x, "address_street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_streetUndefined: Self = StObject.set(x, "address_street", js.undefined)
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_commenter_typeUndefined: Self = StObject.set(x, "allowed_commenter_type", js.undefined)
    
    @scala.inline
    def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiographyUndefined: Self = StObject.set(x, "biography", js.undefined)
    
    @scala.inline
    def setBiography_with_entities(value: ListReelMediaViewerFeedResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography_with_entitiesUndefined: Self = StObject.set(x, "biography_with_entities", js.undefined)
    
    @scala.inline
    def setBusiness_contact_method(value: String): Self = StObject.set(x, "business_contact_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_contact_methodUndefined: Self = StObject.set(x, "business_contact_method", js.undefined)
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_boost_postUndefined: Self = StObject.set(x, "can_boost_post", js.undefined)
    
    @scala.inline
    def setCan_hide_category(value: Boolean): Self = StObject.set(x, "can_hide_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_hide_categoryUndefined: Self = StObject.set(x, "can_hide_category", js.undefined)
    
    @scala.inline
    def setCan_hide_public_contacts(value: Boolean): Self = StObject.set(x, "can_hide_public_contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_hide_public_contactsUndefined: Self = StObject.set(x, "can_hide_public_contacts", js.undefined)
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_organic_insightsUndefined: Self = StObject.set(x, "can_see_organic_insights", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCity_id(value: Double): Self = StObject.set(x, "city_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity_idUndefined: Self = StObject.set(x, "city_id", js.undefined)
    
    @scala.inline
    def setCity_name(value: String): Self = StObject.set(x, "city_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity_nameUndefined: Self = StObject.set(x, "city_name", js.undefined)
    
    @scala.inline
    def setContact_phone_number(value: String): Self = StObject.set(x, "contact_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact_phone_numberUndefined: Self = StObject.set(x, "contact_phone_number", js.undefined)
    
    @scala.inline
    def setDirect_messaging(value: String): Self = StObject.set(x, "direct_messaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirect_messagingUndefined: Self = StObject.set(x, "direct_messaging", js.undefined)
    
    @scala.inline
    def setExternal_lynx_url(value: String): Self = StObject.set(x, "external_lynx_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_lynx_urlUndefined: Self = StObject.set(x, "external_lynx_url", js.undefined)
    
    @scala.inline
    def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urlUndefined: Self = StObject.set(x, "external_url", js.undefined)
    
    @scala.inline
    def setFb_page_call_to_action_id(value: String): Self = StObject.set(x, "fb_page_call_to_action_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFb_page_call_to_action_idUndefined: Self = StObject.set(x, "fb_page_call_to_action_id", js.undefined)
    
    @scala.inline
    def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollower_countUndefined: Self = StObject.set(x, "follower_count", js.undefined)
    
    @scala.inline
    def setFollowing_count(value: Double): Self = StObject.set(x, "following_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_countUndefined: Self = StObject.set(x, "following_count", js.undefined)
    
    @scala.inline
    def setFollowing_tag_count(value: Double): Self = StObject.set(x, "following_tag_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_tag_countUndefined: Self = StObject.set(x, "following_tag_count", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_biography_translationUndefined: Self = StObject.set(x, "has_biography_translation", js.undefined)
    
    @scala.inline
    def setInstagram_location_id(value: String): Self = StObject.set(x, "instagram_location_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_location_idUndefined: Self = StObject.set(x, "instagram_location_id", js.undefined)
    
    @scala.inline
    def setIs_business(value: Boolean): Self = StObject.set(x, "is_business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_businessUndefined: Self = StObject.set(x, "is_business", js.undefined)
    
    @scala.inline
    def setIs_call_to_action_enabled(value: Boolean): Self = StObject.set(x, "is_call_to_action_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_call_to_action_enabledUndefined: Self = StObject.set(x, "is_call_to_action_enabled", js.undefined)
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_unpublishedUndefined: Self = StObject.set(x, "is_unpublished", js.undefined)
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_countUndefined: Self = StObject.set(x, "media_count", js.undefined)
    
    @scala.inline
    def setMutual_followers_count(value: Double): Self = StObject.set(x, "mutual_followers_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutual_followers_countUndefined: Self = StObject.set(x, "mutual_followers_count", js.undefined)
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_email(value: String): Self = StObject.set(x, "public_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_emailUndefined: Self = StObject.set(x, "public_email", js.undefined)
    
    @scala.inline
    def setPublic_phone_country_code(value: String): Self = StObject.set(x, "public_phone_country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_phone_country_codeUndefined: Self = StObject.set(x, "public_phone_country_code", js.undefined)
    
    @scala.inline
    def setPublic_phone_number(value: String): Self = StObject.set(x, "public_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_phone_numberUndefined: Self = StObject.set(x, "public_phone_number", js.undefined)
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_auto_archiveUndefined: Self = StObject.set(x, "reel_auto_archive", js.undefined)
    
    @scala.inline
    def setShould_show_category(value: Boolean): Self = StObject.set(x, "should_show_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_show_categoryUndefined: Self = StObject.set(x, "should_show_category", js.undefined)
    
    @scala.inline
    def setShould_show_public_contacts(value: Boolean): Self = StObject.set(x, "should_show_public_contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_show_public_contactsUndefined: Self = StObject.set(x, "should_show_public_contacts", js.undefined)
    
    @scala.inline
    def setShould_show_tabbed_inbox(value: Boolean): Self = StObject.set(x, "should_show_tabbed_inbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_show_tabbed_inboxUndefined: Self = StObject.set(x, "should_show_tabbed_inbox", js.undefined)
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_insights_termsUndefined: Self = StObject.set(x, "show_insights_terms", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
  }
}
