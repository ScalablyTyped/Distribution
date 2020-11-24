package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponseItemsItem extends js.Object {
  
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
  implicit class TagFeedResponseItemsItemOps[Self <: TagFeedResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_cache_key(value: String): Self = this.set("client_cache_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = this.set("photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TagFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribution(value: TagFeedResponseAttribution): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    
    @scala.inline
    def setCan_reply(value: Boolean): Self = this.set("can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_reply: Self = this.set("can_reply", js.undefined)
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = this.set("can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_reshare: Self = this.set("can_reshare", js.undefined)
    
    @scala.inline
    def setCan_see_insights_as_brand(value: Boolean): Self = this.set("can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_see_insights_as_brand: Self = this.set("can_see_insights_as_brand", js.undefined)
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_view_more_preview_comments: Self = this.set("can_view_more_preview_comments", js.undefined)
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = this.set("can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_viewer_reshare: Self = this.set("can_viewer_reshare", js.undefined)
    
    @scala.inline
    def setCaption(value: TagFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionNull: Self = this.set("caption", null)
    
    @scala.inline
    def setCaption_position(value: Double): Self = this.set("caption_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption_position: Self = this.set("caption_position", js.undefined)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: TagFeedResponseCarouselMediaItem*): Self = this.set("carousel_media", js.Array(value :_*))
    
    @scala.inline
    def setCarousel_media(value: js.Array[TagFeedResponseCarouselMediaItem]): Self = this.set("carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media: Self = this.set("carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_media_count(value: Double): Self = this.set("carousel_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media_count: Self = this.set("carousel_media_count", js.undefined)
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_count: Self = this.set("comment_count", js.undefined)
    
    @scala.inline
    def setComment_likes_enabled(value: Boolean): Self = this.set("comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_likes_enabled: Self = this.set("comment_likes_enabled", js.undefined)
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = this.set("comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_threading_enabled: Self = this.set("comment_threading_enabled", js.undefined)
    
    @scala.inline
    def setCommenting_disabled_for_viewer(value: Boolean): Self = this.set("commenting_disabled_for_viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommenting_disabled_for_viewer: Self = this.set("commenting_disabled_for_viewer", js.undefined)
    
    @scala.inline
    def setComments_disabled(value: Boolean): Self = this.set("comments_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments_disabled: Self = this.set("comments_disabled", js.undefined)
    
    @scala.inline
    def setCreative_config(value: TagFeedResponseCreativeConfig): Self = this.set("creative_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreative_config: Self = this.set("creative_config", js.undefined)
    
    @scala.inline
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiring_at: Self = this.set("expiring_at", js.undefined)
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_audio: Self = this.set("has_audio", js.undefined)
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = this.set("has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_liked: Self = this.set("has_liked", js.undefined)
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_more_comments: Self = this.set("has_more_comments", js.undefined)
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = this.set("has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_shared_to_fb: Self = this.set("has_shared_to_fb", js.undefined)
    
    @scala.inline
    def setImage_versions2(value: TagFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_versions2: Self = this.set("image_versions2", js.undefined)
    
    @scala.inline
    def setImported_taken_at(value: Double): Self = this.set("imported_taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImported_taken_at: Self = this.set("imported_taken_at", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_dash_eligible: Self = this.set("is_dash_eligible", js.undefined)
    
    @scala.inline
    def setIs_reel_media(value: Boolean): Self = this.set("is_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_reel_media: Self = this.set("is_reel_media", js.undefined)
    
    @scala.inline
    def setLat(value: Double | String): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLike_count: Self = this.set("like_count", js.undefined)
    
    @scala.inline
    def setLikersVarargs(value: TagFeedResponseLikersItem*): Self = this.set("likers", js.Array(value :_*))
    
    @scala.inline
    def setLikers(value: js.Array[TagFeedResponseLikersItem]): Self = this.set("likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikers: Self = this.set("likers", js.undefined)
    
    @scala.inline
    def setLng(value: Double | String): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setLocation(value: TagFeedResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = this.set("max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_num_visible_preview_comments: Self = this.set("max_num_visible_preview_comments", js.undefined)
    
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
    def setPreview_commentsVarargs(value: TagFeedResponsePreviewCommentsItem*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[TagFeedResponsePreviewCommentsItem]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview_comments: Self = this.set("preview_comments", js.undefined)
    
    @scala.inline
    def setReel_mentionsVarargs(value: TagFeedResponseReelMentionsItem*): Self = this.set("reel_mentions", js.Array(value :_*))
    
    @scala.inline
    def setReel_mentions(value: js.Array[TagFeedResponseReelMentionsItem]): Self = this.set("reel_mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReel_mentions: Self = this.set("reel_mentions", js.undefined)
    
    @scala.inline
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = this.set("show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_one_tap_fb_share_tooltip: Self = this.set("show_one_tap_fb_share_tooltip", js.undefined)
    
    @scala.inline
    def setStory_hashtagsVarargs(value: TagFeedResponseStoryHashtagsItem*): Self = this.set("story_hashtags", js.Array(value :_*))
    
    @scala.inline
    def setStory_hashtags(value: js.Array[TagFeedResponseStoryHashtagsItem]): Self = this.set("story_hashtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_hashtags: Self = this.set("story_hashtags", js.undefined)
    
    @scala.inline
    def setStory_locationsVarargs(value: TagFeedResponseStoryLocationsItem*): Self = this.set("story_locations", js.Array(value :_*))
    
    @scala.inline
    def setStory_locations(value: js.Array[TagFeedResponseStoryLocationsItem]): Self = this.set("story_locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStory_locations: Self = this.set("story_locations", js.undefined)
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = this.set("supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupports_reel_reactions: Self = this.set("supports_reel_reactions", js.undefined)
    
    @scala.inline
    def setUsertags(value: TagFeedResponseUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
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
    def setVideo_versionsVarargs(value: TagFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[TagFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_versions: Self = this.set("video_versions", js.undefined)
    
    @scala.inline
    def setView_count(value: Double): Self = this.set("view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_count: Self = this.set("view_count", js.undefined)
  }
}
