package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`0`
import typings.instagramPrivateApi.instagramPrivateApiNumbers.`1`
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_hashtag
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_location
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_newsfeed_multi_media_liked
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_post
import typings.instagramPrivateApi.instagramPrivateApiStrings.feed_timeline
import typings.instagramPrivateApi.instagramPrivateApiStrings.like
import typings.instagramPrivateApi.instagramPrivateApiStrings.media_view_profile
import typings.instagramPrivateApi.instagramPrivateApiStrings.newsfeed
import typings.instagramPrivateApi.instagramPrivateApiStrings.photo_view_profile
import typings.instagramPrivateApi.instagramPrivateApiStrings.profile
import typings.instagramPrivateApi.instagramPrivateApiStrings.unlike
import typings.instagramPrivateApi.instagramPrivateApiStrings.video_view_profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaLikeOptionsMod {
  
  trait BaseProfile extends StObject {
    
    var user_id: String | Double
    
    var username: String
  }
  object BaseProfile {
    
    @scala.inline
    def apply(user_id: String | Double, username: String): BaseProfile = {
      val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProfile]
    }
    
    @scala.inline
    implicit class BaseProfileMutableBuilder[Self <: BaseProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser_id(value: String | Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedContextualHashtag extends StObject {
    
    var hashtag: String
    
    var module_name: feed_contextual_hashtag
  }
  object FeedContextualHashtag {
    
    @scala.inline
    def apply(hashtag: String): FeedContextualHashtag = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], module_name = "feed_contextual_hashtag")
      __obj.asInstanceOf[FeedContextualHashtag]
    }
    
    @scala.inline
    implicit class FeedContextualHashtagMutableBuilder[Self <: FeedContextualHashtag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule_name(value: feed_contextual_hashtag): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedContextualLocation extends StObject {
    
    var location_id: String | Double
    
    var module_name: feed_contextual_location
  }
  object FeedContextualLocation {
    
    @scala.inline
    def apply(location_id: String | Double): FeedContextualLocation = {
      val __obj = js.Dynamic.literal(location_id = location_id.asInstanceOf[js.Any], module_name = "feed_contextual_location")
      __obj.asInstanceOf[FeedContextualLocation]
    }
    
    @scala.inline
    implicit class FeedContextualLocationMutableBuilder[Self <: FeedContextualLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation_id(value: String | Double): Self = StObject.set(x, "location_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule_name(value: feed_contextual_location): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeedTimeline extends StObject {
    
    var module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
  }
  object FeedTimeline {
    
    @scala.inline
    def apply(
      module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
    ): FeedTimeline = {
      val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedTimeline]
    }
    
    @scala.inline
    implicit class FeedTimelineMutableBuilder[Self <: FeedTimeline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(
        value: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked
      ): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  type LikeModuleInfoOption = (FeedTimeline | FeedContextualHashtag | FeedContextualLocation | Profile | MediaViewProfile | VideoViewProfile | PhotoViewProfile) & StringDictionary[js.Any]
  
  trait LikeOrUnlikeBaseOptions extends StObject {
    
    var mediaId: String
    
    var moduleInfo: LikeModuleInfoOption
  }
  object LikeOrUnlikeBaseOptions {
    
    @scala.inline
    def apply(mediaId: String, moduleInfo: LikeModuleInfoOption): LikeOrUnlikeBaseOptions = {
      val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[LikeOrUnlikeBaseOptions]
    }
    
    @scala.inline
    implicit class LikeOrUnlikeBaseOptionsMutableBuilder[Self <: LikeOrUnlikeBaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleInfo(value: LikeModuleInfoOption): Self = StObject.set(x, "moduleInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait LikeRequestOptions
    extends StObject
       with LikeOrUnlikeBaseOptions {
    
    var d: `1` | `0`
  }
  object LikeRequestOptions {
    
    @scala.inline
    def apply(d: `1` | `0`, mediaId: String, moduleInfo: LikeModuleInfoOption): LikeRequestOptions = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[LikeRequestOptions]
    }
    
    @scala.inline
    implicit class LikeRequestOptionsMutableBuilder[Self <: LikeRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: `1` | `0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  trait MediaLikeOrUnlikeOptions
    extends StObject
       with LikeOrUnlikeBaseOptions {
    
    var action: like | unlike
    
    var d: js.UndefOr[`1` | `0`] = js.undefined
  }
  object MediaLikeOrUnlikeOptions {
    
    @scala.inline
    def apply(action: like | unlike, mediaId: String, moduleInfo: LikeModuleInfoOption): MediaLikeOrUnlikeOptions = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaLikeOrUnlikeOptions]
    }
    
    @scala.inline
    implicit class MediaLikeOrUnlikeOptionsMutableBuilder[Self <: MediaLikeOrUnlikeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: like | unlike): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setD(value: `1` | `0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    }
  }
  
  trait MediaViewProfile
    extends StObject
       with BaseProfile {
    
    var module_name: media_view_profile
  }
  object MediaViewProfile {
    
    @scala.inline
    def apply(user_id: String | Double, username: String): MediaViewProfile = {
      val __obj = js.Dynamic.literal(module_name = "media_view_profile", user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaViewProfile]
    }
    
    @scala.inline
    implicit class MediaViewProfileMutableBuilder[Self <: MediaViewProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: media_view_profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhotoViewProfile
    extends StObject
       with BaseProfile {
    
    var module_name: photo_view_profile
  }
  object PhotoViewProfile {
    
    @scala.inline
    def apply(user_id: String | Double, username: String): PhotoViewProfile = {
      val __obj = js.Dynamic.literal(module_name = "photo_view_profile", user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoViewProfile]
    }
    
    @scala.inline
    implicit class PhotoViewProfileMutableBuilder[Self <: PhotoViewProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: photo_view_profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Profile
    extends StObject
       with BaseProfile {
    
    var module_name: profile
  }
  object Profile {
    
    @scala.inline
    def apply(user_id: String | Double, username: String): Profile = {
      val __obj = js.Dynamic.literal(module_name = "profile", user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnlikeRequestOptions
    extends StObject
       with LikeOrUnlikeBaseOptions {
    
    var d: js.UndefOr[`0`] = js.undefined
  }
  object UnlikeRequestOptions {
    
    @scala.inline
    def apply(mediaId: String, moduleInfo: LikeModuleInfoOption): UnlikeRequestOptions = {
      val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any], moduleInfo = moduleInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnlikeRequestOptions]
    }
    
    @scala.inline
    implicit class UnlikeRequestOptionsMutableBuilder[Self <: UnlikeRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: `0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    }
  }
  
  trait VideoViewProfile
    extends StObject
       with BaseProfile {
    
    var module_name: video_view_profile
  }
  object VideoViewProfile {
    
    @scala.inline
    def apply(user_id: String | Double, username: String): VideoViewProfile = {
      val __obj = js.Dynamic.literal(module_name = "video_view_profile", user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoViewProfile]
    }
    
    @scala.inline
    implicit class VideoViewProfileMutableBuilder[Self <: VideoViewProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: video_view_profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
}
