package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseMedia extends js.Object {
  
  var algorithm: js.UndefOr[String] = js.native
  
  var can_see_insights_as_brand: Boolean = js.native
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var can_viewer_reshare: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: TopicalExploreFeedResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var carousel_media: js.UndefOr[js.Array[TopicalExploreFeedResponseCarouselMediaItem]] = js.native
  
  var carousel_media_count: js.UndefOr[Double] = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_threading_enabled: Boolean = js.native
  
  var connection_id: js.UndefOr[String] = js.native
  
  var deleted_reason: Double = js.native
  
  var device_timestamp: Double | String = js.native
  
  var explore: TopicalExploreFeedResponseExplore = js.native
  
  var explore_context: js.UndefOr[String] = js.native
  
  var explore_hide_comments: js.UndefOr[Boolean] = js.native
  
  var explore_source_token: js.UndefOr[String] = js.native
  
  var filter_type: Double = js.native
  
  var has_audio: js.UndefOr[Boolean] = js.native
  
  var has_liked: js.UndefOr[Boolean] = js.native
  
  var has_more_comments: Boolean = js.native
  
  var id: String = js.native
  
  var image_versions2: js.UndefOr[TopicalExploreFeedResponseImageVersions2] = js.native
  
  var impression_token: js.UndefOr[String] = js.native
  
  var is_dash_eligible: js.UndefOr[Double] = js.native
  
  var is_in_profile_grid: Boolean = js.native
  
  var is_post_live: js.UndefOr[Boolean] = js.native
  
  var is_shop_the_look_eligible: Boolean = js.native
  
  var lat: js.UndefOr[Double] = js.native
  
  var like_count: js.UndefOr[Double] = js.native
  
  var lng: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[TopicalExploreFeedResponseLocation] = js.native
  
  var max_num_visible_preview_comments: Double = js.native
  
  var media_cropping_info: js.UndefOr[TopicalExploreFeedResponseMediaCroppingInfo] = js.native
  
  var media_type: Double = js.native
  
  var mezql_token: String = js.native
  
  var nearly_complete_copyright_match: js.UndefOr[Boolean] = js.native
  
  var number_of_qualities: js.UndefOr[Double] = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: js.UndefOr[Double] = js.native
  
  var original_width: js.UndefOr[Double] = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.Array[_] = js.native
  
  var product_tags: js.UndefOr[TopicalExploreFeedResponseProductTags] = js.native
  
  var product_type: js.UndefOr[String] = js.native
  
  var profile_grid_control_enabled: Boolean = js.native
  
  var sharing_friction_info: TopicalExploreFeedResponseSharingFrictionInfo = js.native
  
  var taken_at: Double = js.native
  
  var thumbnails: js.UndefOr[TopicalExploreFeedResponseThumbnails] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var top_likers: js.UndefOr[js.Array[String]] = js.native
  
  var user: TopicalExploreFeedResponseUser = js.native
  
  var usertags: js.UndefOr[TopicalExploreFeedResponseUsertags] = js.native
  
  var video_codec: js.UndefOr[String] = js.native
  
  var video_dash_manifest: js.UndefOr[String] = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_versions: js.UndefOr[js.Array[TopicalExploreFeedResponseVideoVersionsItem]] = js.native
  
  var view_count: js.UndefOr[Double] = js.native
}
object TopicalExploreFeedResponseMedia {
  
  @scala.inline
  def apply(
    can_see_insights_as_brand: Boolean,
    can_view_more_preview_comments: Boolean,
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: TopicalExploreFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    deleted_reason: Double,
    device_timestamp: Double | String,
    explore: TopicalExploreFeedResponseExplore,
    filter_type: Double,
    has_more_comments: Boolean,
    id: String,
    is_in_profile_grid: Boolean,
    is_shop_the_look_eligible: Boolean,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    mezql_token: String,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[_],
    profile_grid_control_enabled: Boolean,
    sharing_friction_info: TopicalExploreFeedResponseSharingFrictionInfo,
    taken_at: Double,
    user: TopicalExploreFeedResponseUser
  ): TopicalExploreFeedResponseMedia = {
    val __obj = js.Dynamic.literal(can_see_insights_as_brand = can_see_insights_as_brand.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], deleted_reason = deleted_reason.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], explore = explore.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_in_profile_grid = is_in_profile_grid.asInstanceOf[js.Any], is_shop_the_look_eligible = is_shop_the_look_eligible.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], mezql_token = mezql_token.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], profile_grid_control_enabled = profile_grid_control_enabled.asInstanceOf[js.Any], sharing_friction_info = sharing_friction_info.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseMedia]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseMediaOps[Self <: TopicalExploreFeedResponseMedia] (val x: Self) extends AnyVal {
    
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
    def setCan_see_insights_as_brand(value: Boolean): Self = this.set("can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = this.set("can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: TopicalExploreFeedResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
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
    def setDeleted_reason(value: Double): Self = this.set("deleted_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: Double | String): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore(value: TopicalExploreFeedResponseExplore): Self = this.set("explore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_in_profile_grid(value: Boolean): Self = this.set("is_in_profile_grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_shop_the_look_eligible(value: Boolean): Self = this.set("is_shop_the_look_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = this.set("max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMezql_token(value: String): Self = this.set("mezql_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoto_of_you(value: Boolean): Self = this.set("photo_of_you", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: js.Any*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[_]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_grid_control_enabled(value: Boolean): Self = this.set("profile_grid_control_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharing_friction_info(value: TopicalExploreFeedResponseSharingFrictionInfo): Self = this.set("sharing_friction_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TopicalExploreFeedResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: TopicalExploreFeedResponseCarouselMediaItem*): Self = this.set("carousel_media", js.Array(value :_*))
    
    @scala.inline
    def setCarousel_media(value: js.Array[TopicalExploreFeedResponseCarouselMediaItem]): Self = this.set("carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media: Self = this.set("carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_media_count(value: Double): Self = this.set("carousel_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarousel_media_count: Self = this.set("carousel_media_count", js.undefined)
    
    @scala.inline
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_id: Self = this.set("connection_id", js.undefined)
    
    @scala.inline
    def setExplore_context(value: String): Self = this.set("explore_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplore_context: Self = this.set("explore_context", js.undefined)
    
    @scala.inline
    def setExplore_hide_comments(value: Boolean): Self = this.set("explore_hide_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplore_hide_comments: Self = this.set("explore_hide_comments", js.undefined)
    
    @scala.inline
    def setExplore_source_token(value: String): Self = this.set("explore_source_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplore_source_token: Self = this.set("explore_source_token", js.undefined)
    
    @scala.inline
    def setHas_audio(value: Boolean): Self = this.set("has_audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_audio: Self = this.set("has_audio", js.undefined)
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = this.set("has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_liked: Self = this.set("has_liked", js.undefined)
    
    @scala.inline
    def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_versions2: Self = this.set("image_versions2", js.undefined)
    
    @scala.inline
    def setImpression_token(value: String): Self = this.set("impression_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpression_token: Self = this.set("impression_token", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = this.set("is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_dash_eligible: Self = this.set("is_dash_eligible", js.undefined)
    
    @scala.inline
    def setIs_post_live(value: Boolean): Self = this.set("is_post_live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_post_live: Self = this.set("is_post_live", js.undefined)
    
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLike_count: Self = this.set("like_count", js.undefined)
    
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    
    @scala.inline
    def setLocation(value: TopicalExploreFeedResponseLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMedia_cropping_info(value: TopicalExploreFeedResponseMediaCroppingInfo): Self = this.set("media_cropping_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia_cropping_info: Self = this.set("media_cropping_info", js.undefined)
    
    @scala.inline
    def setNearly_complete_copyright_match(value: Boolean): Self = this.set("nearly_complete_copyright_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearly_complete_copyright_match: Self = this.set("nearly_complete_copyright_match", js.undefined)
    
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
    def setProduct_tags(value: TopicalExploreFeedResponseProductTags): Self = this.set("product_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct_tags: Self = this.set("product_tags", js.undefined)
    
    @scala.inline
    def setProduct_type(value: String): Self = this.set("product_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct_type: Self = this.set("product_type", js.undefined)
    
    @scala.inline
    def setThumbnails(value: TopicalExploreFeedResponseThumbnails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTop_likersVarargs(value: String*): Self = this.set("top_likers", js.Array(value :_*))
    
    @scala.inline
    def setTop_likers(value: js.Array[String]): Self = this.set("top_likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop_likers: Self = this.set("top_likers", js.undefined)
    
    @scala.inline
    def setUsertags(value: TopicalExploreFeedResponseUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
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
    def setVideo_versionsVarargs(value: TopicalExploreFeedResponseVideoVersionsItem*): Self = this.set("video_versions", js.Array(value :_*))
    
    @scala.inline
    def setVideo_versions(value: js.Array[TopicalExploreFeedResponseVideoVersionsItem]): Self = this.set("video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo_versions: Self = this.set("video_versions", js.undefined)
    
    @scala.inline
    def setView_count(value: Double): Self = this.set("view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView_count: Self = this.set("view_count", js.undefined)
  }
}
