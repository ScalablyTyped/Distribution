package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.PartialInstaSticker
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
import typings.instagramPrivateApi.stickersMod.AttachmentSticker
import typings.instagramPrivateApi.stickersMod.ChatSticker
import typings.instagramPrivateApi.stickersMod.CountdownSticker
import typings.instagramPrivateApi.stickersMod.HashtagSticker
import typings.instagramPrivateApi.stickersMod.InstaSticker
import typings.instagramPrivateApi.stickersMod.LocationSticker
import typings.instagramPrivateApi.stickersMod.MentionSticker
import typings.instagramPrivateApi.stickersMod.PollSticker
import typings.instagramPrivateApi.stickersMod.QuestionSticker
import typings.instagramPrivateApi.stickersMod.QuizSticker
import typings.instagramPrivateApi.stickersMod.SliderSticker
import typings.utilityTypes.mappedTypesMod.Diff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickerBuilderStickerBuilderMod {
  
  @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder")
  @js.native
  class StickerBuilder () extends StObject {
    
    def add(sticker: InstaSticker): this.type = js.native
    
    def build(): StickerConfig = js.native
    
    var stickers: js.Any = js.native
  }
  /* static members */
  object StickerBuilder {
    
    @JSImport("instagram-private-api/dist/sticker-builder/sticker-builder", "StickerBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachment(options: StickerOptionsAttachmentS): AttachmentSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("attachment")(options.asInstanceOf[js.Any]).asInstanceOf[AttachmentSticker]
    
    @scala.inline
    def attachmentFromMedia(mediaInfo: User): AttachmentSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("attachmentFromMedia")(mediaInfo.asInstanceOf[js.Any]).asInstanceOf[AttachmentSticker]
    @scala.inline
    def attachmentFromMedia(mediaInfo: User, additional: PartialStickerOptionsAtta): AttachmentSticker = (^.asInstanceOf[js.Dynamic].applyDynamic("attachmentFromMedia")(mediaInfo.asInstanceOf[js.Any], additional.asInstanceOf[js.Any])).asInstanceOf[AttachmentSticker]
    
    @scala.inline
    def chat(options: StickerOptionsChatSticker): ChatSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("chat")(options.asInstanceOf[js.Any]).asInstanceOf[ChatSticker]
    
    @scala.inline
    def countdown(options: StickerOptionsCountdownSt): CountdownSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("countdown")(options.asInstanceOf[js.Any]).asInstanceOf[CountdownSticker]
    
    @scala.inline
    def hashtag(options: StickerOptionsHashtagStic): HashtagSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("hashtag")(options.asInstanceOf[js.Any]).asInstanceOf[HashtagSticker]
    
    @scala.inline
    def location(options: StickerOptionsLocationSti): LocationSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(options.asInstanceOf[js.Any]).asInstanceOf[LocationSticker]
    
    @scala.inline
    def mention(options: StickerOptionsMentionStic): MentionSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("mention")(options.asInstanceOf[js.Any]).asInstanceOf[MentionSticker]
    
    @scala.inline
    def mentionReel(mediaInfo: User): MentionSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("mentionReel")(mediaInfo.asInstanceOf[js.Any]).asInstanceOf[MentionSticker]
    @scala.inline
    def mentionReel(mediaInfo: User, additional: PartialStickerOptionsMent): MentionSticker = (^.asInstanceOf[js.Dynamic].applyDynamic("mentionReel")(mediaInfo.asInstanceOf[js.Any], additional.asInstanceOf[js.Any])).asInstanceOf[MentionSticker]
    
    @scala.inline
    def poll(options: StickerOptionsPollSticker): PollSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("poll")(options.asInstanceOf[js.Any]).asInstanceOf[PollSticker]
    
    @scala.inline
    def question(options: StickerOptionsQuestionSti): QuestionSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("question")(options.asInstanceOf[js.Any]).asInstanceOf[QuestionSticker]
    
    @scala.inline
    def quiz(options: StickerOptionsQuizSticker): QuizSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("quiz")(options.asInstanceOf[js.Any]).asInstanceOf[QuizSticker]
    
    @scala.inline
    def slider(options: StickerOptionsSliderStick): SliderSticker = ^.asInstanceOf[js.Dynamic].applyDynamic("slider")(options.asInstanceOf[js.Any]).asInstanceOf[SliderSticker]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait StickerConfig extends StObject {
    
    var story_sticker_ids: String
  }
  object StickerConfig {
    
    @scala.inline
    def apply(story_sticker_ids: String): StickerConfig = {
      val __obj = js.Dynamic.literal(story_sticker_ids = story_sticker_ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickerConfig]
    }
    
    @scala.inline
    implicit class StickerConfigMutableBuilder[Self <: StickerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStory_sticker_ids(value: String): Self = StObject.set(x, "story_sticker_ids", value.asInstanceOf[js.Any])
    }
  }
  
  type StickerOptions[T /* <: InstaSticker */] = (Diff[T, InstaSticker]) & PartialInstaSticker
}
