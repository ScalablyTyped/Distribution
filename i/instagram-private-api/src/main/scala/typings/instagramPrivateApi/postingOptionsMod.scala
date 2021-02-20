package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Position
import typings.instagramPrivateApi.anon.StorystickeridsAny
import typings.instagramPrivateApi.instagramPrivateApiStrings.once
import typings.instagramPrivateApi.instagramPrivateApiStrings.replayable
import typings.instagramPrivateApi.instagramPrivateApiStrings.story
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryAttachedMedia
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryChat
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryCountdown
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryHashtag
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryLocation
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryMention
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryPoll
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuestion
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StoryQuiz
import typings.instagramPrivateApi.mediaConfigureStoryOptionsMod.StorySlider
import typings.instagramPrivateApi.stickerBuilderMod.StickerBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingOptionsMod {
  
  @js.native
  trait PostingLocation extends StObject {
    
    var address: String = js.native
    
    var external_id: String = js.native
    
    var external_id_source: String = js.native
    
    var lat: Double = js.native
    
    var lng: Double = js.native
    
    var name: String = js.native
  }
  object PostingLocation {
    
    @scala.inline
    def apply(
      address: String,
      external_id: String,
      external_id_source: String,
      lat: Double,
      lng: Double,
      name: String
    ): PostingLocation = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], external_id_source = external_id_source.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingLocation]
    }
    
    @scala.inline
    implicit class PostingLocationMutableBuilder[Self <: PostingLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_id_source(value: String): Self = StObject.set(x, "external_id_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostingStoryLocationSticker extends StObject {
    
    var latitude: String = js.native
    
    var longitude: String = js.native
    
    var sticker: StoryLocation = js.native
  }
  object PostingStoryLocationSticker {
    
    @scala.inline
    def apply(latitude: String, longitude: String, sticker: StoryLocation): PostingStoryLocationSticker = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], sticker = sticker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingStoryLocationSticker]
    }
    
    @scala.inline
    implicit class PostingStoryLocationStickerMutableBuilder[Self <: PostingStoryLocationSticker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSticker(value: StoryLocation): Self = StObject.set(x, "sticker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PostingStoryOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.native
    
    var chat: js.UndefOr[StoryChat] = js.native
    
    var countdown: js.UndefOr[StoryCountdown] = js.native
    
    var hashtags: js.UndefOr[js.Array[StoryHashtag]] = js.native
    
    var link: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[PostingStoryLocationSticker] = js.native
    
    var media: js.UndefOr[StoryAttachedMedia] = js.native
    
    var mentions: js.UndefOr[js.Array[StoryMention]] = js.native
    
    var poll: js.UndefOr[StoryPoll] = js.native
    
    var question: js.UndefOr[StoryQuestion] = js.native
    
    var quiz: js.UndefOr[StoryQuiz] = js.native
    
    var recipientUsers: js.UndefOr[js.Array[String]] = js.native
    
    var replyType: js.UndefOr[story | String] = js.native
    
    var slider: js.UndefOr[StorySlider] = js.native
    
    var stickerConfig: js.UndefOr[(js.Any with StorystickeridsAny) | StickerBuilder] = js.native
    
    var threadIds: js.UndefOr[js.Array[String]] = js.native
    
    var toBesties: js.UndefOr[Boolean] = js.native
    
    var viewMode: js.UndefOr[replayable | once | String] = js.native
  }
  object PostingStoryOptions {
    
    @scala.inline
    def apply(): PostingStoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostingStoryOptions]
    }
    
    @scala.inline
    implicit class PostingStoryOptionsMutableBuilder[Self <: PostingStoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setChat(value: StoryChat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
      
      @scala.inline
      def setCountdown(value: StoryCountdown): Self = StObject.set(x, "countdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountdownUndefined: Self = StObject.set(x, "countdown", js.undefined)
      
      @scala.inline
      def setHashtags(value: js.Array[StoryHashtag]): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagsUndefined: Self = StObject.set(x, "hashtags", js.undefined)
      
      @scala.inline
      def setHashtagsVarargs(value: StoryHashtag*): Self = StObject.set(x, "hashtags", js.Array(value :_*))
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setLocation(value: PostingStoryLocationSticker): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMedia(value: StoryAttachedMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMentions(value: js.Array[StoryMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
      
      @scala.inline
      def setMentionsVarargs(value: StoryMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
      
      @scala.inline
      def setPoll(value: StoryPoll): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      @scala.inline
      def setQuestion(value: StoryQuestion): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
      
      @scala.inline
      def setQuiz(value: StoryQuiz): Self = StObject.set(x, "quiz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuizUndefined: Self = StObject.set(x, "quiz", js.undefined)
      
      @scala.inline
      def setRecipientUsers(value: js.Array[String]): Self = StObject.set(x, "recipientUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientUsersUndefined: Self = StObject.set(x, "recipientUsers", js.undefined)
      
      @scala.inline
      def setRecipientUsersVarargs(value: String*): Self = StObject.set(x, "recipientUsers", js.Array(value :_*))
      
      @scala.inline
      def setReplyType(value: story | String): Self = StObject.set(x, "replyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyTypeUndefined: Self = StObject.set(x, "replyType", js.undefined)
      
      @scala.inline
      def setSlider(value: StorySlider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      @scala.inline
      def setStickerConfig(value: (js.Any with StorystickeridsAny) | StickerBuilder): Self = StObject.set(x, "stickerConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickerConfigUndefined: Self = StObject.set(x, "stickerConfig", js.undefined)
      
      @scala.inline
      def setThreadIds(value: js.Array[String]): Self = StObject.set(x, "threadIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadIdsUndefined: Self = StObject.set(x, "threadIds", js.undefined)
      
      @scala.inline
      def setThreadIdsVarargs(value: String*): Self = StObject.set(x, "threadIds", js.Array(value :_*))
      
      @scala.inline
      def setToBesties(value: Boolean): Self = StObject.set(x, "toBesties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBestiesUndefined: Self = StObject.set(x, "toBesties", js.undefined)
      
      @scala.inline
      def setViewMode(value: replayable | once | String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  @js.native
  trait PostingUsertags extends StObject {
    
    var in: js.Array[Position] = js.native
  }
  object PostingUsertags {
    
    @scala.inline
    def apply(in: js.Array[Position]): PostingUsertags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingUsertags]
    }
    
    @scala.inline
    implicit class PostingUsertagsMutableBuilder[Self <: PostingUsertags] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: js.Array[Position]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInVarargs(value: Position*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
}
