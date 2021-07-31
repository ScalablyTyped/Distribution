package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.PartialStickerOptionsAtta
import typings.instagramPrivateApi.anon.PartialStickerOptionsMent
import typings.instagramPrivateApi.anon.StickerOptionsAttachmentS
import typings.instagramPrivateApi.anon.StickerOptionsChatSticker
import typings.instagramPrivateApi.anon.StickerOptionsCountdownSt
import typings.instagramPrivateApi.anon.StickerOptionsHashtagStic
import typings.instagramPrivateApi.anon.StickerOptionsLocationSti
import typings.instagramPrivateApi.anon.StickerOptionsMentionStic
import typings.instagramPrivateApi.anon.StickerOptionsPollSticker
import typings.instagramPrivateApi.anon.StickerOptionsQuestionSti
import typings.instagramPrivateApi.anon.StickerOptionsQuizSticker
import typings.instagramPrivateApi.anon.StickerOptionsSliderStick
import typings.instagramPrivateApi.anon.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickerBuilderMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder", "AttachmentSticker")
  @js.native
  class AttachmentSticker ()
    extends typings.instagramPrivateApi.stickersMod.AttachmentSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "ChatSticker")
  @js.native
  class ChatSticker ()
    extends typings.instagramPrivateApi.stickersMod.ChatSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "CountdownSticker")
  @js.native
  class CountdownSticker ()
    extends typings.instagramPrivateApi.stickersMod.CountdownSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "HashtagSticker")
  @js.native
  class HashtagSticker ()
    extends typings.instagramPrivateApi.stickersMod.HashtagSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "InstaSticker")
  @js.native
  abstract class InstaSticker ()
    extends typings.instagramPrivateApi.stickersMod.InstaSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "LocationSticker")
  @js.native
  class LocationSticker ()
    extends typings.instagramPrivateApi.stickersMod.LocationSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "MentionSticker")
  @js.native
  class MentionSticker ()
    extends typings.instagramPrivateApi.stickersMod.MentionSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "PollSticker")
  @js.native
  class PollSticker ()
    extends typings.instagramPrivateApi.stickersMod.PollSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "QuestionSticker")
  @js.native
  class QuestionSticker ()
    extends typings.instagramPrivateApi.stickersMod.QuestionSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "QuizSticker")
  @js.native
  class QuizSticker ()
    extends typings.instagramPrivateApi.stickersMod.QuizSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "SliderSticker")
  @js.native
  class SliderSticker ()
    extends typings.instagramPrivateApi.stickersMod.SliderSticker
  
  @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder")
  @js.native
  class StickerBuilder ()
    extends typings.instagramPrivateApi.stickerBuilderStickerBuilderMod.StickerBuilder
  /* static members */
  object StickerBuilder {
    
    @JSImport("instagram-private-api/dist/sticker-builder", "StickerBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachment(options: StickerOptionsAttachmentS): typings.instagramPrivateApi.stickersMod.AttachmentSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("attachment")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.AttachmentSticker]
    
    @scala.inline
    def attachmentFromMedia(mediaInfo: User): typings.instagramPrivateApi.stickersMod.AttachmentSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("attachmentFromMedia")(mediaInfo.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.AttachmentSticker]
    @scala.inline
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): typings.instagramPrivateApi.stickersMod.AttachmentSticker = (^.asInstanceOf[js.Dynamic].applyDynamic("attachmentFromMedia")(mediaInfo.asInstanceOf[js.Any], additional.asInstanceOf[js.Any])).asInstanceOf[typings.instagramPrivateApi.stickersMod.AttachmentSticker]
    
    @scala.inline
    def chat(options: StickerOptionsChatSticker): typings.instagramPrivateApi.stickersMod.ChatSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("chat")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.ChatSticker]
    
    @scala.inline
    def countdown(options: StickerOptionsCountdownSt): typings.instagramPrivateApi.stickersMod.CountdownSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("countdown")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.CountdownSticker]
    
    @scala.inline
    def hashtag(options: StickerOptionsHashtagStic): typings.instagramPrivateApi.stickersMod.HashtagSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("hashtag")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.HashtagSticker]
    
    @scala.inline
    def location(options: StickerOptionsLocationSti): typings.instagramPrivateApi.stickersMod.LocationSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.LocationSticker]
    
    @scala.inline
    def mention(options: StickerOptionsMentionStic): typings.instagramPrivateApi.stickersMod.MentionSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("mention")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.MentionSticker]
    
    @scala.inline
    def mentionReel(mediaInfo: User): typings.instagramPrivateApi.stickersMod.MentionSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("mentionReel")(mediaInfo.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.MentionSticker]
    @scala.inline
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): typings.instagramPrivateApi.stickersMod.MentionSticker = (^.asInstanceOf[js.Dynamic].applyDynamic("mentionReel")(mediaInfo.asInstanceOf[js.Any], additional.asInstanceOf[js.Any])).asInstanceOf[typings.instagramPrivateApi.stickersMod.MentionSticker]
    
    @scala.inline
    def poll(options: StickerOptionsPollSticker): typings.instagramPrivateApi.stickersMod.PollSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.PollSticker]
    
    @scala.inline
    def question(options: StickerOptionsQuestionSti): typings.instagramPrivateApi.stickersMod.QuestionSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("question")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.QuestionSticker]
    
    @scala.inline
    def quiz(options: StickerOptionsQuizSticker): typings.instagramPrivateApi.stickersMod.QuizSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("quiz")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.QuizSticker]
    
    @scala.inline
    def slider(options: StickerOptionsSliderStick): typings.instagramPrivateApi.stickersMod.SliderSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("slider")(options.asInstanceOf[js.Any]).asInstanceOf[typings.instagramPrivateApi.stickersMod.SliderSticker]
  }
}
