package typings.instagramPrivateApi.locationFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationFeedResponseMedia extends StObject {
  
  var can_see_insights_as_brand: js.UndefOr[Boolean] = js.undefined
  
  var can_view_more_preview_comments: Boolean
  
  var can_viewer_reshare: Boolean
  
  var can_viewer_save: Boolean
  
  var caption: LocationFeedResponseCaption | Null
  
  var caption_is_edited: Boolean
  
  var carousel_media: js.UndefOr[js.Array[LocationFeedResponseCarouselMediaItem]] = js.undefined
  
  var carousel_media_count: js.UndefOr[Double] = js.undefined
  
  var client_cache_key: String
  
  var code: String
  
  var comment_count: Double
  
  var comment_likes_enabled: Boolean
  
  var comment_threading_enabled: Boolean
  
  var commenting_disabled_for_viewer: js.UndefOr[Boolean] = js.undefined
  
  var device_timestamp: String | Double
  
  var filter_type: Double
  
  var has_audio: js.UndefOr[Boolean] = js.undefined
  
  var has_liked: Boolean
  
  var has_more_comments: Boolean
  
  var id: String
  
  var image_versions2: js.UndefOr[LocationFeedResponseImageVersions2] = js.undefined
  
  var is_dash_eligible: js.UndefOr[Double] = js.undefined
  
  var lat: String
  
  var like_count: Double
  
  var lng: String
  
  var location: LocationFeedResponseLocation
  
  var max_num_visible_preview_comments: Double
  
  var media_type: Double
  
  var next_max_id: String
  
  var number_of_qualities: js.UndefOr[Double] = js.undefined
  
  var organic_tracking_token: String
  
  var original_height: js.UndefOr[Double] = js.undefined
  
  var original_width: js.UndefOr[Double] = js.undefined
  
  var photo_of_you: Boolean
  
  var pk: String
  
  var preview_comments: js.Array[LocationFeedResponsePreviewCommentsItem]
  
  var taken_at: Double
  
  var top_likers: js.Array[js.Any]
  
  var user: LocationFeedResponseUser
  
  var usertags: js.UndefOr[LocationFeedResponseUsertags] = js.undefined
  
  var video_codec: js.UndefOr[String] = js.undefined
  
  var video_dash_manifest: js.UndefOr[String] = js.undefined
  
  var video_duration: js.UndefOr[Double] = js.undefined
  
  var video_versions: js.UndefOr[js.Array[LocationFeedResponseVideoVersionsItem]] = js.undefined
  
  var view_count: js.UndefOr[Double] = js.undefined
}
object LocationFeedResponseMedia {
  
  inline def apply(
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
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    id: String,
    lat: String,
    like_count: Double,
    lng: String,
    location: LocationFeedResponseLocation,
    max_num_visible_preview_comments: Double,
    media_type: Double,
    next_max_id: String,
    organic_tracking_token: String,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[LocationFeedResponsePreviewCommentsItem],
    taken_at: Double,
    top_likers: js.Array[js.Any],
    user: LocationFeedResponseUser
  ): LocationFeedResponseMedia = {
    val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], top_likers = top_likers.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], caption = null)
    __obj.asInstanceOf[LocationFeedResponseMedia]
  }
  
  extension [Self <: LocationFeedResponseMedia](x: Self) {
    
    inline def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    inline def setCan_see_insights_as_brandUndefined: Self = StObject.set(x, "can_see_insights_as_brand", js.undefined)
    
    inline def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    inline def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    inline def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: LocationFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    inline def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
    inline def setCarousel_media(value: js.Array[LocationFeedResponseCarouselMediaItem]): Self = StObject.set(x, "carousel_media", value.asInstanceOf[js.Any])
    
    inline def setCarousel_mediaUndefined: Self = StObject.set(x, "carousel_media", js.undefined)
    
    inline def setCarousel_mediaVarargs(value: LocationFeedResponseCarouselMediaItem*): Self = StObject.set(x, "carousel_media", js.Array(value :_*))
    
    inline def setCarousel_media_count(value: Double): Self = StObject.set(x, "carousel_media_count", value.asInstanceOf[js.Any])
    
    inline def setCarousel_media_countUndefined: Self = StObject.set(x, "carousel_media_count", js.undefined)
    
    inline def setClient_cache_key(value: String): Self = StObject.set(x, "client_cache_key", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setComment_likes_enabled(value: Boolean): Self = StObject.set(x, "comment_likes_enabled", value.asInstanceOf[js.Any])
    
    inline def setComment_threading_enabled(value: Boolean): Self = StObject.set(x, "comment_threading_enabled", value.asInstanceOf[js.Any])
    
    inline def setCommenting_disabled_for_viewer(value: Boolean): Self = StObject.set(x, "commenting_disabled_for_viewer", value.asInstanceOf[js.Any])
    
    inline def setCommenting_disabled_for_viewerUndefined: Self = StObject.set(x, "commenting_disabled_for_viewer", js.undefined)
    
    inline def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    inline def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    inline def setHas_audio(value: Boolean): Self = StObject.set(x, "has_audio", value.asInstanceOf[js.Any])
    
    inline def setHas_audioUndefined: Self = StObject.set(x, "has_audio", js.undefined)
    
    inline def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
    
    inline def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_versions2(value: LocationFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    inline def setImage_versions2Undefined: Self = StObject.set(x, "image_versions2", js.undefined)
    
    inline def setIs_dash_eligible(value: Double): Self = StObject.set(x, "is_dash_eligible", value.asInstanceOf[js.Any])
    
    inline def setIs_dash_eligibleUndefined: Self = StObject.set(x, "is_dash_eligible", js.undefined)
    
    inline def setLat(value: String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
    inline def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationFeedResponseLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
    
    inline def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_qualities(value: Double): Self = StObject.set(x, "number_of_qualities", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_qualitiesUndefined: Self = StObject.set(x, "number_of_qualities", js.undefined)
    
    inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    inline def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    inline def setOriginal_heightUndefined: Self = StObject.set(x, "original_height", js.undefined)
    
    inline def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    inline def setOriginal_widthUndefined: Self = StObject.set(x, "original_width", js.undefined)
    
    inline def setPhoto_of_you(value: Boolean): Self = StObject.set(x, "photo_of_you", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setPreview_comments(value: js.Array[LocationFeedResponsePreviewCommentsItem]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
    
    inline def setPreview_commentsVarargs(value: LocationFeedResponsePreviewCommentsItem*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
    
    inline def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    inline def setTop_likers(value: js.Array[js.Any]): Self = StObject.set(x, "top_likers", value.asInstanceOf[js.Any])
    
    inline def setTop_likersVarargs(value: js.Any*): Self = StObject.set(x, "top_likers", js.Array(value :_*))
    
    inline def setUser(value: LocationFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUsertags(value: LocationFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    inline def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
    
    inline def setVideo_codec(value: String): Self = StObject.set(x, "video_codec", value.asInstanceOf[js.Any])
    
    inline def setVideo_codecUndefined: Self = StObject.set(x, "video_codec", js.undefined)
    
    inline def setVideo_dash_manifest(value: String): Self = StObject.set(x, "video_dash_manifest", value.asInstanceOf[js.Any])
    
    inline def setVideo_dash_manifestUndefined: Self = StObject.set(x, "video_dash_manifest", js.undefined)
    
    inline def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    inline def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
    
    inline def setVideo_versions(value: js.Array[LocationFeedResponseVideoVersionsItem]): Self = StObject.set(x, "video_versions", value.asInstanceOf[js.Any])
    
    inline def setVideo_versionsUndefined: Self = StObject.set(x, "video_versions", js.undefined)
    
    inline def setVideo_versionsVarargs(value: LocationFeedResponseVideoVersionsItem*): Self = StObject.set(x, "video_versions", js.Array(value :_*))
    
    inline def setView_count(value: Double): Self = StObject.set(x, "view_count", value.asInstanceOf[js.Any])
    
    inline def setView_countUndefined: Self = StObject.set(x, "view_count", js.undefined)
  }
}
