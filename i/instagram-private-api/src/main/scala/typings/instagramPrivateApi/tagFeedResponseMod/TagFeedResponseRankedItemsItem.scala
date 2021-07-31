package typings.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagFeedResponseRankedItemsItem extends StObject {
  
  var can_view_more_preview_comments: js.UndefOr[Boolean] = js.undefined
  
  var can_viewer_reshare: Boolean
  
  var can_viewer_save: Boolean
  
  var caption: TagFeedResponseCaption
  
  var caption_is_edited: Boolean
  
  var client_cache_key: String
  
  var code: String
  
  var comment_count: js.UndefOr[Double] = js.undefined
  
  var comment_likes_enabled: js.UndefOr[Boolean] = js.undefined
  
  var comment_threading_enabled: js.UndefOr[Boolean] = js.undefined
  
  var comments_disabled: js.UndefOr[Boolean] = js.undefined
  
  var device_timestamp: String | Double
  
  var filter_type: Double
  
  var has_liked: Boolean
  
  var has_more_comments: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var image_versions2: TagFeedResponseImageVersions2
  
  var lat: js.UndefOr[Double | String] = js.undefined
  
  var like_count: Double
  
  var lng: js.UndefOr[Double | String] = js.undefined
  
  var location: js.UndefOr[TagFeedResponseLocation] = js.undefined
  
  var max_num_visible_preview_comments: js.UndefOr[Double] = js.undefined
  
  var media_type: Double
  
  var next_max_id: js.UndefOr[String] = js.undefined
  
  var organic_tracking_token: String
  
  var original_height: Double
  
  var original_width: Double
  
  var photo_of_you: Boolean
  
  var pk: String
  
  var preview_comments: js.UndefOr[js.Array[TagFeedResponsePreviewCommentsItem]] = js.undefined
  
  var taken_at: Double
  
  var user: TagFeedResponseUser
  
  var usertags: js.UndefOr[TagFeedResponseUsertags] = js.undefined
}
object TagFeedResponseRankedItemsItem {
  
  @scala.inline
  def apply(
    can_viewer_reshare: Boolean,
    can_viewer_save: Boolean,
    caption: TagFeedResponseCaption,
    caption_is_edited: Boolean,
    client_cache_key: String,
    code: String,
    device_timestamp: String | Double,
    filter_type: Double,
    has_liked: Boolean,
    id: String,
    image_versions2: TagFeedResponseImageVersions2,
    like_count: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    taken_at: Double,
    user: TagFeedResponseUser
  ): TagFeedResponseRankedItemsItem = {
    val __obj = js.Dynamic.literal(can_viewer_reshare = can_viewer_reshare.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponseRankedItemsItem]
  }
  
  @scala.inline
  implicit class TagFeedResponseRankedItemsItemMutableBuilder[Self <: TagFeedResponseRankedItemsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_view_more_preview_commentsUndefined: Self = StObject.set(x, "can_view_more_preview_comments", js.undefined)
    
    @scala.inline
    def setCan_viewer_reshare(value: Boolean): Self = StObject.set(x, "can_viewer_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: TagFeedResponseCaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
    
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
    def setComments_disabled(value: Boolean): Self = StObject.set(x, "comments_disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments_disabledUndefined: Self = StObject.set(x, "comments_disabled", js.undefined)
    
    @scala.inline
    def setDevice_timestamp(value: String | Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_commentsUndefined: Self = StObject.set(x, "has_more_comments", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TagFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLat(value: Double | String): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    @scala.inline
    def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
    
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
    def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
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
    def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: TagFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertags(value: TagFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
  }
}
