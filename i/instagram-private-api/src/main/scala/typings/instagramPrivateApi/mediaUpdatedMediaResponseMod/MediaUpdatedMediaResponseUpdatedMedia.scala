package typings.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaUpdatedMediaResponseUpdatedMedia extends js.Object {
  
  var can_reply: Boolean = js.native
  
  var can_reshare: Boolean = js.native
  
  var can_send_custom_emojis: Boolean = js.native
  
  var can_view_more_preview_comments: Boolean = js.native
  
  var can_viewer_save: Boolean = js.native
  
  var caption: MediaUpdatedMediaResponseCaption = js.native
  
  var caption_is_edited: Boolean = js.native
  
  var caption_position: Double = js.native
  
  var client_cache_key: String = js.native
  
  var code: String = js.native
  
  var comment_count: Double = js.native
  
  var comment_likes_enabled: Boolean = js.native
  
  var comment_threading_enabled: Boolean = js.native
  
  var creative_config: MediaUpdatedMediaResponseCreativeConfig = js.native
  
  var device_timestamp: Double = js.native
  
  var expiring_at: Double = js.native
  
  var filter_type: Double = js.native
  
  var has_liked: Boolean = js.native
  
  var has_more_comments: Boolean = js.native
  
  var has_shared_to_fb: Double = js.native
  
  var id: String = js.native
  
  var image_versions2: MediaUpdatedMediaResponseImageVersions2 = js.native
  
  var is_pride_media: Boolean = js.native
  
  var is_reel_media: Boolean = js.native
  
  var like_count: Double = js.native
  
  var likers: js.Array[_] = js.native
  
  var max_num_visible_preview_comments: Double = js.native
  
  var media_type: Double = js.native
  
  var organic_tracking_token: String = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var photo_of_you: Boolean = js.native
  
  var pk: String = js.native
  
  var preview_comments: js.Array[_] = js.native
  
  var show_one_tap_fb_share_tooltip: Boolean = js.native
  
  var story_polls: js.Array[MediaUpdatedMediaResponseStoryPollsItem] = js.native
  
  var supports_reel_reactions: Boolean = js.native
  
  var taken_at: Double = js.native
  
  var user: MediaUpdatedMediaResponseUser = js.native
}
object MediaUpdatedMediaResponseUpdatedMedia {
  
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    can_send_custom_emojis: Boolean,
    can_view_more_preview_comments: Boolean,
    can_viewer_save: Boolean,
    caption: MediaUpdatedMediaResponseCaption,
    caption_is_edited: Boolean,
    caption_position: Double,
    client_cache_key: String,
    code: String,
    comment_count: Double,
    comment_likes_enabled: Boolean,
    comment_threading_enabled: Boolean,
    creative_config: MediaUpdatedMediaResponseCreativeConfig,
    device_timestamp: Double,
    expiring_at: Double,
    filter_type: Double,
    has_liked: Boolean,
    has_more_comments: Boolean,
    has_shared_to_fb: Double,
    id: String,
    image_versions2: MediaUpdatedMediaResponseImageVersions2,
    is_pride_media: Boolean,
    is_reel_media: Boolean,
    like_count: Double,
    likers: js.Array[_],
    max_num_visible_preview_comments: Double,
    media_type: Double,
    organic_tracking_token: String,
    original_height: Double,
    original_width: Double,
    photo_of_you: Boolean,
    pk: String,
    preview_comments: js.Array[_],
    show_one_tap_fb_share_tooltip: Boolean,
    story_polls: js.Array[MediaUpdatedMediaResponseStoryPollsItem],
    supports_reel_reactions: Boolean,
    taken_at: Double,
    user: MediaUpdatedMediaResponseUser
  ): MediaUpdatedMediaResponseUpdatedMedia = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], can_send_custom_emojis = can_send_custom_emojis.asInstanceOf[js.Any], can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], creative_config = creative_config.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], has_shared_to_fb = has_shared_to_fb.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_pride_media = is_pride_media.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], show_one_tap_fb_share_tooltip = show_one_tap_fb_share_tooltip.asInstanceOf[js.Any], story_polls = story_polls.asInstanceOf[js.Any], supports_reel_reactions = supports_reel_reactions.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseUpdatedMedia]
  }
  
  @scala.inline
  implicit class MediaUpdatedMediaResponseUpdatedMediaOps[Self <: MediaUpdatedMediaResponseUpdatedMedia] (val x: Self) extends AnyVal {
    
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
    def setCan_reply(value: Boolean): Self = this.set("can_reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_reshare(value: Boolean): Self = this.set("can_reshare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_send_custom_emojis(value: Boolean): Self = this.set("can_send_custom_emojis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_view_more_preview_comments(value: Boolean): Self = this.set("can_view_more_preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_viewer_save(value: Boolean): Self = this.set("can_viewer_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: MediaUpdatedMediaResponseCaption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_is_edited(value: Boolean): Self = this.set("caption_is_edited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_position(value: Double): Self = this.set("caption_position", value.asInstanceOf[js.Any])
    
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
    def setCreative_config(value: MediaUpdatedMediaResponseCreativeConfig): Self = this.set("creative_config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_timestamp(value: Double): Self = this.set("device_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiring_at(value: Double): Self = this.set("expiring_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter_type(value: Double): Self = this.set("filter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_liked(value: Boolean): Self = this.set("has_liked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_more_comments(value: Boolean): Self = this.set("has_more_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_shared_to_fb(value: Double): Self = this.set("has_shared_to_fb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: MediaUpdatedMediaResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_pride_media(value: Boolean): Self = this.set("is_pride_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_reel_media(value: Boolean): Self = this.set("is_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_count(value: Double): Self = this.set("like_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikersVarargs(value: js.Any*): Self = this.set("likers", js.Array(value :_*))
    
    @scala.inline
    def setLikers(value: js.Array[_]): Self = this.set("likers", value.asInstanceOf[js.Any])
    
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
    def setPreview_commentsVarargs(value: js.Any*): Self = this.set("preview_comments", js.Array(value :_*))
    
    @scala.inline
    def setPreview_comments(value: js.Array[_]): Self = this.set("preview_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_one_tap_fb_share_tooltip(value: Boolean): Self = this.set("show_one_tap_fb_share_tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory_pollsVarargs(value: MediaUpdatedMediaResponseStoryPollsItem*): Self = this.set("story_polls", js.Array(value :_*))
    
    @scala.inline
    def setStory_polls(value: js.Array[MediaUpdatedMediaResponseStoryPollsItem]): Self = this.set("story_polls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports_reel_reactions(value: Boolean): Self = this.set("supports_reel_reactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaken_at(value: Double): Self = this.set("taken_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: MediaUpdatedMediaResponseUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
