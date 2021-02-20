package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseMedia extends StObject {
  
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
  implicit class TopicalExploreFeedResponseMediaMutableBuilder[Self <: TopicalExploreFeedResponseMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: TopicalExploreFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_media(value: js.Array[TopicalExploreFeedResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_mediaUndefined: Self = StObject.set(x, "carousel_media", js.undefined)
    
    @scala.inline
    def setCarousel_mediaVarargs(value: TopicalExploreFeedResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
    
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
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    @scala.inline
    def setDeleted_reason(value: Double): Self = StObject.set(x, "deleted_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: Double | String): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore(value: TopicalExploreFeedResponseExplore): Self = StObject.set(x, "explore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore_context(value: String): Self = StObject.set(x, "explore_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore_contextUndefined: Self = StObject.set(x, "explore_context", js.undefined)
    
    @scala.inline
    def setExplore_hide_comments(value: Boolean): Self = StObject.set(x, "explore_hide_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore_hide_commentsUndefined: Self = StObject.set(x, "explore_hide_comments", js.undefined)
    
    @scala.inline
    def setExplore_source_token(value: String): Self = StObject.set(x, "explore_source_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplore_source_tokenUndefined: Self = StObject.set(x, "explore_source_token", js.undefined)
    
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
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2Undefined: Self = StObject.set(x, "image_versions2", js.undefined)
    
    @scala.inline
    def setImpression_token(value: String): Self = StObject.set(x, "impression_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpression_tokenUndefined: Self = StObject.set(x, "impression_token", js.undefined)
    
    @scala.inline
    def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
    @scala.inline
    def setIs_in_profile_grid(value: Boolean): Self = StObject.set(x, "is_in_profile_grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_post_live(value: Boolean): Self = StObject.set(x, "is_post_live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_post_liveUndefined: Self = StObject.set(x, "is_post_live", js.undefined)
    
    @scala.inline
    def setIs_shop_the_look_eligible(value: Boolean): Self = StObject.set(x, "is_shop_the_look_eligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_countUndefined: Self = StObject.set(x, "like_count", js.undefined)
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngUndefined: Self = StObject.set(x, "lng", js.undefined)
    
    @scala.inline
    def setLocation(value: TopicalExploreFeedResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_cropping_info(value: TopicalExploreFeedResponseMediaCroppingInfo): Self = StObject.set(x, "media_cropping_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_cropping_infoUndefined: Self = StObject.set(x, "media_cropping_info", js.undefined)
    
    @scala.inline
    def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMezql_token(value: String): Self = StObject.set(x, "mezql_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearly_complete_copyright_match(value: Boolean): Self = StObject.set(x, "nearly_complete_copyright_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearly_complete_copyright_matchUndefined: Self = StObject.set(x, "nearly_complete_copyright_match", js.undefined)
    
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
    def setPreview_comments(value: js.Array[_]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview_commentsVarargs(value: js.Any*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setProduct_tags(value: TopicalExploreFeedResponseProductTags): Self = StObject.set(x, "product_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_tagsUndefined: Self = StObject.set(x, "product_tags", js.undefined)
    
    @scala.inline
    def setProduct_type(value: String): Self = StObject.set(x, "product_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_typeUndefined: Self = StObject.set(x, "product_type", js.undefined)
    
    @scala.inline
    def setProfile_grid_control_enabled(value: Boolean): Self = StObject.set(x, "profile_grid_control_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharing_friction_info(value: TopicalExploreFeedResponseSharingFrictionInfo): Self = StObject.set(x, "sharing_friction_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnails(value: TopicalExploreFeedResponseThumbnails): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTop_likers(value: js.Array[String]): Self = StObject.set(x, "top_likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_likersUndefined: Self = StObject.set(x, "top_likers", js.undefined)
    
    @scala.inline
    def setTop_likersVarargs(value: String*): Self = StObject.set(x, "top_likers", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: TopicalExploreFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags(value: TopicalExploreFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
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
    def setVideo_versions(value: js.Array[TopicalExploreFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    @scala.inline
    def setVideo_versionsVarargs(value: TopicalExploreFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
    @scala.inline
    def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_countUndefined: Self = StObject.set(x, "view_count", js.undefined)
  }
}
