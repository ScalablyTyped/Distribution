package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseItemsItem extends StObject {
  
  var attribution: js.UndefOr[TagFeedResponseAttribution] = js.native
  
  var can_reply: js.UndefOr[Boolean] = js.native
  
  var can_reshare: js.UndefOr[Boolean] = js.native
  
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
  
  var can_view_more_preview_comments: js.UndefOr[Boolean] = js.native
  
  var can_viewer_reshare: js.UndefOr[Boolean] = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: TagFeedResponseCaption | Null = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var caption_position: js.UndefOr[Double] = js.native
  
  var carousel_media: js.UndefOr[js.Array[TagFeedResponseCarouselMediaItem]] = js.native
  
  var carousel_media_count: js.UndefOr[Double] = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: js.UndefOr[Double] = js.native
  
  var comment_likes_enabled: js.UndefOr[Boolean] = js.native
  
  var comment_threading_enabled: js.UndefOr[Boolean] = js.native
  
  var commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.native
  
  var comments_disabled: js.UndefOr[Boolean] = js.native
  
  var creative_config: js.UndefOr[TagFeedResponseCreativeConfig] = js.native
  
  var device_timestamp: String | Double = js.native
  
  var expiring_at: js.UndefOr[Double] = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: js.UndefOr[Boolean] = js.native
  
  var has_liked: js.UndefOr[Boolean] = js.native
  
  var has_more_comments: js.UndefOr[Boolean] = js.native
  
  var has_shared_to_fb: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var image_versions2: js.UndefOr[TagFeedResponseImageVersions2] = js.native
  
  var imported_taken_at: js.UndefOr[Double] = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var is_reel_media: js.UndefOr[Boolean] = js.native
  
  var lat: js.UndefOr[Double | String] = js.native
  
  var like_count: js.UndefOr[Double] = js.native
  
  var likers: js.UndefOr[js.Array[TagFeedResponseLikersItem]] = js.native
  
  var lng: js.UndefOr[Double | String] = js.native
  
  var location: js.UndefOr[TagFeedResponseLocation] = js.native
  
  var max_num_visible_preview_comments: js.UndefOr[Double] = js.native
  
  var media_type: Double = js.native
  
  var next_max_id: js.UndefOr[String] = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: js.UndefOr[Double] = js.native
  
  var original_width: js.UndefOr[Double] = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.UndefOr[js.Array[TagFeedResponsePreviewCommentsItem]] = js.native
  
  var reel_mentions: js.UndefOr[js.Array[TagFeedResponseReelMentionsItem]] = js.native
  
  var show_one_tap_fb_share_tooltip: js.UndefOr[Boolean] = js.native
  
  var story_hashtags: js.UndefOr[js.Array[TagFeedResponseStoryHashtagsItem]] = js.native
  
  var story_locations: js.UndefOr[js.Array[TagFeedResponseStoryLocationsItem]] = js.native
  
  var supports_reel_reactions: js.UndefOr[Boolean] = js.native
  
  var taken_at: Double = js.native
  
  var user: TagFeedResponseUser = js.native
  
  var usertags: js.UndefOr[TagFeedResponseUsertags] = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[TagFeedResponseVideoVersionsItem]] = js.native
  
  var view_count: js.UndefOr[Double] = js.native
}
object TagFeedResponseItemsItem {
  
  @scala.inline
  def apply(
    can_viewer_save: Boolean,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    filter_type: Double,
    id: String,
    media_type: Double,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    taken_at: Double,
    user: TagFeedResponseUser
  ): TagFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseItemsItem]
  }
  
  @scala.inline
  implicit class TagFeedResponseItemsItemMutableBuilder[Self <: TagFeedResponseItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: TagFeedResponseAttribution): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_replyUndefined: Self = StObject.set(x, "can_reply", js.undefined)
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshareUndefined: Self = StObject.set(x, "can_reshare", js.undefined)
    
    @scala.inline
    def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_insights_as_brandUndefined: Self = StObject.set(x, "can_see_insights_as_brand", js.undefined)
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_view_more_preview_commentsUndefined: Self = StObject.set(x, "can_view_more_preview_comments", js.undefined)
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_reshareUndefined: Self = StObject.set(x, "can_viewer_reshare", js.undefined)
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: TagFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_position(value: Double): Self = StObject.set(x, "caption_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_positionUndefined: Self = StObject.set(x, "caption_position", js.undefined)
    
    @scala.inline
    def setCarousel_media(value: js.Array[TagFeedResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_mediaUndefined: Self = StObject.set(x, "carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: TagFeedResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
    
    @scala.inline
    def setCarousel_media_count(value: Double): Self = StObject.set(x, "carousel_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_media_countUndefined: Self = StObject.set(x, "carousel_media_count", js.undefined)
    
    @scala.inline
    def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_countUndefined: Self = StObject.set(x, "comment_count", js.undefined)
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_likes_enabledUndefined: Self = StObject.set(x, "comment_likes_enabled", js.undefined)
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_threading_enabledUndefined: Self = StObject.set(x, "comment_threading_enabled", js.undefined)
    
    @scala.inline
    def setCommenting_disabled_for_viewer(value: Boolean): Self = StObject.set(x, "commenting_disabled_for_viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommenting_disabled_for_viewerUndefined: Self = StObject.set(x, "commenting_disabled_for_viewer", js.undefined)
    
    @scala.inline
    def setComments_disabled(value: Boolean): Self = StObject.set(x, "comments_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_disabledUndefined: Self = StObject.set(x, "comments_disabled", js.undefined)
    
    @scala.inline
    def setCreative_config(value: TagFeedResponseCreativeConfig): Self = StObject.set(x, "creative_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreative_configUndefined: Self = StObject.set(x, "creative_config", js.undefined)
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_atUndefined: Self = StObject.set(x, "expiring_at", js.undefined)
    
    @scala.inline
    def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_likedUndefined: Self = StObject.set(x, "has_liked", js.undefined)
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_commentsUndefined: Self = StObject.set(x, "has_more_comments", js.undefined)
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = StObject.set(x, "has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_shared_to_fbUndefined: Self = StObject.set(x, "has_shared_to_fb", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TagFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2Undefined: Self = StObject.set(x, "image_versions2", js.undefined)
    
    @scala.inline
    def setImported_taken_at(value: Double): Self = StObject.set(x, "imported_taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImported_taken_atUndefined: Self = StObject.set(x, "imported_taken_at", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
    @scala.inline
    def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_reel_mediaUndefined: Self = StObject.set(x, "is_reel_media", js.undefined)
    
    @scala.inline
    def setLat(value: Double | String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_countUndefined: Self = StObject.set(x, "like_count", js.undefined)
    
    @scala.inline
    def setLikers(value: js.Array[TagFeedResponseLikersItem]): Self = StObject.set(x, "likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikersUndefined: Self = StObject.set(x, "likers", js.undefined)
    
    @scala.inline
    def setLikersVarargs(value: TagFeedResponseLikersItem*): Self = StObject.set(x, "likers", js.Array(value :_*))
    
    @scala.inline
    def setLng(value: Double | String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    @scala.inline
    def setLocation(value: TagFeedResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_commentsUndefined: Self = StObject.set(x, "max_num_visible_preview_comments", js.undefined)
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_idUndefined: Self = StObject.set(x, "next_max_id", js.undefined)
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_of_qualitiesUndefined: Self = StObject.set(x, "number_of_qualities", js.undefined)
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_heightUndefined: Self = StObject.set(x, "original_height", js.undefined)
    
    @scala.inline
    def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_widthUndefined: Self = StObject.set(x, "original_width", js.undefined)
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_comments(value: js.Array[TagFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsUndefined: Self = StObject.set(x, "preview_comments", js.undefined)
    
    @scala.inline
    def setPreview_commentsVarargs(value: TagFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setReel_mentions(value: js.Array[TagFeedResponseReelMentionsItem]): Self = StObject.set(x, "reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReel_mentionsUndefined: Self = StObject.set(x, "reel_mentions", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: TagFeedResponseReelMentionsItem*): Self = StObject.set(x, "reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = StObject.set(x, "show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_one_tap_fb_share_tooltipUndefined: Self = StObject.set(x, "show_one_tap_fb_share_tooltip", js.undefined)
    
    @scala.inline
    def setStory_hashtags(value: js.Array[TagFeedResponseStoryHashtagsItem]): Self = StObject.set(x, "story_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_hashtagsUndefined: Self = StObject.set(x, "story_hashtags", js.undefined)
    
    @scala.inline
    def setStory_hashtagsVarargs(value: TagFeedResponseStoryHashtagsItem*): Self = StObject.set(x, "story_hashtags", js.Array(value :_*))
    
    @scala.inline
    def setStory_locations(value: js.Array[TagFeedResponseStoryLocationsItem]): Self = StObject.set(x, "story_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_locationsUndefined: Self = StObject.set(x, "story_locations", js.undefined)
    
    @scala.inline
    def setStory_locationsVarargs(value: TagFeedResponseStoryLocationsItem*): Self = StObject.set(x, "story_locations", js.Array(value :_*))
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = StObject.set(x, "supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports_reel_reactionsUndefined: Self = StObject.set(x, "supports_reel_reactions", js.undefined)
    
    @scala.inline
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TagFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags(value: TagFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    
    @scala.inline
    def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_codecUndefined: Self = StObject.set(x, "video_codec", js.undefined)
    
    @scala.inline
    def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_dash_manifestUndefined: Self = StObject.set(x, "video_dash_manifest", js.undefined)
    
    @scala.inline
    def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
    
    @scala.inline
    def setVideo_versions(value: js.Array[TagFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: TagFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
    @scala.inline
    def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_countUndefined: Self = StObject.set(x, "view_count", js.undefined)
  }
}
