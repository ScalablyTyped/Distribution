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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaLikeOptionsMod {
  
  @js.native
  trait BaseProfile extends StObject {
    
    var user_id: String | Double = js.native
    
    var username: String = js.native
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
  
  @js.native
  trait FeedContextualHashtag extends StObject {
    
    var hashtag: String = js.native
    
    var module_name: feed_contextual_hashtag = js.native
  }
  object FeedContextualHashtag {
    
    @scala.inline
    def apply(hashtag: String, module_name: feed_contextual_hashtag): FeedContextualHashtag = {
      val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
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
  
  @js.native
  trait FeedContextualLocation extends StObject {
    
    var location_id: String | Double = js.native
    
    var module_name: feed_contextual_location = js.native
  }
  object FeedContextualLocation {
    
    @scala.inline
    def apply(location_id: String | Double, module_name: feed_contextual_location): FeedContextualLocation = {
      val __obj = js.Dynamic.literal(location_id = location_id.asInstanceOf[js.Any], module_name = module_name.asInstanceOf[js.Any])
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
  
  @js.native
  trait FeedTimeline extends StObject {
    
    var module_name: feed_timeline | feed_contextual_post | newsfeed | feed_contextual_newsfeed_multi_media_liked = js.native
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
  
  type LikeModuleInfoOption = (FeedTimeline | FeedContextualHashtag | FeedContextualLocation | Profile | MediaViewProfile | VideoViewProfile | PhotoViewProfile) with StringDictionary[js.Any]
  
  @js.native
  trait LikeOrUnlikeBaseOptions extends StObject {
    
    var mediaId: String = js.native
    
    var moduleInfo: LikeModuleInfoOption = js.native
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
  
  /* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d :1 | 0} */
  @js.native
  trait LikeRequestOptions extends StObject {
    
    var d: `1` | `0` = js.native
    
    var mediaId: String = js.native
    
    var moduleInfo: LikeModuleInfoOption = js.native
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
      
      @scala.inline
      def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleInfo(value: LikeModuleInfoOption): Self = StObject.set(x, "moduleInfo", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  action :'like' | 'unlike',   d :1 | 0 | undefined} */
  @js.native
  trait MediaLikeOrUnlikeOptions extends StObject {
    
    var action: like | unlike = js.native
    
    var d: js.UndefOr[`1` | `0`] = js.native
    
    var mediaId: String = js.native
    
    var moduleInfo: LikeModuleInfoOption = js.native
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
      
      @scala.inline
      def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleInfo(value: LikeModuleInfoOption): Self = StObject.set(x, "moduleInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaViewProfile extends BaseProfile {
    
    var module_name: media_view_profile = js.native
  }
  object MediaViewProfile {
    
    @scala.inline
    def apply(module_name: media_view_profile, user_id: String | Double, username: String): MediaViewProfile = {
      val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaViewProfile]
    }
    
    @scala.inline
    implicit class MediaViewProfileMutableBuilder[Self <: MediaViewProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: media_view_profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhotoViewProfile extends BaseProfile {
    
    var module_name: photo_view_profile = js.native
  }
  object PhotoViewProfile {
    
    @scala.inline
    def apply(module_name: photo_view_profile, user_id: String | Double, username: String): PhotoViewProfile = {
      val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoViewProfile]
    }
    
    @scala.inline
    implicit class PhotoViewProfileMutableBuilder[Self <: PhotoViewProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: photo_view_profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Profile extends BaseProfile {
    
    var module_name: profile = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(module_name: profile, user_id: String | Double, username: String): Profile = {
      val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined instagram-private-api.instagram-private-api/dist/types/media.like.options.LikeOrUnlikeBaseOptions & {  d :0 | undefined} */
  @js.native
  trait UnlikeRequestOptions extends StObject {
    
    var d: js.UndefOr[`0`] = js.native
    
    var mediaId: String = js.native
    
    var moduleInfo: LikeModuleInfoOption = js.native
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
      
      @scala.inline
      def setMediaId(value: String): Self = StObject.set(x, "mediaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleInfo(value: LikeModuleInfoOption): Self = StObject.set(x, "moduleInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VideoViewProfile extends BaseProfile {
    
    var module_name: video_view_profile = js.native
  }
  object VideoViewProfile {
    
    @scala.inline
    def apply(module_name: video_view_profile, user_id: String | Double, username: String): VideoViewProfile = {
      val __obj = js.Dynamic.literal(module_name = module_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoViewProfile]
    }
    
    @scala.inline
    implicit class VideoViewProfileMutableBuilder[Self <: VideoViewProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule_name(value: video_view_profile): Self = StObject.set(x, "module_name", value.asInstanceOf[js.Any])
    }
  }
}
