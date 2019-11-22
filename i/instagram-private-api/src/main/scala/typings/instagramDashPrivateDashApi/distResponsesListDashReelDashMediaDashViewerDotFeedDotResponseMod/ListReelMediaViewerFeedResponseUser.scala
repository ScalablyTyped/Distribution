package typings.instagramDashPrivateDashApi.distResponsesListDashReelDashMediaDashViewerDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReelMediaViewerFeedResponseUser extends js.Object {
  var account_type: js.UndefOr[Double] = js.undefined
  var address_street: js.UndefOr[String] = js.undefined
  var allowed_commenter_type: js.UndefOr[String] = js.undefined
  var biography: js.UndefOr[String] = js.undefined
  var biography_with_entities: js.UndefOr[ListReelMediaViewerFeedResponseBiography_with_entities] = js.undefined
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
    username: String,
    account_type: Int | Double = null,
    address_street: String = null,
    allowed_commenter_type: String = null,
    biography: String = null,
    biography_with_entities: ListReelMediaViewerFeedResponseBiography_with_entities = null,
    business_contact_method: String = null,
    can_boost_post: js.UndefOr[Boolean] = js.undefined,
    can_hide_category: js.UndefOr[Boolean] = js.undefined,
    can_hide_public_contacts: js.UndefOr[Boolean] = js.undefined,
    can_see_organic_insights: js.UndefOr[Boolean] = js.undefined,
    category: String = null,
    city_id: Int | Double = null,
    city_name: String = null,
    contact_phone_number: String = null,
    direct_messaging: String = null,
    external_lynx_url: String = null,
    external_url: String = null,
    fb_page_call_to_action_id: String = null,
    follower_count: Int | Double = null,
    following_count: Int | Double = null,
    following_tag_count: Int | Double = null,
    has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined,
    has_biography_translation: js.UndefOr[Boolean] = js.undefined,
    instagram_location_id: String = null,
    is_business: js.UndefOr[Boolean] = js.undefined,
    is_call_to_action_enabled: js.UndefOr[Boolean] = js.undefined,
    is_unpublished: js.UndefOr[Boolean] = js.undefined,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    media_count: Int | Double = null,
    mutual_followers_count: Int | Double = null,
    public_email: String = null,
    public_phone_country_code: String = null,
    public_phone_number: String = null,
    reel_auto_archive: String = null,
    should_show_category: js.UndefOr[Boolean] = js.undefined,
    should_show_public_contacts: js.UndefOr[Boolean] = js.undefined,
    should_show_tabbed_inbox: js.UndefOr[Boolean] = js.undefined,
    show_insights_terms: js.UndefOr[Boolean] = js.undefined,
    zip: String = null
  ): ListReelMediaViewerFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name, is_private = is_private, is_verified = is_verified, pk = pk, profile_pic_id = profile_pic_id, profile_pic_url = profile_pic_url, username = username)
    if (account_type != null) __obj.updateDynamic("account_type")(account_type.asInstanceOf[js.Any])
    if (address_street != null) __obj.updateDynamic("address_street")(address_street)
    if (allowed_commenter_type != null) __obj.updateDynamic("allowed_commenter_type")(allowed_commenter_type)
    if (biography != null) __obj.updateDynamic("biography")(biography)
    if (biography_with_entities != null) __obj.updateDynamic("biography_with_entities")(biography_with_entities)
    if (business_contact_method != null) __obj.updateDynamic("business_contact_method")(business_contact_method)
    if (!js.isUndefined(can_boost_post)) __obj.updateDynamic("can_boost_post")(can_boost_post)
    if (!js.isUndefined(can_hide_category)) __obj.updateDynamic("can_hide_category")(can_hide_category)
    if (!js.isUndefined(can_hide_public_contacts)) __obj.updateDynamic("can_hide_public_contacts")(can_hide_public_contacts)
    if (!js.isUndefined(can_see_organic_insights)) __obj.updateDynamic("can_see_organic_insights")(can_see_organic_insights)
    if (category != null) __obj.updateDynamic("category")(category)
    if (city_id != null) __obj.updateDynamic("city_id")(city_id.asInstanceOf[js.Any])
    if (city_name != null) __obj.updateDynamic("city_name")(city_name)
    if (contact_phone_number != null) __obj.updateDynamic("contact_phone_number")(contact_phone_number)
    if (direct_messaging != null) __obj.updateDynamic("direct_messaging")(direct_messaging)
    if (external_lynx_url != null) __obj.updateDynamic("external_lynx_url")(external_lynx_url)
    if (external_url != null) __obj.updateDynamic("external_url")(external_url)
    if (fb_page_call_to_action_id != null) __obj.updateDynamic("fb_page_call_to_action_id")(fb_page_call_to_action_id)
    if (follower_count != null) __obj.updateDynamic("follower_count")(follower_count.asInstanceOf[js.Any])
    if (following_count != null) __obj.updateDynamic("following_count")(following_count.asInstanceOf[js.Any])
    if (following_tag_count != null) __obj.updateDynamic("following_tag_count")(following_tag_count.asInstanceOf[js.Any])
    if (!js.isUndefined(has_anonymous_profile_picture)) __obj.updateDynamic("has_anonymous_profile_picture")(has_anonymous_profile_picture)
    if (!js.isUndefined(has_biography_translation)) __obj.updateDynamic("has_biography_translation")(has_biography_translation)
    if (instagram_location_id != null) __obj.updateDynamic("instagram_location_id")(instagram_location_id)
    if (!js.isUndefined(is_business)) __obj.updateDynamic("is_business")(is_business)
    if (!js.isUndefined(is_call_to_action_enabled)) __obj.updateDynamic("is_call_to_action_enabled")(is_call_to_action_enabled)
    if (!js.isUndefined(is_unpublished)) __obj.updateDynamic("is_unpublished")(is_unpublished)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (media_count != null) __obj.updateDynamic("media_count")(media_count.asInstanceOf[js.Any])
    if (mutual_followers_count != null) __obj.updateDynamic("mutual_followers_count")(mutual_followers_count.asInstanceOf[js.Any])
    if (public_email != null) __obj.updateDynamic("public_email")(public_email)
    if (public_phone_country_code != null) __obj.updateDynamic("public_phone_country_code")(public_phone_country_code)
    if (public_phone_number != null) __obj.updateDynamic("public_phone_number")(public_phone_number)
    if (reel_auto_archive != null) __obj.updateDynamic("reel_auto_archive")(reel_auto_archive)
    if (!js.isUndefined(should_show_category)) __obj.updateDynamic("should_show_category")(should_show_category)
    if (!js.isUndefined(should_show_public_contacts)) __obj.updateDynamic("should_show_public_contacts")(should_show_public_contacts)
    if (!js.isUndefined(should_show_tabbed_inbox)) __obj.updateDynamic("should_show_tabbed_inbox")(should_show_tabbed_inbox)
    if (!js.isUndefined(show_insights_terms)) __obj.updateDynamic("show_insights_terms")(show_insights_terms)
    if (zip != null) __obj.updateDynamic("zip")(zip)
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseUser]
  }
}

