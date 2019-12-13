package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersChatDotStickerMod.ChatStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersCountdownDotStickerMod.CountdownStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersHashtagDotStickerMod.HashtagStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersLocationDotStickerMod.LocationStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMentionDotStickerMod.MentionStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod.PollStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuestionDotStickerMod.QuestionStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuizDotStickerMod.QuizStickerOptions
import typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersSliderDotStickerMod.SliderStickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder", JSImport.Namespace)
@js.native
object distStickerDashBuilderMod extends js.Object {
  @js.native
  class ChatSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersChatDotStickerMod.ChatSticker
  
  @js.native
  class CountdownSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersCountdownDotStickerMod.CountdownSticker
  
  @js.native
  class HashtagSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersHashtagDotStickerMod.HashtagSticker
  
  @js.native
  abstract class InstaSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersInstaDashStickerMod.InstaSticker
  
  @js.native
  class LocationSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersLocationDotStickerMod.LocationSticker
  
  @js.native
  class MentionSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMentionDotStickerMod.MentionSticker
  
  @js.native
  class PollSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersPollDotStickerMod.PollSticker
  
  @js.native
  class QuestionSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuestionDotStickerMod.QuestionSticker
  
  @js.native
  class QuizSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersQuizDotStickerMod.QuizSticker
  
  @js.native
  class SliderSticker ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersSliderDotStickerMod.SliderSticker
  
  @js.native
  class StickerBuilder ()
    extends typings.instagramDashPrivateDashApi.distStickerDashBuilderStickerDashBuilderMod.StickerBuilder
  
  /* static members */
  @js.native
  object StickerBuilder extends js.Object {
    def chat(options: ChatStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.ChatSticker = js.native
    def countdown(options: CountdownStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.CountdownSticker = js.native
    def hashtag(options: HashtagStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.HashtagSticker = js.native
    def location(options: LocationStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.LocationSticker = js.native
    def mention(options: MentionStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.MentionSticker = js.native
    def poll(options: PollStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.PollSticker = js.native
    def question(options: QuestionStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.QuestionSticker = js.native
    def quiz(options: QuizStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.QuizSticker = js.native
    def slider(options: SliderStickerOptions): typings.instagramDashPrivateDashApi.distStickerDashBuilderStickersMod.SliderSticker = js.native
  }
  
}

