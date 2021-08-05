package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Position
import typings.instagramPrivateApi.anon.Storystickerids
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postingOptionsMod {
  
  trait PostingLocation extends StObject {
    
    var address: String
    
    var external_id: String
    
    var external_id_source: String
    
    var lat: Double
    
    var lng: Double
    
    var name: String
  }
  object PostingLocation {
    
    inline def apply(
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
    
    extension [Self <: PostingLocation](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_id_source(value: String): Self = StObject.set(x, "external_id_source", value.asInstanceOf[js.Any])
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostingStoryLocationSticker extends StObject {
    
    var latitude: String
    
    var longitude: String
    
    var sticker: StoryLocation
  }
  object PostingStoryLocationSticker {
    
    inline def apply(latitude: String, longitude: String, sticker: StoryLocation): PostingStoryLocationSticker = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], sticker = sticker.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingStoryLocationSticker]
    }
    
    extension [Self <: PostingStoryLocationSticker](x: Self) {
      
      inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setSticker(value: StoryLocation): Self = StObject.set(x, "sticker", value.asInstanceOf[js.Any])
    }
  }
  
  trait PostingStoryOptions extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var chat: js.UndefOr[StoryChat] = js.undefined
    
    var countdown: js.UndefOr[StoryCountdown] = js.undefined
    
    var hashtags: js.UndefOr[js.Array[StoryHashtag]] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[PostingStoryLocationSticker] = js.undefined
    
    var media: js.UndefOr[StoryAttachedMedia] = js.undefined
    
    var mentions: js.UndefOr[js.Array[StoryMention]] = js.undefined
    
    var poll: js.UndefOr[StoryPoll] = js.undefined
    
    var question: js.UndefOr[StoryQuestion] = js.undefined
    
    var quiz: js.UndefOr[StoryQuiz] = js.undefined
    
    var recipientUsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var replyType: js.UndefOr[story | String] = js.undefined
    
    var slider: js.UndefOr[StorySlider] = js.undefined
    
    var stickerConfig: js.UndefOr[(js.Any & Storystickerids) | StickerBuilder] = js.undefined
    
    var threadIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var toBesties: js.UndefOr[Boolean] = js.undefined
    
    var viewMode: js.UndefOr[replayable | once | String] = js.undefined
  }
  object PostingStoryOptions {
    
    inline def apply(): PostingStoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostingStoryOptions]
    }
    
    extension [Self <: PostingStoryOptions](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChat(value: StoryChat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
      
      inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
      
      inline def setCountdown(value: StoryCountdown): Self = StObject.set(x, "countdown", value.asInstanceOf[js.Any])
      
      inline def setCountdownUndefined: Self = StObject.set(x, "countdown", js.undefined)
      
      inline def setHashtags(value: js.Array[StoryHashtag]): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
      
      inline def setHashtagsUndefined: Self = StObject.set(x, "hashtags", js.undefined)
      
      inline def setHashtagsVarargs(value: StoryHashtag*): Self = StObject.set(x, "hashtags", js.Array(value :_*))
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLocation(value: PostingStoryLocationSticker): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMedia(value: StoryAttachedMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMentions(value: js.Array[StoryMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
      
      inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
      
      inline def setMentionsVarargs(value: StoryMention*): Self = StObject.set(x, "mentions", js.Array(value :_*))
      
      inline def setPoll(value: StoryPoll): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setQuestion(value: StoryQuestion): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
      
      inline def setQuestionUndefined: Self = StObject.set(x, "question", js.undefined)
      
      inline def setQuiz(value: StoryQuiz): Self = StObject.set(x, "quiz", value.asInstanceOf[js.Any])
      
      inline def setQuizUndefined: Self = StObject.set(x, "quiz", js.undefined)
      
      inline def setRecipientUsers(value: js.Array[String]): Self = StObject.set(x, "recipientUsers", value.asInstanceOf[js.Any])
      
      inline def setRecipientUsersUndefined: Self = StObject.set(x, "recipientUsers", js.undefined)
      
      inline def setRecipientUsersVarargs(value: String*): Self = StObject.set(x, "recipientUsers", js.Array(value :_*))
      
      inline def setReplyType(value: story | String): Self = StObject.set(x, "replyType", value.asInstanceOf[js.Any])
      
      inline def setReplyTypeUndefined: Self = StObject.set(x, "replyType", js.undefined)
      
      inline def setSlider(value: StorySlider): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setStickerConfig(value: (js.Any & Storystickerids) | StickerBuilder): Self = StObject.set(x, "stickerConfig", value.asInstanceOf[js.Any])
      
      inline def setStickerConfigUndefined: Self = StObject.set(x, "stickerConfig", js.undefined)
      
      inline def setThreadIds(value: js.Array[String]): Self = StObject.set(x, "threadIds", value.asInstanceOf[js.Any])
      
      inline def setThreadIdsUndefined: Self = StObject.set(x, "threadIds", js.undefined)
      
      inline def setThreadIdsVarargs(value: String*): Self = StObject.set(x, "threadIds", js.Array(value :_*))
      
      inline def setToBesties(value: Boolean): Self = StObject.set(x, "toBesties", value.asInstanceOf[js.Any])
      
      inline def setToBestiesUndefined: Self = StObject.set(x, "toBesties", js.undefined)
      
      inline def setViewMode(value: replayable | once | String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  trait PostingUsertags extends StObject {
    
    var in: js.Array[Position]
  }
  object PostingUsertags {
    
    inline def apply(in: js.Array[Position]): PostingUsertags = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostingUsertags]
    }
    
    extension [Self <: PostingUsertags](x: Self) {
      
      inline def setIn(value: js.Array[Position]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInVarargs(value: Position*): Self = StObject.set(x, "in", js.Array(value :_*))
    }
  }
}
