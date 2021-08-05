package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userRepositoryInfoResponseMod {
  
  trait UserRepositoryInfoResponseBiographyWithEntities extends StObject {
    
    var entities: js.Array[js.Any]
    
    var raw_text: String
  }
  object UserRepositoryInfoResponseBiographyWithEntities {
    
    inline def apply(entities: js.Array[js.Any], raw_text: String): UserRepositoryInfoResponseBiographyWithEntities = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw_text = raw_text.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositoryInfoResponseBiographyWithEntities]
    }
    
    extension [Self <: UserRepositoryInfoResponseBiographyWithEntities](x: Self) {
      
      inline def setEntities(value: js.Array[js.Any]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setEntitiesVarargs(value: js.Any*): Self = StObject.set(x, "entities", js.Array(value :_*))
      
      inline def setRaw_text(value: String): Self = StObject.set(x, "raw_text", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepositoryInfoResponseHdProfilePicUrlInfo extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object UserRepositoryInfoResponseHdProfilePicUrlInfo {
    
    inline def apply(height: Double, url: String, width: Double): UserRepositoryInfoResponseHdProfilePicUrlInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositoryInfoResponseHdProfilePicUrlInfo]
    }
    
    extension [Self <: UserRepositoryInfoResponseHdProfilePicUrlInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepositoryInfoResponseHdProfilePicVersionsItem extends StObject {
    
    var height: Double
    
    var url: String
    
    var width: Double
  }
  object UserRepositoryInfoResponseHdProfilePicVersionsItem {
    
    inline def apply(height: Double, url: String, width: Double): UserRepositoryInfoResponseHdProfilePicVersionsItem = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositoryInfoResponseHdProfilePicVersionsItem]
    }
    
    extension [Self <: UserRepositoryInfoResponseHdProfilePicVersionsItem](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepositoryInfoResponseNametag extends StObject {
    
    var emoji: String
    
    var gradient: String
    
    var mode: Double
    
    var selfie_sticker: String
  }
  object UserRepositoryInfoResponseNametag {
    
    inline def apply(emoji: String, gradient: String, mode: Double, selfie_sticker: String): UserRepositoryInfoResponseNametag = {
      val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], selfie_sticker = selfie_sticker.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositoryInfoResponseNametag]
    }
    
    extension [Self <: UserRepositoryInfoResponseNametag](x: Self) {
      
      inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setGradient(value: String): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSelfie_sticker(value: String): Self = StObject.set(x, "selfie_sticker", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepositoryInfoResponseRootObject extends StObject {
    
    var status: String
    
    var user: UserRepositoryInfoResponseUser
  }
  object UserRepositoryInfoResponseRootObject {
    
    inline def apply(status: String, user: UserRepositoryInfoResponseUser): UserRepositoryInfoResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositoryInfoResponseRootObject]
    }
    
    extension [Self <: UserRepositoryInfoResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser(value: UserRepositoryInfoResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserRepositoryInfoResponseUser extends StObject {
    
    var account_type: Double
    
    var address_street: js.UndefOr[String] = js.undefined
    
    var aggregate_promote_engagement: Boolean
    
    var allowed_commenter_type: String
    
    var auto_expand_chaining: Boolean
    
    var besties_count: Double
    
    var biography: String
    
    var biography_with_entities: UserRepositoryInfoResponseBiographyWithEntities
    
    var can_be_reported_as_fraud: Boolean
    
    var can_be_tagged_as_sponsor: Boolean
    
    var can_boost_post: Boolean
    
    var can_convert_to_business: Boolean
    
    var can_create_sponsor_tags: Boolean
    
    var can_follow_hashtag: Boolean
    
    var can_link_entities_in_bio: Boolean
    
    var can_see_organic_insights: Boolean
    
    var can_tag_products_from_merchants: Boolean
    
    var category: js.UndefOr[String] = js.undefined
    
    var contact_phone_number: js.UndefOr[String] = js.undefined
    
    var external_url: String
    
    var feed_post_reshare_disabled: Boolean
    
    var follower_count: Double
    
    var following_count: Double
    
    var following_tag_count: Double
    
    var full_name: String
    
    var geo_media_count: Double
    
    var has_anonymous_profile_picture: Boolean
    
    var has_biography_translation: Boolean
    
    var has_chaining: Boolean
    
    var has_highlight_reels: Boolean
    
    var has_placed_orders: Boolean
    
    var has_profile_video_feed: Boolean
    
    var has_recommend_accounts: Boolean
    
    var hd_profile_pic_url_info: UserRepositoryInfoResponseHdProfilePicUrlInfo
    
    var hd_profile_pic_versions: js.Array[UserRepositoryInfoResponseHdProfilePicVersionsItem]
    
    var highlight_reshare_disabled: Boolean
    
    var include_direct_blacklist_status: Boolean
    
    var is_business: Boolean
    
    var is_call_to_action_enabled: Null
    
    var is_eligible_to_show_fb_cross_sharing_nux: Boolean
    
    var is_interest_account: Boolean
    
    var is_needy: Boolean
    
    var is_potential_business: Boolean
    
    var is_private: Boolean
    
    var is_profile_action_needed: Boolean
    
    var is_verified: Boolean
    
    var is_video_creator: Boolean
    
    var media_count: Double
    
    var nametag: UserRepositoryInfoResponseNametag
    
    var page_id_for_new_suma_biz_account: Null
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var public_email: js.UndefOr[String] = js.undefined
    
    var public_phone_country_code: js.UndefOr[String] = js.undefined
    
    var recently_bestied_by_count: Double
    
    var reel_auto_archive: String
    
    var show_besties_badge: Boolean
    
    var show_business_conversion_icon: Boolean
    
    var show_conversion_edit_entry: Boolean
    
    var show_insights_terms: Boolean
    
    var total_ar_effects: Double
    
    var total_igtv_videos: Double
    
    var username: String
    
    var usertag_review_enabled: Boolean
    
    var usertags_count: Double
  }
  object UserRepositoryInfoResponseUser {
    
    inline def apply(
      account_type: Double,
      aggregate_promote_engagement: Boolean,
      allowed_commenter_type: String,
      auto_expand_chaining: Boolean,
      besties_count: Double,
      biography: String,
      biography_with_entities: UserRepositoryInfoResponseBiographyWithEntities,
      can_be_reported_as_fraud: Boolean,
      can_be_tagged_as_sponsor: Boolean,
      can_boost_post: Boolean,
      can_convert_to_business: Boolean,
      can_create_sponsor_tags: Boolean,
      can_follow_hashtag: Boolean,
      can_link_entities_in_bio: Boolean,
      can_see_organic_insights: Boolean,
      can_tag_products_from_merchants: Boolean,
      external_url: String,
      feed_post_reshare_disabled: Boolean,
      follower_count: Double,
      following_count: Double,
      following_tag_count: Double,
      full_name: String,
      geo_media_count: Double,
      has_anonymous_profile_picture: Boolean,
      has_biography_translation: Boolean,
      has_chaining: Boolean,
      has_highlight_reels: Boolean,
      has_placed_orders: Boolean,
      has_profile_video_feed: Boolean,
      has_recommend_accounts: Boolean,
      hd_profile_pic_url_info: UserRepositoryInfoResponseHdProfilePicUrlInfo,
      hd_profile_pic_versions: js.Array[UserRepositoryInfoResponseHdProfilePicVersionsItem],
      highlight_reshare_disabled: Boolean,
      include_direct_blacklist_status: Boolean,
      is_business: Boolean,
      is_call_to_action_enabled: Null,
      is_eligible_to_show_fb_cross_sharing_nux: Boolean,
      is_interest_account: Boolean,
      is_needy: Boolean,
      is_potential_business: Boolean,
      is_private: Boolean,
      is_profile_action_needed: Boolean,
      is_verified: Boolean,
      is_video_creator: Boolean,
      media_count: Double,
      nametag: UserRepositoryInfoResponseNametag,
      page_id_for_new_suma_biz_account: Null,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      recently_bestied_by_count: Double,
      reel_auto_archive: String,
      show_besties_badge: Boolean,
      show_business_conversion_icon: Boolean,
      show_conversion_edit_entry: Boolean,
      show_insights_terms: Boolean,
      total_ar_effects: Double,
      total_igtv_videos: Double,
      username: String,
      usertag_review_enabled: Boolean,
      usertags_count: Double
    ): UserRepositoryInfoResponseUser = {
      val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any], aggregate_promote_engagement = aggregate_promote_engagement.asInstanceOf[js.Any], allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], auto_expand_chaining = auto_expand_chaining.asInstanceOf[js.Any], besties_count = besties_count.asInstanceOf[js.Any], biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], can_be_reported_as_fraud = can_be_reported_as_fraud.asInstanceOf[js.Any], can_be_tagged_as_sponsor = can_be_tagged_as_sponsor.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_convert_to_business = can_convert_to_business.asInstanceOf[js.Any], can_create_sponsor_tags = can_create_sponsor_tags.asInstanceOf[js.Any], can_follow_hashtag = can_follow_hashtag.asInstanceOf[js.Any], can_link_entities_in_bio = can_link_entities_in_bio.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], can_tag_products_from_merchants = can_tag_products_from_merchants.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], feed_post_reshare_disabled = feed_post_reshare_disabled.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], geo_media_count = geo_media_count.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], has_chaining = has_chaining.asInstanceOf[js.Any], has_highlight_reels = has_highlight_reels.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], has_profile_video_feed = has_profile_video_feed.asInstanceOf[js.Any], has_recommend_accounts = has_recommend_accounts.asInstanceOf[js.Any], hd_profile_pic_url_info = hd_profile_pic_url_info.asInstanceOf[js.Any], hd_profile_pic_versions = hd_profile_pic_versions.asInstanceOf[js.Any], highlight_reshare_disabled = highlight_reshare_disabled.asInstanceOf[js.Any], include_direct_blacklist_status = include_direct_blacklist_status.asInstanceOf[js.Any], is_business = is_business.asInstanceOf[js.Any], is_call_to_action_enabled = is_call_to_action_enabled.asInstanceOf[js.Any], is_eligible_to_show_fb_cross_sharing_nux = is_eligible_to_show_fb_cross_sharing_nux.asInstanceOf[js.Any], is_interest_account = is_interest_account.asInstanceOf[js.Any], is_needy = is_needy.asInstanceOf[js.Any], is_potential_business = is_potential_business.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_profile_action_needed = is_profile_action_needed.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], is_video_creator = is_video_creator.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], nametag = nametag.asInstanceOf[js.Any], page_id_for_new_suma_biz_account = page_id_for_new_suma_biz_account.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], recently_bestied_by_count = recently_bestied_by_count.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_besties_badge = show_besties_badge.asInstanceOf[js.Any], show_business_conversion_icon = show_business_conversion_icon.asInstanceOf[js.Any], show_conversion_edit_entry = show_conversion_edit_entry.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], total_ar_effects = total_ar_effects.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], usertag_review_enabled = usertag_review_enabled.asInstanceOf[js.Any], usertags_count = usertags_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserRepositoryInfoResponseUser]
    }
    
    extension [Self <: UserRepositoryInfoResponseUser](x: Self) {
      
      inline def setAccount_type(value: Double): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
      
      inline def setAddress_street(value: String): Self = StObject.set(x, "address_street", value.asInstanceOf[js.Any])
      
      inline def setAddress_streetUndefined: Self = StObject.set(x, "address_street", js.undefined)
      
      inline def setAggregate_promote_engagement(value: Boolean): Self = StObject.set(x, "aggregate_promote_engagement", value.asInstanceOf[js.Any])
      
      inline def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      inline def setAuto_expand_chaining(value: Boolean): Self = StObject.set(x, "auto_expand_chaining", value.asInstanceOf[js.Any])
      
      inline def setBesties_count(value: Double): Self = StObject.set(x, "besties_count", value.asInstanceOf[js.Any])
      
      inline def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
      
      inline def setBiography_with_entities(value: UserRepositoryInfoResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
      
      inline def setCan_be_reported_as_fraud(value: Boolean): Self = StObject.set(x, "can_be_reported_as_fraud", value.asInstanceOf[js.Any])
      
      inline def setCan_be_tagged_as_sponsor(value: Boolean): Self = StObject.set(x, "can_be_tagged_as_sponsor", value.asInstanceOf[js.Any])
      
      inline def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
      
      inline def setCan_convert_to_business(value: Boolean): Self = StObject.set(x, "can_convert_to_business", value.asInstanceOf[js.Any])
      
      inline def setCan_create_sponsor_tags(value: Boolean): Self = StObject.set(x, "can_create_sponsor_tags", value.asInstanceOf[js.Any])
      
      inline def setCan_follow_hashtag(value: Boolean): Self = StObject.set(x, "can_follow_hashtag", value.asInstanceOf[js.Any])
      
      inline def setCan_link_entities_in_bio(value: Boolean): Self = StObject.set(x, "can_link_entities_in_bio", value.asInstanceOf[js.Any])
      
      inline def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
      
      inline def setCan_tag_products_from_merchants(value: Boolean): Self = StObject.set(x, "can_tag_products_from_merchants", value.asInstanceOf[js.Any])
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setContact_phone_number(value: String): Self = StObject.set(x, "contact_phone_number", value.asInstanceOf[js.Any])
      
      inline def setContact_phone_numberUndefined: Self = StObject.set(x, "contact_phone_number", js.undefined)
      
      inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
      
      inline def setFeed_post_reshare_disabled(value: Boolean): Self = StObject.set(x, "feed_post_reshare_disabled", value.asInstanceOf[js.Any])
      
      inline def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
      
      inline def setFollowing_count(value: Double): Self = StObject.set(x, "following_count", value.asInstanceOf[js.Any])
      
      inline def setFollowing_tag_count(value: Double): Self = StObject.set(x, "following_tag_count", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setGeo_media_count(value: Double): Self = StObject.set(x, "geo_media_count", value.asInstanceOf[js.Any])
      
      inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      inline def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
      
      inline def setHas_chaining(value: Boolean): Self = StObject.set(x, "has_chaining", value.asInstanceOf[js.Any])
      
      inline def setHas_highlight_reels(value: Boolean): Self = StObject.set(x, "has_highlight_reels", value.asInstanceOf[js.Any])
      
      inline def setHas_placed_orders(value: Boolean): Self = StObject.set(x, "has_placed_orders", value.asInstanceOf[js.Any])
      
      inline def setHas_profile_video_feed(value: Boolean): Self = StObject.set(x, "has_profile_video_feed", value.asInstanceOf[js.Any])
      
      inline def setHas_recommend_accounts(value: Boolean): Self = StObject.set(x, "has_recommend_accounts", value.asInstanceOf[js.Any])
      
      inline def setHd_profile_pic_url_info(value: UserRepositoryInfoResponseHdProfilePicUrlInfo): Self = StObject.set(x, "hd_profile_pic_url_info", value.asInstanceOf[js.Any])
      
      inline def setHd_profile_pic_versions(value: js.Array[UserRepositoryInfoResponseHdProfilePicVersionsItem]): Self = StObject.set(x, "hd_profile_pic_versions", value.asInstanceOf[js.Any])
      
      inline def setHd_profile_pic_versionsVarargs(value: UserRepositoryInfoResponseHdProfilePicVersionsItem*): Self = StObject.set(x, "hd_profile_pic_versions", js.Array(value :_*))
      
      inline def setHighlight_reshare_disabled(value: Boolean): Self = StObject.set(x, "highlight_reshare_disabled", value.asInstanceOf[js.Any])
      
      inline def setInclude_direct_blacklist_status(value: Boolean): Self = StObject.set(x, "include_direct_blacklist_status", value.asInstanceOf[js.Any])
      
      inline def setIs_business(value: Boolean): Self = StObject.set(x, "is_business", value.asInstanceOf[js.Any])
      
      inline def setIs_call_to_action_enabled(value: Null): Self = StObject.set(x, "is_call_to_action_enabled", value.asInstanceOf[js.Any])
      
      inline def setIs_eligible_to_show_fb_cross_sharing_nux(value: Boolean): Self = StObject.set(x, "is_eligible_to_show_fb_cross_sharing_nux", value.asInstanceOf[js.Any])
      
      inline def setIs_interest_account(value: Boolean): Self = StObject.set(x, "is_interest_account", value.asInstanceOf[js.Any])
      
      inline def setIs_needy(value: Boolean): Self = StObject.set(x, "is_needy", value.asInstanceOf[js.Any])
      
      inline def setIs_potential_business(value: Boolean): Self = StObject.set(x, "is_potential_business", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_profile_action_needed(value: Boolean): Self = StObject.set(x, "is_profile_action_needed", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setIs_video_creator(value: Boolean): Self = StObject.set(x, "is_video_creator", value.asInstanceOf[js.Any])
      
      inline def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      inline def setNametag(value: UserRepositoryInfoResponseNametag): Self = StObject.set(x, "nametag", value.asInstanceOf[js.Any])
      
      inline def setPage_id_for_new_suma_biz_account(value: Null): Self = StObject.set(x, "page_id_for_new_suma_biz_account", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setPublic_email(value: String): Self = StObject.set(x, "public_email", value.asInstanceOf[js.Any])
      
      inline def setPublic_emailUndefined: Self = StObject.set(x, "public_email", js.undefined)
      
      inline def setPublic_phone_country_code(value: String): Self = StObject.set(x, "public_phone_country_code", value.asInstanceOf[js.Any])
      
      inline def setPublic_phone_country_codeUndefined: Self = StObject.set(x, "public_phone_country_code", js.undefined)
      
      inline def setRecently_bestied_by_count(value: Double): Self = StObject.set(x, "recently_bestied_by_count", value.asInstanceOf[js.Any])
      
      inline def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      inline def setShow_besties_badge(value: Boolean): Self = StObject.set(x, "show_besties_badge", value.asInstanceOf[js.Any])
      
      inline def setShow_business_conversion_icon(value: Boolean): Self = StObject.set(x, "show_business_conversion_icon", value.asInstanceOf[js.Any])
      
      inline def setShow_conversion_edit_entry(value: Boolean): Self = StObject.set(x, "show_conversion_edit_entry", value.asInstanceOf[js.Any])
      
      inline def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
      
      inline def setTotal_ar_effects(value: Double): Self = StObject.set(x, "total_ar_effects", value.asInstanceOf[js.Any])
      
      inline def setTotal_igtv_videos(value: Double): Self = StObject.set(x, "total_igtv_videos", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsertag_review_enabled(value: Boolean): Self = StObject.set(x, "usertag_review_enabled", value.asInstanceOf[js.Any])
      
      inline def setUsertags_count(value: Double): Self = StObject.set(x, "usertags_count", value.asInstanceOf[js.Any])
    }
  }
}
