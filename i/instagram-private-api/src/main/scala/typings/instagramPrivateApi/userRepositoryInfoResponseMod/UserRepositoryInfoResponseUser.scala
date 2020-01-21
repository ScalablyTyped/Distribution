package typings.instagramPrivateApi.userRepositoryInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRepositoryInfoResponseUser extends js.Object {
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
    usertags_count: Double,
    address_street: String = null,
    category: String = null,
    contact_phone_number: String = null,
    public_email: String = null,
    public_phone_country_code: String = null
  ): UserRepositoryInfoResponseUser = {
    val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any], aggregate_promote_engagement = aggregate_promote_engagement.asInstanceOf[js.Any], allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], auto_expand_chaining = auto_expand_chaining.asInstanceOf[js.Any], besties_count = besties_count.asInstanceOf[js.Any], biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], can_be_reported_as_fraud = can_be_reported_as_fraud.asInstanceOf[js.Any], can_be_tagged_as_sponsor = can_be_tagged_as_sponsor.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_convert_to_business = can_convert_to_business.asInstanceOf[js.Any], can_create_sponsor_tags = can_create_sponsor_tags.asInstanceOf[js.Any], can_follow_hashtag = can_follow_hashtag.asInstanceOf[js.Any], can_link_entities_in_bio = can_link_entities_in_bio.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], can_tag_products_from_merchants = can_tag_products_from_merchants.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], feed_post_reshare_disabled = feed_post_reshare_disabled.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], geo_media_count = geo_media_count.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], has_chaining = has_chaining.asInstanceOf[js.Any], has_highlight_reels = has_highlight_reels.asInstanceOf[js.Any], has_placed_orders = has_placed_orders.asInstanceOf[js.Any], has_profile_video_feed = has_profile_video_feed.asInstanceOf[js.Any], has_recommend_accounts = has_recommend_accounts.asInstanceOf[js.Any], hd_profile_pic_url_info = hd_profile_pic_url_info.asInstanceOf[js.Any], hd_profile_pic_versions = hd_profile_pic_versions.asInstanceOf[js.Any], highlight_reshare_disabled = highlight_reshare_disabled.asInstanceOf[js.Any], include_direct_blacklist_status = include_direct_blacklist_status.asInstanceOf[js.Any], is_business = is_business.asInstanceOf[js.Any], is_call_to_action_enabled = is_call_to_action_enabled.asInstanceOf[js.Any], is_eligible_to_show_fb_cross_sharing_nux = is_eligible_to_show_fb_cross_sharing_nux.asInstanceOf[js.Any], is_interest_account = is_interest_account.asInstanceOf[js.Any], is_needy = is_needy.asInstanceOf[js.Any], is_potential_business = is_potential_business.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_profile_action_needed = is_profile_action_needed.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], is_video_creator = is_video_creator.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], nametag = nametag.asInstanceOf[js.Any], page_id_for_new_suma_biz_account = page_id_for_new_suma_biz_account.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], recently_bestied_by_count = recently_bestied_by_count.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_besties_badge = show_besties_badge.asInstanceOf[js.Any], show_business_conversion_icon = show_business_conversion_icon.asInstanceOf[js.Any], show_conversion_edit_entry = show_conversion_edit_entry.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], total_ar_effects = total_ar_effects.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], usertag_review_enabled = usertag_review_enabled.asInstanceOf[js.Any], usertags_count = usertags_count.asInstanceOf[js.Any])
    if (address_street != null) __obj.updateDynamic("address_street")(address_street.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contact_phone_number != null) __obj.updateDynamic("contact_phone_number")(contact_phone_number.asInstanceOf[js.Any])
    if (public_email != null) __obj.updateDynamic("public_email")(public_email.asInstanceOf[js.Any])
    if (public_phone_country_code != null) __obj.updateDynamic("public_phone_country_code")(public_phone_country_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRepositoryInfoResponseUser]
  }
}

