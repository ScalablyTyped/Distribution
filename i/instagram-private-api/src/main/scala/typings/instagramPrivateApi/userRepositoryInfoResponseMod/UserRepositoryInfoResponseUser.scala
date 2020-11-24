package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRepositoryInfoResponseUser extends js.Object {
  
  var account_type: Double = js.native
  
  var address_street: js.UndefOr[String] = js.native
  
  var aggregate_promote_engagement: Boolean = js.native
  
  var allowed_commenter_type: String = js.native
  
  var auto_expand_chaining: Boolean = js.native
  
  var besties_count: Double = js.native
  
  var biography: String = js.native
  
  var biography_with_entities: UserRepositoryInfoResponseBiographyWithEntities = js.native
  
  var can_be_reported_as_fraud: Boolean = js.native
  
  var can_be_tagged_as_sponsor: Boolean = js.native
  
  var can_boost_post: Boolean = js.native
  
  var can_convert_to_business: Boolean = js.native
  
  var can_create_sponsor_tags: Boolean = js.native
  
  var can_follow_hashtag: Boolean = js.native
  
  var can_link_entities_in_bio: Boolean = js.native
  
  var can_see_organic_insights: Boolean = js.native
  
  var can_tag_products_from_merchants: Boolean = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var contact_phone_number: js.UndefOr[String] = js.native
  
  var external_url: String = js.native
  
  var feed_post_reshare_disabled: Boolean = js.native
  
  var follower_count: Double = js.native
  
  var following_count: Double = js.native
  
  var following_tag_count: Double = js.native
  
  var full_name: String = js.native
  
  var geo_media_count: Double = js.native
  
  var has_anonymous_profile_picture: Boolean = js.native
  
  var has_biography_translation: Boolean = js.native
  
  var has_chaining: Boolean = js.native
  
  var has_highlight_reels: Boolean = js.native
  
  var has_placed_orders: Boolean = js.native
  
  var has_profile_video_feed: Boolean = js.native
  
  var has_recommend_accounts: Boolean = js.native
  
  var hd_profile_pic_url_info: UserRepositoryInfoResponseHdProfilePicUrlInfo = js.native
  
  var hd_profile_pic_versions: js.Array[UserRepositoryInfoResponseHdProfilePicVersionsItem] = js.native
  
  var highlight_reshare_disabled: Boolean = js.native
  
  var include_direct_blacklist_status: Boolean = js.native
  
  var is_business: Boolean = js.native
  
  var is_call_to_action_enabled: Null = js.native
  
  var is_eligible_to_show_fb_cross_sharing_nux: Boolean = js.native
  
  var is_interest_account: Boolean = js.native
  
  var is_needy: Boolean = js.native
  
  var is_potential_business: Boolean = js.native
  
  var is_private: Boolean = js.native
  
  var is_profile_action_needed: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  var is_video_creator: Boolean = js.native
  
  var media_count: Double = js.native
  
  var nametag: UserRepositoryInfoResponseNametag = js.native
  
  var page_id_for_new_suma_biz_account: Null = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var public_email: js.UndefOr[String] = js.native
  
  var public_phone_country_code: js.UndefOr[String] = js.native
  
  var recently_bestied_by_count: Double = js.native
  
  var reel_auto_archive: String = js.native
  
  var show_besties_badge: Boolean = js.native
  
  var show_business_conversion_icon: Boolean = js.native
  
  var show_conversion_edit_entry: Boolean = js.native
  
  var show_insights_terms: Boolean = js.native
  
  var total_ar_effects: Double = js.native
  
  var total_igtv_videos: Double = js.native
  
  var username: String = js.native
  
  var usertag_review_enabled: Boolean = js.native
  
  var usertags_count: Double = js.native
}
object UserRepositoryInfoResponseUser {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class UserRepositoryInfoResponseUserOps[Self <: UserRepositoryInfoResponseUser] (val x: Self) extends AnyVal {
    
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
    def setAggregate_promote_engagement(value: Boolean): Self = this.set("aggregate_promote_engagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = this.set("allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_expand_chaining(value: Boolean): Self = this.set("auto_expand_chaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBesties_count(value: Double): Self = this.set("besties_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography(value: String): Self = this.set("biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography_with_entities(value: UserRepositoryInfoResponseBiographyWithEntities): Self = this.set("biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_be_reported_as_fraud(value: Boolean): Self = this.set("can_be_reported_as_fraud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_be_tagged_as_sponsor(value: Boolean): Self = this.set("can_be_tagged_as_sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = this.set("can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_convert_to_business(value: Boolean): Self = this.set("can_convert_to_business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_create_sponsor_tags(value: Boolean): Self = this.set("can_create_sponsor_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_follow_hashtag(value: Boolean): Self = this.set("can_follow_hashtag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_link_entities_in_bio(value: Boolean): Self = this.set("can_link_entities_in_bio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = this.set("can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_tag_products_from_merchants(value: Boolean): Self = this.set("can_tag_products_from_merchants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_post_reshare_disabled(value: Boolean): Self = this.set("feed_post_reshare_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollower_count(value: Double): Self = this.set("follower_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_count(value: Double): Self = this.set("following_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_tag_count(value: Double): Self = this.set("following_tag_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeo_media_count(value: Double): Self = this.set("geo_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = this.set("has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_chaining(value: Boolean): Self = this.set("has_chaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_highlight_reels(value: Boolean): Self = this.set("has_highlight_reels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_placed_orders(value: Boolean): Self = this.set("has_placed_orders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_profile_video_feed(value: Boolean): Self = this.set("has_profile_video_feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_recommend_accounts(value: Boolean): Self = this.set("has_recommend_accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHd_profile_pic_url_info(value: UserRepositoryInfoResponseHdProfilePicUrlInfo): Self = this.set("hd_profile_pic_url_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHd_profile_pic_versionsVarargs(value: UserRepositoryInfoResponseHdProfilePicVersionsItem*): Self = this.set("hd_profile_pic_versions", js.Array(value :_*))
    
    @scala.inline
    def setHd_profile_pic_versions(value: js.Array[UserRepositoryInfoResponseHdProfilePicVersionsItem]): Self = this.set("hd_profile_pic_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlight_reshare_disabled(value: Boolean): Self = this.set("highlight_reshare_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_direct_blacklist_status(value: Boolean): Self = this.set("include_direct_blacklist_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_business(value: Boolean): Self = this.set("is_business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_call_to_action_enabled(value: Null): Self = this.set("is_call_to_action_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_eligible_to_show_fb_cross_sharing_nux(value: Boolean): Self = this.set("is_eligible_to_show_fb_cross_sharing_nux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_interest_account(value: Boolean): Self = this.set("is_interest_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_needy(value: Boolean): Self = this.set("is_needy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_potential_business(value: Boolean): Self = this.set("is_potential_business", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_profile_action_needed(value: Boolean): Self = this.set("is_profile_action_needed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_video_creator(value: Boolean): Self = this.set("is_video_creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNametag(value: UserRepositoryInfoResponseNametag): Self = this.set("nametag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_id_for_new_suma_biz_account(value: Null): Self = this.set("page_id_for_new_suma_biz_account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecently_bestied_by_count(value: Double): Self = this.set("recently_bestied_by_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = this.set("reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_besties_badge(value: Boolean): Self = this.set("show_besties_badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_business_conversion_icon(value: Boolean): Self = this.set("show_business_conversion_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_conversion_edit_entry(value: Boolean): Self = this.set("show_conversion_edit_entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = this.set("show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_ar_effects(value: Double): Self = this.set("total_ar_effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_igtv_videos(value: Double): Self = this.set("total_igtv_videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertag_review_enabled(value: Boolean): Self = this.set("usertag_review_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags_count(value: Double): Self = this.set("usertags_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress_street(value: String): Self = this.set("address_street", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress_street: Self = this.set("address_street", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContact_phone_number(value: String): Self = this.set("contact_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact_phone_number: Self = this.set("contact_phone_number", js.undefined)
    
    @scala.inline
    def setPublic_email(value: String): Self = this.set("public_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_email: Self = this.set("public_email", js.undefined)
    
    @scala.inline
    def setPublic_phone_country_code(value: String): Self = this.set("public_phone_country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic_phone_country_code: Self = this.set("public_phone_country_code", js.undefined)
  }
}
