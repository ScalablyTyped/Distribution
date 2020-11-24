package typings.instagramPrivateApi.userFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFeedResponseItemsItem extends js.Object {
  
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.native
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var can_viewer_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: Null | UserFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var carousel_media: js.UndefOr[js.Array[UserFeedResponseCarouselMediaItem]] = js.native
  
  var carousel_media_count: js.UndefOr[Double] = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_threading_enabled: Boolean = js.native
  
  var device_timestamp: String | Double = js.native
  
  var direct_reply_to_author_enabled: Boolean = js.native
  
  var facepile_top_likers: js.UndefOr[js.Array[UserFeedResponseFacepileTopLikersItem]] = js.native
  
  var fb_user_tags: js.UndefOr[UserFeedResponseFbUserTags] = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: js.UndefOr[Boolean] = js.native
  
  var has_liked: Boolean = js.native
  
  var has_more_comments: Boolean = js.native
  
  var id: String = js.native
  
  var image_versions2: UserFeedResponseImageVersions2 = js.native
  
  var inline_composer_display_condition: String = js.native
  
  var inline_composer_imp_trigger_time: Double = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var like_count: Double = js.native
  
  var max_num_visible_preview_comments: Double = js.native
  
  var media_type: Double = js.native
  
  var next_max_id: js.UndefOr[String] = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.Array[UserFeedResponsePreviewCommentsItem] = js.native
  
  var taken_at: Double = js.native
  
  var top_likers: js.Array[String] = js.native
  
  var user: UserFeedResponseUser = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[UserFeedResponseVideoVersionsItem]] = js.native
  
  var view_count: js.UndefOr[Double] = js.native
}
object UserFeedResponseItemsItem {
  
  @scala.inline
  def apply(
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
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
    image_versions2: UserFeedResponseImageVersions2,
    inline_composer_display_condition: String,
    inline_composer_imp_trigger_time: Double,
    like_count: Double,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[UserFeedResponsePreviewCommentsItem],
    taken_at: Double,
    top_likers: js.Array[String],
    user: UserFeedResponseUser
  ): UserFeedResponseItemsItem = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], direct_reply_to_author_enabled = direct_reply_to_author_enabled.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], inline_composer_display_condition = inline_composer_display_condition.asInstanceOf[js.Any], inline_composer_imp_trigger_time = inline_composer_imp_trigger_time.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedResponseItemsItem]
  }
  
  @scala.inline
  implicit class UserFeedResponseItemsItemOps[Self <: UserFeedResponseItemsItem] (val x: Self) extends AnyVal {
    
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
    def setCan_viewer_reshare(value: Boolean): Self = this.set("can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
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
    def setImage_versions2(value: UserFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_composer_display_condition(value: String): Self = this.set("inline_composer_display_condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_composer_imp_trigger_time(value: Double): Self = this.set("inline_composer_imp_trigger_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = this.set("max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = this.set("photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: UserFeedResponsePreviewCommentsItem*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[UserFeedResponsePreviewCommentsItem]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_likersVarargs(value: String*): Self = this.set("top_likers", js.Array(value :_*))
    
    @scala.inline
    def setTop_likers(value: js.Array[String]): Self = this.set("top_likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_see_insights_as_brand(value: Boolean): Self = this.set("can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_see_insights_as_brand: Self = this.set("can_see_insights_as_brand", js.undefined)
    
    @scala.inline
    def setCaption(value: UserFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionNull: Self = this.set("caption", null)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: UserFeedResponseCarouselMediaItem*): Self = this.set("carousel_media", js.Array(value :_*))
    
    @scala.inline
    def setCarousel_media(value: js.Array[UserFeedResponseCarouselMediaItem]): Self = this.set("carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media: Self = this.set("carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_media_count(value: Double): Self = this.set("carousel_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media_count: Self = this.set("carousel_media_count", js.undefined)
    
    @scala.inline
    def setFacepile_top_likersVarargs(value: UserFeedResponseFacepileTopLikersItem*): Self = this.set("facepile_top_likers", js.Array(value :_*))
    
    @scala.inline
    def setFacepile_top_likers(value: js.Array[UserFeedResponseFacepileTopLikersItem]): Self = this.set("facepile_top_likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacepile_top_likers: Self = this.set("facepile_top_likers", js.undefined)
    
    @scala.inline
    def setFb_user_tags(value: UserFeedResponseFbUserTags): Self = this.set("fb_user_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFb_user_tags: Self = this.set("fb_user_tags", js.undefined)
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_audio: Self = this.set("has_audio", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_dash_eligible: Self = this.set("is_dash_eligible", js.undefined)
    
    @scala.inline
    def setNext_max_id(value: String): Self = this.set("next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext_max_id: Self = this.set("next_max_id", js.undefined)
    
    @scala.inline
    def setNumber_of_qualities(value: Double): Self = this.set("number_of_qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber_of_qualities: Self = this.set("number_of_qualities", js.undefined)
    
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
    def setVideo_versionsVarargs(value: UserFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[UserFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_versions: Self = this.set("video_versions", js.undefined)
    
    @scala.inline
    def setView_count(value: Double): Self = this.set("view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_count: Self = this.set("view_count", js.undefined)
  }
}
