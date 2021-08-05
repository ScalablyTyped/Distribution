package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFeedResponseMediaOrAd extends StObject {
  
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
  
  var image_versions2: js.UndefOr[TimelineFeedResponseImageVersions2] = js.undefined
  
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
object TimelineFeedResponseMediaOrAd {
  
  inline def apply(
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
    user: TimelineFeedResponseUser
  ): TimelineFeedResponseMediaOrAd = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], direct_reply_to_author_enabled = direct_reply_to_author_enabled.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inventory_source = inventory_source.asInstanceOf[js.Any], is_eof = is_eof.asInstanceOf[js.Any], is_seen = is_seen.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseMediaOrAd]
  }
  
  extension [Self <: TimelineFeedResponseMediaOrAd](x: Self) {
    
    inline def setAd_action(value: String): Self = StObject.set(x, "ad_action", value.asInstanceOf[js.Any])
    
    inline def setAd_actionUndefined: Self = StObject.set(x, "ad_action", js.undefined)
    
    inline def setAd_header_style(value: Double): Self = StObject.set(x, "ad_header_style", value.asInstanceOf[js.Any])
    
    inline def setAd_header_styleUndefined: Self = StObject.set(x, "ad_header_style", js.undefined)
    
    inline def setAd_id(value: String): Self = StObject.set(x, "ad_id", value.asInstanceOf[js.Any])
    
    inline def setAd_idUndefined: Self = StObject.set(x, "ad_id", js.undefined)
    
    inline def setAd_link_type(value: Double): Self = StObject.set(x, "ad_link_type", value.asInstanceOf[js.Any])
    
    inline def setAd_link_typeUndefined: Self = StObject.set(x, "ad_link_type", js.undefined)
    
    inline def setAd_metadata(value: js.Array[TimelineFeedResponseAdMetadataItem]): Self = StObject.set(x, "ad_metadata", value.asInstanceOf[js.Any])
    
    inline def setAd_metadataUndefined: Self = StObject.set(x, "ad_metadata", js.undefined)
    
    inline def setAd_metadataVarargs(value: TimelineFeedResponseAdMetadataItem*): Self = StObject.set(x, "ad_metadata", js.Array(value :_*))
    
    inline def setAndroid_links(value: js.Array[TimelineFeedResponseAndroidLinksItem]): Self = StObject.set(x, "android_links", value.asInstanceOf[js.Any])
    
    inline def setAndroid_linksUndefined: Self = StObject.set(x, "android_links", js.undefined)
    
    inline def setAndroid_linksVarargs(value: TimelineFeedResponseAndroidLinksItem*): Self = StObject.set(x, "android_links", js.Array(value :_*))
    
    inline def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    inline def setCan_see_insights_as_brandUndefined: Self = StObject.set(x, "can_see_insights_as_brand", js.undefined)
    
    inline def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    inline def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    inline def setCan_viewer_reshareUndefined: Self = StObject.set(x, "can_viewer_reshare", js.undefined)
    
    inline def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: TimelineFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    inline def setCarousel_media(value: js.Array[TimelineFeedResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
    
    inline def setCarousel_mediaUndefined: Self = StObject.set(x, "carousel_media", js.undefined)
    
    inline def setCarousel_mediaVarargs(value: TimelineFeedResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
    
    inline def setCarousel_media_count(value: Double): Self = StObject.set(x, "carousel_media_count", value.asInstanceOf[js.Any])
    
    inline def setCarousel_media_countUndefined: Self = StObject.set(x, "carousel_media_count", js.undefined)
    
    inline def setCarousel_media_type(value: Double): Self = StObject.set(x, "carousel_media_type", value.asInstanceOf[js.Any])
    
    inline def setCarousel_media_typeUndefined: Self = StObject.set(x, "carousel_media_type", js.undefined)
    
    inline def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCollapse_comments(value: Boolean): Self = StObject.set(x, "collapse_comments", value.asInstanceOf[js.Any])
    
    inline def setCollapse_commentsUndefined: Self = StObject.set(x, "collapse_comments", js.undefined)
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
    
    inline def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
    
    inline def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    inline def setDirect_reply_to_author_enabled(value: Boolean): Self = StObject.set(x, "direct_reply_to_author_enabled", value.asInstanceOf[js.Any])
    
    inline def setDominant_color(value: String): Self = StObject.set(x, "dominant_color", value.asInstanceOf[js.Any])
    
    inline def setDominant_colorUndefined: Self = StObject.set(x, "dominant_color", js.undefined)
    
    inline def setDr_ad_type(value: Double): Self = StObject.set(x, "dr_ad_type", value.asInstanceOf[js.Any])
    
    inline def setDr_ad_typeUndefined: Self = StObject.set(x, "dr_ad_type", js.undefined)
    
    inline def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    inline def setExpiring_atUndefined: Self = StObject.set(x, "expiring_at", js.undefined)
    
    inline def setFacepile_top_likers(value: js.Array[TimelineFeedResponseFacepileTopLikersItem]): Self = StObject.set(x, "facepile_top_likers", value.asInstanceOf[js.Any])
    
    inline def setFacepile_top_likersUndefined: Self = StObject.set(x, "facepile_top_likers", js.undefined)
    
    inline def setFacepile_top_likersVarargs(value: TimelineFeedResponseFacepileTopLikersItem*): Self = StObject.set(x, "facepile_top_likers", js.Array(value :_*))
    
    inline def setFb_page_url(value: String): Self = StObject.set(x, "fb_page_url", value.asInstanceOf[js.Any])
    
    inline def setFb_page_urlUndefined: Self = StObject.set(x, "fb_page_url", js.undefined)
    
    inline def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    inline def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
    
    inline def setFollower_countUndefined: Self = StObject.set(x, "follower_count", js.undefined)
    
    inline def setForce_overlay(value: Boolean): Self = StObject.set(x, "force_overlay", value.asInstanceOf[js.Any])
    
    inline def setForce_overlayUndefined: Self = StObject.set(x, "force_overlay", js.undefined)
    
    inline def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    inline def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
    
    inline def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
    
    inline def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
    
    inline def setHide_nux_text(value: Boolean): Self = StObject.set(x, "hide_nux_text", value.asInstanceOf[js.Any])
    
    inline def setHide_nux_textUndefined: Self = StObject.set(x, "hide_nux_text", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_versions2(value: TimelineFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    inline def setImage_versions2Undefined: Self = StObject.set(x, "image_versions2", js.undefined)
    
    inline def setInjected(value: TimelineFeedResponseInjected): Self = StObject.set(x, "injected", value.asInstanceOf[js.Any])
    
    inline def setInjectedUndefined: Self = StObject.set(x, "injected", js.undefined)
    
    inline def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
    
    inline def setInline_composer_display_conditionUndefined: Self = StObject.set(x, "inline_composer_display_condition", js.undefined)
    
    inline def setInline_composer_imp_trigger_time(value: Double): Self = StObject.set(x, "inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
    
    inline def setInline_composer_imp_trigger_timeUndefined: Self = StObject.set(x, "inline_composer_imp_trigger_time", js.undefined)
    
    inline def setInventory_source(value: String): Self = StObject.set(x, "inventory_source", value.asInstanceOf[js.Any])
    
    inline def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    inline def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
    inline def setIs_eof(value: Boolean): Self = StObject.set(x, "is_eof", value.asInstanceOf[js.Any])
    
    inline def setIs_seen(value: Boolean): Self = StObject.set(x, "is_seen", value.asInstanceOf[js.Any])
    
    inline def setIs_sidecar_child(value: Boolean): Self = StObject.set(x, "is_sidecar_child", value.asInstanceOf[js.Any])
    
    inline def setIs_sidecar_childUndefined: Self = StObject.set(x, "is_sidecar_child", js.undefined)
    
    inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLink_hint_text(value: String): Self = StObject.set(x, "link_hint_text", value.asInstanceOf[js.Any])
    
    inline def setLink_hint_textUndefined: Self = StObject.set(x, "link_hint_text", js.undefined)
    
    inline def setLink_text(value: String): Self = StObject.set(x, "link_text", value.asInstanceOf[js.Any])
    
    inline def setLink_textUndefined: Self = StObject.set(x, "link_text", js.undefined)
    
    inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    inline def setLocation(value: TimelineFeedResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    inline def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    inline def setNext_max_idUndefined: Self = StObject.set(x, "next_max_id", js.undefined)
    
    inline def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_qualitiesUndefined: Self = StObject.set(x, "number_of_qualities", js.undefined)
    
    inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    inline def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    inline def setOriginal_heightUndefined: Self = StObject.set(x, "original_height", js.undefined)
    
    inline def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    inline def setOriginal_widthUndefined: Self = StObject.set(x, "original_width", js.undefined)
    
    inline def setOverlay_subtitle(value: String): Self = StObject.set(x, "overlay_subtitle", value.asInstanceOf[js.Any])
    
    inline def setOverlay_subtitleUndefined: Self = StObject.set(x, "overlay_subtitle", js.undefined)
    
    inline def setOverlay_text(value: String): Self = StObject.set(x, "overlay_text", value.asInstanceOf[js.Any])
    
    inline def setOverlay_textUndefined: Self = StObject.set(x, "overlay_text", js.undefined)
    
    inline def setOverlay_title(value: String): Self = StObject.set(x, "overlay_title", value.asInstanceOf[js.Any])
    
    inline def setOverlay_titleUndefined: Self = StObject.set(x, "overlay_title", js.undefined)
    
    inline def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setPost_count(value: Double): Self = StObject.set(x, "post_count", value.asInstanceOf[js.Any])
    
    inline def setPost_countUndefined: Self = StObject.set(x, "post_count", js.undefined)
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setPreview_comments(value: js.Array[TimelineFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
    
    inline def setPreview_commentsVarargs(value: TimelineFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
    
    inline def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    inline def setTop_likers(value: js.Array[String]): Self = StObject.set(x, "top_likers", value.asInstanceOf[js.Any])
    
    inline def setTop_likersVarargs(value: String*): Self = StObject.set(x, "top_likers", js.Array(value :_*))
    
    inline def setUser(value: TimelineFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUsertags(value: TimelineFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    inline def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    
    inline def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    inline def setVideo_codecUndefined: Self = StObject.set(x, "video_codec", js.undefined)
    
    inline def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    inline def setVideo_dash_manifestUndefined: Self = StObject.set(x, "video_dash_manifest", js.undefined)
    
    inline def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    inline def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
    
    inline def setVideo_versions(value: js.Array[TimelineFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    inline def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    inline def setVideo_versionsVarargs(value: TimelineFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
    inline def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
    
    inline def setView_countUndefined: Self = StObject.set(x, "view_count", js.undefined)
  }
}
