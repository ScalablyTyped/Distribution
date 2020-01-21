package typings.instagramPrivateApi

import typings.instagramPrivateApi.chatStickerMod.ChatStickerOptions
import typings.instagramPrivateApi.countdownStickerMod.CountdownStickerOptions
import typings.instagramPrivateApi.hashtagStickerMod.HashtagStickerOptions
import typings.instagramPrivateApi.locationStickerMod.LocationStickerOptions
import typings.instagramPrivateApi.mentionStickerMod.MentionStickerOptions
import typings.instagramPrivateApi.pollStickerMod.PollStickerOptions
import typings.instagramPrivateApi.questionStickerMod.QuestionStickerOptions
import typings.instagramPrivateApi.quizStickerMod.QuizStickerOptions
import typings.instagramPrivateApi.sliderStickerMod.SliderStickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder", JSImport.Namespace)
@js.native
object stickerBuilderMod extends js.Object {
  @js.native
  class ChatSticker ()
    extends typings.instagramPrivateApi.chatStickerMod.ChatSticker
  
  @js.native
  class CountdownSticker ()
    extends typings.instagramPrivateApi.countdownStickerMod.CountdownSticker
  
  @js.native
  class HashtagSticker ()
    extends typings.instagramPrivateApi.hashtagStickerMod.HashtagSticker
  
  @js.native
  abstract class InstaSticker ()
    extends typings.instagramPrivateApi.instaStickerMod.InstaSticker
  
  @js.native
  class LocationSticker ()
    extends typings.instagramPrivateApi.locationStickerMod.LocationSticker
  
  @js.native
  class MentionSticker ()
    extends typings.instagramPrivateApi.mentionStickerMod.MentionSticker
  
  @js.native
  class PollSticker ()
    extends typings.instagramPrivateApi.pollStickerMod.PollSticker
  
  @js.native
  class QuestionSticker ()
    extends typings.instagramPrivateApi.questionStickerMod.QuestionSticker
  
  @js.native
  class QuizSticker ()
    extends typings.instagramPrivateApi.quizStickerMod.QuizSticker
  
  @js.native
  class SliderSticker ()
    extends typings.instagramPrivateApi.sliderStickerMod.SliderSticker
  
  @js.native
  class StickerBuilder ()
    extends typings.instagramPrivateApi.stickerBuilderStickerBuilderMod.StickerBuilder
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def chat(options: ChatStickerOptions): typings.instagramPrivateApi.stickersMod.ChatSticker = js.native
    def countdown(options: CountdownStickerOptions): typings.instagramPrivateApi.stickersMod.CountdownSticker = js.native
    def hashtag(options: HashtagStickerOptions): typings.instagramPrivateApi.stickersMod.HashtagSticker = js.native
    def location(options: LocationStickerOptions): typings.instagramPrivateApi.stickersMod.LocationSticker = js.native
    def mention(options: MentionStickerOptions): typings.instagramPrivateApi.stickersMod.MentionSticker = js.native
    def poll(options: PollStickerOptions): typings.instagramPrivateApi.stickersMod.PollSticker = js.native
    def question(options: QuestionStickerOptions): typings.instagramPrivateApi.stickersMod.QuestionSticker = js.native
    def quiz(options: QuizStickerOptions): typings.instagramPrivateApi.stickersMod.QuizSticker = js.native
    def slider(options: SliderStickerOptions): typings.instagramPrivateApi.stickersMod.SliderSticker = js.native
  }
  
}

