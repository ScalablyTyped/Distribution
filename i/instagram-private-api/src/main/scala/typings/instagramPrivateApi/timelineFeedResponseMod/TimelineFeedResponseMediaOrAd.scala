package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseMediaOrAd extends js.Object {
  
  var ad_action: js.UndefOr[String] = js.native
  
  var ad_header_style: js.UndefOr[Double] = js.native
  
  var ad_id: js.UndefOr[String] = js.native
  
  var ad_link_type: js.UndefOr[Double] = js.native
  
  var ad_metadata: js.UndefOr[js.Array[TimelineFeedResponseAdMetadataItem]] = js.native
  
  var android_links: js.UndefOr[js.Array[TimelineFeedResponseAndroidLinksItem]] = js.native
  
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var can_viewer_reshare: js.UndefOr[Boolean] = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: TimelineFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var carousel_media: js.UndefOr[js.Array[TimelineFeedResponseCarouselMediaItem]] = js.native
  
  var carousel_media_count: js.UndefOr[Double] = js.native
  
  var carousel_media_type: js.UndefOr[Double] = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var collapse_comments: js.UndefOr[Boolean] = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_threading_enabled: Boolean = js.native
  
  var device_timestamp: String | Double = js.native
  
  var direct_reply_to_author_enabled: Boolean = js.native
  
  var dominant_color: js.UndefOr[String] = js.native
  
  var dr_ad_type: js.UndefOr[Double] = js.native
  
  var expiring_at: js.UndefOr[Double] = js.native
  
  var facepile_top_likers: js.UndefOr[js.Array[TimelineFeedResponseFacepileTopLikersItem]] = js.native
  
  var fb_page_url: js.UndefOr[String] = js.native
  
  var filter_type: Double = js.native
  
  var follower_count: js.UndefOr[Double] = js.native
  
  var force_overlay: js.UndefOr[Boolean] = js.native
  
  var has_audio: js.UndefOr[Boolean] = js.native
  
  var has_liked: Boolean = js.native
  
  var has_more_comments: Boolean = js.native
  
  var hide_nux_text: js.UndefOr[Boolean] = js.native
  
  var iTunesItem: js.UndefOr[Null] = js.native
  
  var id: String = js.native
  
  var image_versions2: js.UndefOr[TimelineFeedResponseImageVersions2] = js.native
  
  var injected: js.UndefOr[TimelineFeedResponseInjected] = js.native
  
  var inline_composer_display_condition: js.UndefOr[String] = js.native
  
  var inline_composer_imp_trigger_time: js.UndefOr[Double] = js.native
  
  var inventory_source: String = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var is_eof: Boolean = js.native
  
  var is_seen: Boolean = js.native
  
  var is_sidecar_child: js.UndefOr[Boolean] = js.native
  
  var lat: js.UndefOr[Double] = js.native
  
  var like_count: Double = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var link_hint_text: js.UndefOr[String] = js.native
  
  var link_text: js.UndefOr[String] = js.native
  
  var lng: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[TimelineFeedResponseLocation] = js.native
  
  var max_num_visible_preview_comments: Double = js.native
  
  var media_type: Double = js.native
  
  var next_max_id: js.UndefOr[String] = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: js.UndefOr[Double] = js.native
  
  var original_width: js.UndefOr[Double] = js.native
  
  var overlay_subtitle: js.UndefOr[String] = js.native
  
  var overlay_text: js.UndefOr[String] = js.native
  
  var overlay_title: js.UndefOr[String] = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var post_count: js.UndefOr[Double] = js.native
  
  var preview: js.UndefOr[String] = js.native
  
  var preview_comments: js.Array[TimelineFeedResponsePreviewCommentsItem] = js.native
  
  var taken_at: Double = js.native
  
  var top_likers: js.Array[String] = js.native
  
  var user: TimelineFeedResponseUser = js.native
  
  var usertags: js.UndefOr[TimelineFeedResponseUsertags] = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[TimelineFeedResponseVideoVersionsItem]] = js.native
  
  var view_count: js.UndefOr[Double] = js.native
}
object TimelineFeedResponseMediaOrAd {
  
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
    user: TimelineFeedResponseUser
  ): TimelineFeedResponseMediaOrAd = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], direct_reply_to_author_enabled = direct_reply_to_author_enabled.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inventory_source = inventory_source.asInstanceOf[js.Any], is_eof = is_eof.asInstanceOf[js.Any], is_seen = is_seen.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseMediaOrAd]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseMediaOrAdOps[Self <: TimelineFeedResponseMediaOrAd] (val x: Self) extends AnyVal {
    
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
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: TimelineFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = this.set("client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = this.set("comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = this.set("comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirect_reply_to_author_enabled(value: Boolean): Self = this.set("direct_reply_to_author_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = this.set("has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventory_source(value: String): Self = this.set("inventory_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_eof(value: Boolean): Self = this.set("is_eof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_seen(value: Boolean): Self = this.set("is_seen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = this.set("max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = this.set("photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: TimelineFeedResponsePreviewCommentsItem*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[TimelineFeedResponsePreviewCommentsItem]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_likersVarargs(value: String*): Self = this.set("top_likers", js.Array(value :_*))
    
    @scala.inline
    def setTop_likers(value: js.Array[String]): Self = this.set("top_likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TimelineFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAd_action(value: String): Self = this.set("ad_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_action: Self = this.set("ad_action", js.undefined)
    
    @scala.inline
    def setAd_header_style(value: Double): Self = this.set("ad_header_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_header_style: Self = this.set("ad_header_style", js.undefined)
    
    @scala.inline
    def setAd_id(value: String): Self = this.set("ad_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_id: Self = this.set("ad_id", js.undefined)
    
    @scala.inline
    def setAd_link_type(value: Double): Self = this.set("ad_link_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_link_type: Self = this.set("ad_link_type", js.undefined)
    
    @scala.inline
    def setAd_metadataVarargs(value: TimelineFeedResponseAdMetadataItem*): Self = this.set("ad_metadata", js.Array(value :_*))
    
    @scala.inline
    def setAd_metadata(value: js.Array[TimelineFeedResponseAdMetadataItem]): Self = this.set("ad_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAd_metadata: Self = this.set("ad_metadata", js.undefined)
    
    @scala.inline
    def setAndroid_linksVarargs(value: TimelineFeedResponseAndroidLinksItem*): Self = this.set("android_links", js.Array(value :_*))
    
    @scala.inline
    def setAndroid_links(value: js.Array[TimelineFeedResponseAndroidLinksItem]): Self = this.set("android_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroid_links: Self = this.set("android_links", js.undefined)
    
    @scala.inline
    def setCan_see_insights_as_brand(value: Boolean): Self = this.set("can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_see_insights_as_brand: Self = this.set("can_see_insights_as_brand", js.undefined)
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = this.set("can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_viewer_reshare: Self = this.set("can_viewer_reshare", js.undefined)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: TimelineFeedResponseCarouselMediaItem*): Self = this.set("carousel_media", js.Array(value :_*))
    
    @scala.inline
    def setCarousel_media(value: js.Array[TimelineFeedResponseCarouselMediaItem]): Self = this.set("carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media: Self = this.set("carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_media_count(value: Double): Self = this.set("carousel_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media_count: Self = this.set("carousel_media_count", js.undefined)
    
    @scala.inline
    def setCarousel_media_type(value: Double): Self = this.set("carousel_media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media_type: Self = this.set("carousel_media_type", js.undefined)
    
    @scala.inline
    def setCollapse_comments(value: Boolean): Self = this.set("collapse_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse_comments: Self = this.set("collapse_comments", js.undefined)
    
    @scala.inline
    def setDominant_color(value: String): Self = this.set("dominant_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominant_color: Self = this.set("dominant_color", js.undefined)
    
    @scala.inline
    def setDr_ad_type(value: Double): Self = this.set("dr_ad_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDr_ad_type: Self = this.set("dr_ad_type", js.undefined)
    
    @scala.inline
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiring_at: Self = this.set("expiring_at", js.undefined)
    
    @scala.inline
    def setFacepile_top_likersVarargs(value: TimelineFeedResponseFacepileTopLikersItem*): Self = this.set("facepile_top_likers", js.Array(value :_*))
    
    @scala.inline
    def setFacepile_top_likers(value: js.Array[TimelineFeedResponseFacepileTopLikersItem]): Self = this.set("facepile_top_likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacepile_top_likers: Self = this.set("facepile_top_likers", js.undefined)
    
    @scala.inline
    def setFb_page_url(value: String): Self = this.set("fb_page_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFb_page_url: Self = this.set("fb_page_url", js.undefined)
    
    @scala.inline
    def setFollower_count(value: Double): Self = this.set("follower_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollower_count: Self = this.set("follower_count", js.undefined)
    
    @scala.inline
    def setForce_overlay(value: Boolean): Self = this.set("force_overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_overlay: Self = this.set("force_overlay", js.undefined)
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_audio: Self = this.set("has_audio", js.undefined)
    
    @scala.inline
    def setHide_nux_text(value: Boolean): Self = this.set("hide_nux_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide_nux_text: Self = this.set("hide_nux_text", js.undefined)
    
    @scala.inline
    def setImage_versions2(value: TimelineFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_versions2: Self = this.set("image_versions2", js.undefined)
    
    @scala.inline
    def setInjected(value: TimelineFeedResponseInjected): Self = this.set("injected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjected: Self = this.set("injected", js.undefined)
    
    @scala.inline
    def setInline_composer_display_condition(value: String): Self = this.set("inline_composer_display_condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_composer_display_condition: Self = this.set("inline_composer_display_condition", js.undefined)
    
    @scala.inline
    def setInline_composer_imp_trigger_time(value: Double): Self = this.set("inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_composer_imp_trigger_time: Self = this.set("inline_composer_imp_trigger_time", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_dash_eligible: Self = this.set("is_dash_eligible", js.undefined)
    
    @scala.inline
    def setIs_sidecar_child(value: Boolean): Self = this.set("is_sidecar_child", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_sidecar_child: Self = this.set("is_sidecar_child", js.undefined)
    
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLink_hint_text(value: String): Self = this.set("link_hint_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink_hint_text: Self = this.set("link_hint_text", js.undefined)
    
    @scala.inline
    def setLink_text(value: String): Self = this.set("link_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink_text: Self = this.set("link_text", js.undefined)
    
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setLocation(value: TimelineFeedResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_max_id: Self = this.set("next_max_id", js.undefined)
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = this.set("number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber_of_qualities: Self = this.set("number_of_qualities", js.undefined)
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal_height: Self = this.set("original_height", js.undefined)
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal_width: Self = this.set("original_width", js.undefined)
    
    @scala.inline
    def setOverlay_subtitle(value: String): Self = this.set("overlay_subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_subtitle: Self = this.set("overlay_subtitle", js.undefined)
    
    @scala.inline
    def setOverlay_text(value: String): Self = this.set("overlay_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_text: Self = this.set("overlay_text", js.undefined)
    
    @scala.inline
    def setOverlay_title(value: String): Self = this.set("overlay_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay_title: Self = this.set("overlay_title", js.undefined)
    
    @scala.inline
    def setPost_count(value: Double): Self = this.set("post_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost_count: Self = this.set("post_count", js.undefined)
    
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setUsertags(value: TimelineFeedResponseUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
    
    @scala.inline
    def setVideo_codec(value: String): Self = this.set("video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_codec: Self = this.set("video_codec", js.undefined)
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = this.set("video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_dash_manifest: Self = this.set("video_dash_manifest", js.undefined)
    
    @scala.inline
    def setVideo_duration(value: Double): Self = this.set("video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_duration: Self = this.set("video_duration", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: TimelineFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[TimelineFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_versions: Self = this.set("video_versions", js.undefined)
    
    @scala.inline
    def setView_count(value: Double): Self = this.set("view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_count: Self = this.set("view_count", js.undefined)
  }
}
