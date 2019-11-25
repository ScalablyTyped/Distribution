package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseMedia_or_ad extends js.Object {
  var ad_action: js.UndefOr[String] = js.undefined
  var ad_header_style: js.UndefOr[Double] = js.undefined
  var ad_id: js.UndefOr[String] = js.undefined
  var ad_link_type: js.UndefOr[Double] = js.undefined
  var ad_metadata: js.UndefOr[js.Array[TimelineFeedResponseAdMetadataItem]] = js.undefined
  var android_links: js.UndefOr[js.Array[TimelineFeedResponseAndroidLinksItem]] = js.undefined
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined
  var can_view_more_preview_comments: Boolean
  var can_viewer_reshare: js.UndefOr[Boolean] = js.undefined
  var can_viewer_save: Boolean
  var caption: TimelineFeedResponseCaption
  var caption_is_edited: Boolean
  var carousel_media: js.UndefOr[js.Array[TimelineFeedResponseCarouselMediaItem]] = js.undefined
  var carousel_media_count: js.UndefOr[Double] = js.undefined
  var carousel_media_type: js.UndefOr[Double] = js.undefined
  var client_cache_key: String
  var code: String
  var collapse_comments: js.UndefOr[Boolean] = js.undefined
  var comment_count: Double
  var comment_likes_enabled: Boolean
  var comment_threading_enabled: Boolean
  var device_timestamp: String | Double
  var direct_reply_to_author_enabled: Boolean
  var dominant_color: js.UndefOr[String] = js.undefined
  var dr_ad_type: js.UndefOr[Double] = js.undefined
  var expiring_at: js.UndefOr[Double] = js.undefined
  var facepile_top_likers: js.UndefOr[js.Array[TimelineFeedResponseFacepileTopLikersItem]] = js.undefined
  var fb_page_url: js.UndefOr[String] = js.undefined
  var filter_type: Double
  var follower_count: js.UndefOr[Double] = js.undefined
  var force_overlay: js.UndefOr[Boolean] = js.undefined
  var has_audio: js.UndefOr[Boolean] = js.undefined
  var has_liked: Boolean
  var has_more_comments: Boolean
  var hide_nux_text: js.UndefOr[Boolean] = js.undefined
  var iTunesItem: js.UndefOr[Null] = js.undefined
  var id: String
  var image_versions2: js.UndefOr[TimelineFeedResponseImage_versions2] = js.undefined
  var injected: js.UndefOr[TimelineFeedResponseInjected] = js.undefined
  var inline_composer_display_condition: js.UndefOr[String] = js.undefined
  var inline_composer_imp_trigger_time: js.UndefOr[Double] = js.undefined
  var inventory_source: String
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  var is_eof: Boolean
  var is_seen: Boolean
  var is_sidecar_child: js.UndefOr[Boolean] = js.undefined
  var lat: js.UndefOr[Double] = js.undefined
  var like_count: Double
  var link: js.UndefOr[String] = js.undefined
  var link_hint_text: js.UndefOr[String] = js.undefined
  var link_text: js.UndefOr[String] = js.undefined
  var lng: js.UndefOr[Double] = js.undefined
  var location: js.UndefOr[TimelineFeedResponseLocation] = js.undefined
  var max_num_visible_preview_comments: Double
  var media_type: Double
  var next_max_id: js.UndefOr[String] = js.undefined
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  var organic_tracking_token: String
  var original_height: js.UndefOr[Double] = js.undefined
  var original_width: js.UndefOr[Double] = js.undefined
  var overlay_subtitle: js.UndefOr[String] = js.undefined
  var overlay_text: js.UndefOr[String] = js.undefined
  var overlay_title: js.UndefOr[String] = js.undefined
  var photo_of_you: Boolean
  var pk: String
  var post_count: js.UndefOr[Double] = js.undefined
  var preview: js.UndefOr[String] = js.undefined
  var preview_comments: js.Array[TimelineFeedResponsePreviewCommentsItem]
  var taken_at: Double
  var top_likers: js.Array[String]
  var user: TimelineFeedResponseUser
  var usertags: js.UndefOr[TimelineFeedResponseUsertags] = js.undefined
  var video_codec: js.UndefOr[String] = js.undefined
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  var video_duration: js.UndefOr[Double] = js.undefined
  var video_versions: js.UndefOr[js.Array[TimelineFeedResponseVideoVersionsItem]] = js.undefined
  var view_count: js.UndefOr[Double] = js.undefined
}

object TimelineFeedResponseMedia_or_ad {
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_save: Boolean,
    caption: TimelineFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: String | Double,
    direct_reply_to_author_enabled: Boolean,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    inventory_source: String,
    is_eof: Boolean,
    is_seen: Boolean,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[TimelineFeedResponsePreviewCommentsItem],
    taken_at: Double,
    top_likers: js.Array[String],
    user: TimelineFeedResponseUser,
    ad_action: String = null,
    ad_header_style: Int | Double = null,
    ad_id: String = null,
    ad_link_type: Int | Double = null,
    ad_metadata: js.Array[TimelineFeedResponseAdMetadataItem] = null,
    android_links: js.Array[TimelineFeedResponseAndroidLinksItem] = null,
    can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined,
    can_viewer_reshare: js.UndefOr[Boolean] = js.undefined,
    carousel_media: js.Array[TimelineFeedResponseCarouselMediaItem] = null,
    carousel_media_count: Int | Double = null,
    carousel_media_type: Int | Double = null,
    collapse_comments: js.UndefOr[Boolean] = js.undefined,
    dominant_color: String = null,
    dr_ad_type: Int | Double = null,
    expiring_at: Int | Double = null,
    facepile_top_likers: js.Array[TimelineFeedResponseFacepileTopLikersItem] = null,
    fb_page_url: String = null,
    follower_count: Int | Double = null,
    force_overlay: js.UndefOr[Boolean] = js.undefined,
    has_audio: js.UndefOr[Boolean] = js.undefined,
    hide_nux_text: js.UndefOr[Boolean] = js.undefined,
    iTunesItem: Null = null,
    image_versions2: TimelineFeedResponseImage_versions2 = null,
    injected: TimelineFeedResponseInjected = null,
    inline_composer_display_condition: String = null,
    inline_composer_imp_trigger_time: Int | Double = null,
    is_dash_eligible: Int | Double = null,
    is_sidecar_child: js.UndefOr[Boolean] = js.undefined,
    lat: Int | Double = null,
    link: String = null,
    link_hint_text: String = null,
    link_text: String = null,
    lng: Int | Double = null,
    location: TimelineFeedResponseLocation = null,
    next_max_id: String = null,
    number_of_qualities: Int | Double = null,
    original_height: Int | Double = null,
    original_width: Int | Double = null,
    overlay_subtitle: String = null,
    overlay_text: String = null,
    overlay_title: String = null,
    post_count: Int | Double = null,
    preview: String = null,
    usertags: TimelineFeedResponseUsertags = null,
    video_codec: String = null,
    video_dash_manifest: String = null,
    video_duration: Int | Double = null,
    video_versions: js.Array[TimelineFeedResponseVideoVersionsItem] = null,
    view_count: Int | Double = null
  ): TimelineFeedResponseMedia_or_ad = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], direct_reply_to_author_enabled = direct_reply_to_author_enabled.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inventory_source = inventory_source.asInstanceOf[js.Any], is_eof = is_eof.asInstanceOf[js.Any], is_seen = is_seen.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (ad_action != null) __obj.updateDynamic("ad_action")(ad_action.asInstanceOf[js.Any])
    if (ad_header_style != null) __obj.updateDynamic("ad_header_style")(ad_header_style.asInstanceOf[js.Any])
    if (ad_id != null) __obj.updateDynamic("ad_id")(ad_id.asInstanceOf[js.Any])
    if (ad_link_type != null) __obj.updateDynamic("ad_link_type")(ad_link_type.asInstanceOf[js.Any])
    if (ad_metadata != null) __obj.updateDynamic("ad_metadata")(ad_metadata.asInstanceOf[js.Any])
    if (android_links != null) __obj.updateDynamic("android_links")(android_links.asInstanceOf[js.Any])
    if (!js.isUndefined(can_see_insights_as_brand)) __obj.updateDynamic("can_see_insights_as_brand")(can_see_insights_as_brand.asInstanceOf[js.Any])
    if (!js.isUndefined(can_viewer_reshare)) __obj.updateDynamic("can_viewer_reshare")(can_viewer_reshare.asInstanceOf[js.Any])
    if (carousel_media != null) __obj.updateDynamic("carousel_media")(carousel_media.asInstanceOf[js.Any])
    if (carousel_media_count != null) __obj.updateDynamic("carousel_media_count")(carousel_media_count.asInstanceOf[js.Any])
    if (carousel_media_type != null) __obj.updateDynamic("carousel_media_type")(carousel_media_type.asInstanceOf[js.Any])
    if (!js.isUndefined(collapse_comments)) __obj.updateDynamic("collapse_comments")(collapse_comments.asInstanceOf[js.Any])
    if (dominant_color != null) __obj.updateDynamic("dominant_color")(dominant_color.asInstanceOf[js.Any])
    if (dr_ad_type != null) __obj.updateDynamic("dr_ad_type")(dr_ad_type.asInstanceOf[js.Any])
    if (expiring_at != null) __obj.updateDynamic("expiring_at")(expiring_at.asInstanceOf[js.Any])
    if (facepile_top_likers != null) __obj.updateDynamic("facepile_top_likers")(facepile_top_likers.asInstanceOf[js.Any])
    if (fb_page_url != null) __obj.updateDynamic("fb_page_url")(fb_page_url.asInstanceOf[js.Any])
    if (follower_count != null) __obj.updateDynamic("follower_count")(follower_count.asInstanceOf[js.Any])
    if (!js.isUndefined(force_overlay)) __obj.updateDynamic("force_overlay")(force_overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(has_audio)) __obj.updateDynamic("has_audio")(has_audio.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_nux_text)) __obj.updateDynamic("hide_nux_text")(hide_nux_text.asInstanceOf[js.Any])
    if (iTunesItem != null) __obj.updateDynamic("iTunesItem")(iTunesItem.asInstanceOf[js.Any])
    if (image_versions2 != null) __obj.updateDynamic("image_versions2")(image_versions2.asInstanceOf[js.Any])
    if (injected != null) __obj.updateDynamic("injected")(injected.asInstanceOf[js.Any])
    if (inline_composer_display_condition != null) __obj.updateDynamic("inline_composer_display_condition")(inline_composer_display_condition.asInstanceOf[js.Any])
    if (inline_composer_imp_trigger_time != null) __obj.updateDynamic("inline_composer_imp_trigger_time")(inline_composer_imp_trigger_time.asInstanceOf[js.Any])
    if (is_dash_eligible != null) __obj.updateDynamic("is_dash_eligible")(is_dash_eligible.asInstanceOf[js.Any])
    if (!js.isUndefined(is_sidecar_child)) __obj.updateDynamic("is_sidecar_child")(is_sidecar_child.asInstanceOf[js.Any])
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (link_hint_text != null) __obj.updateDynamic("link_hint_text")(link_hint_text.asInstanceOf[js.Any])
    if (link_text != null) __obj.updateDynamic("link_text")(link_text.asInstanceOf[js.Any])
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (next_max_id != null) __obj.updateDynamic("next_max_id")(next_max_id.asInstanceOf[js.Any])
    if (number_of_qualities != null) __obj.updateDynamic("number_of_qualities")(number_of_qualities.asInstanceOf[js.Any])
    if (original_height != null) __obj.updateDynamic("original_height")(original_height.asInstanceOf[js.Any])
    if (original_width != null) __obj.updateDynamic("original_width")(original_width.asInstanceOf[js.Any])
    if (overlay_subtitle != null) __obj.updateDynamic("overlay_subtitle")(overlay_subtitle.asInstanceOf[js.Any])
    if (overlay_text != null) __obj.updateDynamic("overlay_text")(overlay_text.asInstanceOf[js.Any])
    if (overlay_title != null) __obj.updateDynamic("overlay_title")(overlay_title.asInstanceOf[js.Any])
    if (post_count != null) __obj.updateDynamic("post_count")(post_count.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    if (video_codec != null) __obj.updateDynamic("video_codec")(video_codec.asInstanceOf[js.Any])
    if (video_dash_manifest != null) __obj.updateDynamic("video_dash_manifest")(video_dash_manifest.asInstanceOf[js.Any])
    if (video_duration != null) __obj.updateDynamic("video_duration")(video_duration.asInstanceOf[js.Any])
    if (video_versions != null) __obj.updateDynamic("video_versions")(video_versions.asInstanceOf[js.Any])
    if (view_count != null) __obj.updateDynamic("view_count")(view_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseMedia_or_ad]
  }
}

