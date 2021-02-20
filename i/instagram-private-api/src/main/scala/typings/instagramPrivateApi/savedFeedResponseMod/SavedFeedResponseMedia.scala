package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedFeedResponseMedia extends StObject {
  
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var can_viewer_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: SavedFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var carousel_media: js.UndefOr[js.Array[SavedFeedResponseCarouselMediaItem]] = js.native
  
  var carousel_media_count: js.UndefOr[Double] = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_threading_enabled: Boolean = js.native
  
  var device_timestamp: String | Double = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: js.UndefOr[Boolean] = js.native
  
  var has_liked: Boolean = js.native
  
  var has_more_comments: Boolean = js.native
  
  var has_viewer_saved: Boolean = js.native
  
  var id: String = js.native
  
  var image_versions2: js.UndefOr[SavedFeedResponseImageVersions2] = js.native
  
  var inline_composer_display_condition: String = js.native
  
  var inline_composer_imp_trigger_time: Double = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var is_external_share_disabled: js.UndefOr[Boolean] = js.native
  
  var like_count: Double = js.native
  
  var max_num_visible_preview_comments: Double = js.native
  
  var media_type: Double = js.native
  
  var next_max_id: String = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: js.UndefOr[Double] = js.native
  
  var original_width: js.UndefOr[Double] = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.Array[SavedFeedResponsePreviewCommentsItem] = js.native
  
  var product_tags: js.UndefOr[SavedFeedResponseProductTags] = js.native
  
  var saved_collection_ids: js.Array[_] = js.native
  
  var taken_at: Double = js.native
  
  var user: SavedFeedResponseUser = js.native
  
  var usertags: js.UndefOr[SavedFeedResponseUsertags] = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[SavedFeedResponseVideoVersionsItem]] = js.native
  
  var view_count: js.UndefOr[Double] = js.native
}
object SavedFeedResponseMedia {
  
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: SavedFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    device_timestamp: String | Double,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    has_viewer_saved: Boolean,
    id: String,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    next_max_id: String,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[SavedFeedResponsePreviewCommentsItem],
    saved_collection_ids: js.Array[_],
    taken_at: Double,
    user: SavedFeedResponseUser
  ): SavedFeedResponseMedia = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], saved_collection_ids = saved_collection_ids.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseMedia]
  }
  
  @scala.inline
  implicit class SavedFeedResponseMediaMutableBuilder[Self <: SavedFeedResponseMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_insights_as_brandUndefined: Self = StObject.set(x, "can_see_insights_as_brand", js.undefined)
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: SavedFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_media(value: js.Array[SavedFeedResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_mediaUndefined: Self = StObject.set(x, "carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: SavedFeedResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
    
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
    def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_viewer_saved(value: Boolean): Self = StObject.set(x, "has_viewer_saved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: SavedFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2Undefined: Self = StObject.set(x, "image_versions2", js.undefined)
    
    @scala.inline
    def setInline_composer_display_condition(value: String): Self = StObject.set(x, "inline_composer_display_condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_composer_imp_trigger_time(value: Double): Self = StObject.set(x, "inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
    @scala.inline
    def setIs_external_share_disabled(value: Boolean): Self = StObject.set(x, "is_external_share_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_external_share_disabledUndefined: Self = StObject.set(x, "is_external_share_disabled", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
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
    def setPreview_comments(value: js.Array[SavedFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: SavedFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setProduct_tags(value: SavedFeedResponseProductTags): Self = StObject.set(x, "product_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_tagsUndefined: Self = StObject.set(x, "product_tags", js.undefined)
    
    @scala.inline
    def setSaved_collection_ids(value: js.Array[_]): Self = StObject.set(x, "saved_collection_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaved_collection_idsVarargs(value: js.Any*): Self = StObject.set(x, "saved_collection_ids", js.Array(value :_*))
    
    @scala.inline
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: SavedFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags(value: SavedFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
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
    def setVideo_versions(value: js.Array[SavedFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: SavedFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
    @scala.inline
    def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_countUndefined: Self = StObject.set(x, "view_count", js.undefined)
  }
}
