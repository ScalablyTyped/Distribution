package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadRepositoryApproveParticipantRequestResponseMod {
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem extends StObject {
    
    var estimated_scans_sizes: js.Array[Double] = js.native
    
    var height: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem {
    
    @scala.inline
    def apply(estimated_scans_sizes: js.Array[Double], height: Double, url: String, width: Double): DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem = {
      val __obj = js.Dynamic.literal(estimated_scans_sizes = estimated_scans_sizes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItemMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEstimated_scans_sizes(value: js.Array[Double]): Self = StObject.set(x, "estimated_scans_sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEstimated_scans_sizesVarargs(value: Double*): Self = StObject.set(x, "estimated_scans_sizes", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags extends StObject {
    
    var in: js.Array[_] = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags {
    
    @scala.inline
    def apply(in: js.Array[_]): DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseFbUserTagsMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[_]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: js.Any*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean = js.native
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus {
    
    @scala.inline
    def apply(
      blocking: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      outgoing_request: Boolean
    ): DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatusMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2 extends StObject {
    
    var candidates: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem] = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2 {
    
    @scala.inline
    def apply(candidates: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem]): DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2 = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2MutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidates(value: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem]): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCandidatesVarargs(value: DirectThreadRepositoryApproveParticipantRequestResponseCandidatesItem*): Self = StObject.set(x, "candidates", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseInviter extends StObject {
    
    var allowed_commenter_type: String = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var reel_auto_archive: String = js.native
    
    var username: String = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseInviter {
    
    @scala.inline
    def apply(
      allowed_commenter_type: String,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      username: String
    ): DirectThreadRepositoryApproveParticipantRequestResponseInviter = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseInviter]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseInviterMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseInviter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseItemsItem extends StObject {
    
    var item_id: String = js.native
    
    var item_type: String = js.native
    
    var story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare = js.native
    
    var timestamp: String = js.native
    
    var user_id: Double = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseItemsItem {
    
    @scala.inline
    def apply(
      item_id: String,
      item_type: String,
      story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare,
      timestamp: String,
      user_id: Double
    ): DirectThreadRepositoryApproveParticipantRequestResponseItemsItem = {
      val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], story_share = story_share.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseItemsItemMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_share(value: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare): Self = StObject.set(x, "story_share", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem extends StObject {
    
    var item_id: String = js.native
    
    var item_type: String = js.native
    
    var story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare = js.native
    
    var timestamp: String = js.native
    
    var user_id: Double = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem {
    
    @scala.inline
    def apply(
      item_id: String,
      item_type: String,
      story_share: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare,
      timestamp: String,
      user_id: Double
    ): DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem = {
      val __obj = js.Dynamic.literal(item_id = item_id.asInstanceOf[js.Any], item_type = item_type.asInstanceOf[js.Any], story_share = story_share.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItemMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_type(value: String): Self = StObject.set(x, "item_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_share(value: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare): Self = StObject.set(x, "story_share", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt extends StObject
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseMedia extends StObject {
    
    var can_view_more_preview_comments: Boolean = js.native
    
    var can_viewer_save: Boolean = js.native
    
    var caption: Null = js.native
    
    var caption_is_edited: Boolean = js.native
    
    var caption_position: Double = js.native
    
    var client_cache_key: String = js.native
    
    var code: String = js.native
    
    var comment_count: Double = js.native
    
    var comment_likes_enabled: Boolean = js.native
    
    var comment_threading_enabled: Boolean = js.native
    
    var device_timestamp: Double = js.native
    
    var expiring_at: Double = js.native
    
    var fb_user_tags: DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags = js.native
    
    var filter_type: Double = js.native
    
    var has_liked: Boolean = js.native
    
    var has_more_comments: Boolean = js.native
    
    var id: String = js.native
    
    var image_versions2: DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2 = js.native
    
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
    
    var taken_at: Double = js.native
    
    var timezone_offset: Double = js.native
    
    var user: DirectThreadRepositoryApproveParticipantRequestResponseUser = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseMedia {
    
    @scala.inline
    def apply(
      can_view_more_preview_comments: Boolean,
      can_viewer_save: Boolean,
      caption: Null,
      caption_is_edited: Boolean,
      caption_position: Double,
      client_cache_key: String,
      code: String,
      comment_count: Double,
      comment_likes_enabled: Boolean,
      comment_threading_enabled: Boolean,
      device_timestamp: Double,
      expiring_at: Double,
      fb_user_tags: DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags,
      filter_type: Double,
      has_liked: Boolean,
      has_more_comments: Boolean,
      id: String,
      image_versions2: DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2,
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
      taken_at: Double,
      timezone_offset: Double,
      user: DirectThreadRepositoryApproveParticipantRequestResponseUser
    ): DirectThreadRepositoryApproveParticipantRequestResponseMedia = {
      val __obj = js.Dynamic.literal(can_view_more_preview_comments = can_view_more_preview_comments.asInstanceOf[js.Any], can_viewer_save = can_viewer_save.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], caption_is_edited = caption_is_edited.asInstanceOf[js.Any], caption_position = caption_position.asInstanceOf[js.Any], client_cache_key = client_cache_key.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], comment_likes_enabled = comment_likes_enabled.asInstanceOf[js.Any], comment_threading_enabled = comment_threading_enabled.asInstanceOf[js.Any], device_timestamp = device_timestamp.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], filter_type = filter_type.asInstanceOf[js.Any], has_liked = has_liked.asInstanceOf[js.Any], has_more_comments = has_more_comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], is_reel_media = is_reel_media.asInstanceOf[js.Any], like_count = like_count.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], max_num_visible_preview_comments = max_num_visible_preview_comments.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], photo_of_you = photo_of_you.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], preview_comments = preview_comments.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], timezone_offset = timezone_offset.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseMedia]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseMediaMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseMedia] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCan_view_more_preview_comments(value: Boolean): Self = StObject.set(x, "can_view_more_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_viewer_save(value: Boolean): Self = StObject.set(x, "can_viewer_save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: Null): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_is_edited(value: Boolean): Self = StObject.set(x, "caption_is_edited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption_position(value: Double): Self = StObject.set(x, "caption_position", value.asInstanceOf[js.Any])
      
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
      def setDevice_timestamp(value: Double): Self = StObject.set(x, "device_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiring_at(value: Double): Self = StObject.set(x, "expiring_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFb_user_tags(value: DirectThreadRepositoryApproveParticipantRequestResponseFbUserTags): Self = StObject.set(x, "fb_user_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_type(value: Double): Self = StObject.set(x, "filter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_liked(value: Boolean): Self = StObject.set(x, "has_liked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_more_comments(value: Boolean): Self = StObject.set(x, "has_more_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage_versions2(value: DirectThreadRepositoryApproveParticipantRequestResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_reel_media(value: Boolean): Self = StObject.set(x, "is_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLike_count(value: Double): Self = StObject.set(x, "like_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikers(value: js.Array[_]): Self = StObject.set(x, "likers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikersVarargs(value: js.Any*): Self = StObject.set(x, "likers", js.Array(value :_*))
      
      @scala.inline
      def setMax_num_visible_preview_comments(value: Double): Self = StObject.set(x, "max_num_visible_preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
      
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
      def setPreview_comments(value: js.Array[_]): Self = StObject.set(x, "preview_comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview_commentsVarargs(value: js.Any*): Self = StObject.set(x, "preview_comments", js.Array(value :_*))
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezone_offset(value: Double): Self = StObject.set(x, "timezone_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: DirectThreadRepositoryApproveParticipantRequestResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var thread: DirectThreadRepositoryApproveParticipantRequestResponseThread = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseRootObject {
    
    @scala.inline
    def apply(status: String, thread: DirectThreadRepositoryApproveParticipantRequestResponseThread): DirectThreadRepositoryApproveParticipantRequestResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseRootObject]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseRootObjectMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread(value: DirectThreadRepositoryApproveParticipantRequestResponseThread): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseStoryShare extends StObject {
    
    var is_reel_persisted: Boolean = js.native
    
    var media: DirectThreadRepositoryApproveParticipantRequestResponseMedia = js.native
    
    var reel_id: Double = js.native
    
    var reel_type: String = js.native
    
    var story_share_type: String = js.native
    
    var text: Null = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseStoryShare {
    
    @scala.inline
    def apply(
      is_reel_persisted: Boolean,
      media: DirectThreadRepositoryApproveParticipantRequestResponseMedia,
      reel_id: Double,
      reel_type: String,
      story_share_type: String,
      text: Null
    ): DirectThreadRepositoryApproveParticipantRequestResponseStoryShare = {
      val __obj = js.Dynamic.literal(is_reel_persisted = is_reel_persisted.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], reel_id = reel_id.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], story_share_type = story_share_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseStoryShare]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseStoryShareMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseStoryShare] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIs_reel_persisted(value: Boolean): Self = StObject.set(x, "is_reel_persisted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia(value: DirectThreadRepositoryApproveParticipantRequestResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_id(value: Double): Self = StObject.set(x, "reel_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_type(value: String): Self = StObject.set(x, "reel_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_share_type(value: String): Self = StObject.set(x, "story_share_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: Null): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseThread extends StObject {
    
    var admin_user_ids: js.Array[Double] = js.native
    
    var approval_required_for_new_members: Boolean = js.native
    
    var archived: Boolean = js.native
    
    var business_thread_folder: Double = js.native
    
    var canonical: Boolean = js.native
    
    var folder: Double = js.native
    
    var has_newer: Boolean = js.native
    
    var has_older: Boolean = js.native
    
    var input_mode: Double = js.native
    
    var inviter: DirectThreadRepositoryApproveParticipantRequestResponseInviter = js.native
    
    var is_group: Boolean = js.native
    
    var is_pin: Boolean = js.native
    
    var items: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem] = js.native
    
    var last_activity_at: String = js.native
    
    var last_permanent_item: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem = js.native
    
    var last_seen_at: DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt = js.native
    
    var left_users: js.Array[_] = js.native
    
    var mentions_muted: Boolean = js.native
    
    var muted: Boolean = js.native
    
    var named: Boolean = js.native
    
    var newest_cursor: String = js.native
    
    var next_cursor: String = js.native
    
    var oldest_cursor: String = js.native
    
    var pending: Boolean = js.native
    
    var pending_score: String = js.native
    
    var prev_cursor: String = js.native
    
    var read_state: Double = js.native
    
    var thread_id: String = js.native
    
    var thread_title: String = js.native
    
    var thread_type: String = js.native
    
    var thread_v2_id: String = js.native
    
    var users: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem] = js.native
    
    var valued_request: Boolean = js.native
    
    var vc_muted: Boolean = js.native
    
    var viewer_id: Double = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseThread {
    
    @scala.inline
    def apply(
      admin_user_ids: js.Array[Double],
      approval_required_for_new_members: Boolean,
      archived: Boolean,
      business_thread_folder: Double,
      canonical: Boolean,
      folder: Double,
      has_newer: Boolean,
      has_older: Boolean,
      input_mode: Double,
      inviter: DirectThreadRepositoryApproveParticipantRequestResponseInviter,
      is_group: Boolean,
      is_pin: Boolean,
      items: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem],
      last_activity_at: String,
      last_permanent_item: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem,
      last_seen_at: DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt,
      left_users: js.Array[_],
      mentions_muted: Boolean,
      muted: Boolean,
      named: Boolean,
      newest_cursor: String,
      next_cursor: String,
      oldest_cursor: String,
      pending: Boolean,
      pending_score: String,
      prev_cursor: String,
      read_state: Double,
      thread_id: String,
      thread_title: String,
      thread_type: String,
      thread_v2_id: String,
      users: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem],
      valued_request: Boolean,
      vc_muted: Boolean,
      viewer_id: Double
    ): DirectThreadRepositoryApproveParticipantRequestResponseThread = {
      val __obj = js.Dynamic.literal(admin_user_ids = admin_user_ids.asInstanceOf[js.Any], approval_required_for_new_members = approval_required_for_new_members.asInstanceOf[js.Any], archived = archived.asInstanceOf[js.Any], business_thread_folder = business_thread_folder.asInstanceOf[js.Any], canonical = canonical.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], has_newer = has_newer.asInstanceOf[js.Any], has_older = has_older.asInstanceOf[js.Any], input_mode = input_mode.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], is_group = is_group.asInstanceOf[js.Any], is_pin = is_pin.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_activity_at = last_activity_at.asInstanceOf[js.Any], last_permanent_item = last_permanent_item.asInstanceOf[js.Any], last_seen_at = last_seen_at.asInstanceOf[js.Any], left_users = left_users.asInstanceOf[js.Any], mentions_muted = mentions_muted.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], newest_cursor = newest_cursor.asInstanceOf[js.Any], next_cursor = next_cursor.asInstanceOf[js.Any], oldest_cursor = oldest_cursor.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pending_score = pending_score.asInstanceOf[js.Any], prev_cursor = prev_cursor.asInstanceOf[js.Any], read_state = read_state.asInstanceOf[js.Any], thread_id = thread_id.asInstanceOf[js.Any], thread_title = thread_title.asInstanceOf[js.Any], thread_type = thread_type.asInstanceOf[js.Any], thread_v2_id = thread_v2_id.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], valued_request = valued_request.asInstanceOf[js.Any], vc_muted = vc_muted.asInstanceOf[js.Any], viewer_id = viewer_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseThread]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseThreadMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseThread] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdmin_user_ids(value: js.Array[Double]): Self = StObject.set(x, "admin_user_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdmin_user_idsVarargs(value: Double*): Self = StObject.set(x, "admin_user_ids", js.Array(value :_*))
      
      @scala.inline
      def setApproval_required_for_new_members(value: Boolean): Self = StObject.set(x, "approval_required_for_new_members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBusiness_thread_folder(value: Double): Self = StObject.set(x, "business_thread_folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolder(value: Double): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_newer(value: Boolean): Self = StObject.set(x, "has_newer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_older(value: Boolean): Self = StObject.set(x, "has_older", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_mode(value: Double): Self = StObject.set(x, "input_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInviter(value: DirectThreadRepositoryApproveParticipantRequestResponseInviter): Self = StObject.set(x, "inviter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_group(value: Boolean): Self = StObject.set(x, "is_group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_pin(value: Boolean): Self = StObject.set(x, "is_pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: DirectThreadRepositoryApproveParticipantRequestResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLast_activity_at(value: String): Self = StObject.set(x, "last_activity_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_permanent_item(value: DirectThreadRepositoryApproveParticipantRequestResponseLastPermanentItem): Self = StObject.set(x, "last_permanent_item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_seen_at(value: DirectThreadRepositoryApproveParticipantRequestResponseLastSeenAt): Self = StObject.set(x, "last_seen_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_users(value: js.Array[_]): Self = StObject.set(x, "left_users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft_usersVarargs(value: js.Any*): Self = StObject.set(x, "left_users", js.Array(value :_*))
      
      @scala.inline
      def setMentions_muted(value: Boolean): Self = StObject.set(x, "mentions_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamed(value: Boolean): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewest_cursor(value: String): Self = StObject.set(x, "newest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext_cursor(value: String): Self = StObject.set(x, "next_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldest_cursor(value: String): Self = StObject.set(x, "oldest_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPending_score(value: String): Self = StObject.set(x, "pending_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev_cursor(value: String): Self = StObject.set(x, "prev_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead_state(value: Double): Self = StObject.set(x, "read_state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_id(value: String): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_title(value: String): Self = StObject.set(x, "thread_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_type(value: String): Self = StObject.set(x, "thread_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_v2_id(value: String): Self = StObject.set(x, "thread_v2_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: DirectThreadRepositoryApproveParticipantRequestResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      @scala.inline
      def setValued_request(value: Boolean): Self = StObject.set(x, "valued_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVc_muted(value: Boolean): Self = StObject.set(x, "vc_muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_id(value: Double): Self = StObject.set(x, "viewer_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseUser extends StObject {
    
    var allowed_commenter_type: String = js.native
    
    var can_boost_post: Boolean = js.native
    
    var can_see_organic_insights: Boolean = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_unpublished: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var reel_auto_archive: String = js.native
    
    var show_insights_terms: Boolean = js.native
    
    var username: String = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseUser {
    
    @scala.inline
    def apply(
      allowed_commenter_type: String,
      can_boost_post: Boolean,
      can_see_organic_insights: Boolean,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_unpublished: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      reel_auto_archive: String,
      show_insights_terms: Boolean,
      username: String
    ): DirectThreadRepositoryApproveParticipantRequestResponseUser = {
      val __obj = js.Dynamic.literal(allowed_commenter_type = allowed_commenter_type.asInstanceOf[js.Any], can_boost_post = can_boost_post.asInstanceOf[js.Any], can_see_organic_insights = can_see_organic_insights.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], reel_auto_archive = reel_auto_archive.asInstanceOf[js.Any], show_insights_terms = show_insights_terms.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseUser]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseUserMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed_commenter_type(value: String): Self = StObject.set(x, "allowed_commenter_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_boost_post(value: Boolean): Self = StObject.set(x, "can_boost_post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCan_see_organic_insights(value: Boolean): Self = StObject.set(x, "can_see_organic_insights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReel_auto_archive(value: String): Self = StObject.set(x, "reel_auto_archive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_insights_terms(value: Boolean): Self = StObject.set(x, "show_insights_terms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectThreadRepositoryApproveParticipantRequestResponseUsersItem extends StObject {
    
    var friendship_status: DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var has_anonymous_profile_picture: Boolean = js.native
    
    var is_directapp_installed: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_using_unified_inbox_for_direct: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object DirectThreadRepositoryApproveParticipantRequestResponseUsersItem {
    
    @scala.inline
    def apply(
      friendship_status: DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_directapp_installed: Boolean,
      is_private: Boolean,
      is_using_unified_inbox_for_direct: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): DirectThreadRepositoryApproveParticipantRequestResponseUsersItem = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_directapp_installed = is_directapp_installed.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_using_unified_inbox_for_direct = is_using_unified_inbox_for_direct.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectThreadRepositoryApproveParticipantRequestResponseUsersItem]
    }
    
    @scala.inline
    implicit class DirectThreadRepositoryApproveParticipantRequestResponseUsersItemMutableBuilder[Self <: DirectThreadRepositoryApproveParticipantRequestResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: DirectThreadRepositoryApproveParticipantRequestResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_directapp_installed(value: Boolean): Self = StObject.set(x, "is_directapp_installed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_using_unified_inbox_for_direct(value: Boolean): Self = StObject.set(x, "is_using_unified_inbox_for_direct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
