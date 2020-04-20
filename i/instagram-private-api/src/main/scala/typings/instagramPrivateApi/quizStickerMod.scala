package typings.instagramPrivateApi

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/quiz.sticker", JSImport.Namespace)
@js.native
object quizStickerMod extends js.Object {
  @js.native
  class QuizSticker () extends InstaSticker {
    var _options: js.Any = js.native
    var correctAnswer: Double = js.native
    var endBackgroundColor: js.UndefOr[String] = js.native
    var question: String = js.native
    var startBackgroundColor: js.UndefOr[String] = js.native
    var textColor: js.UndefOr[String] = js.native
    var viewerAnswer: js.UndefOr[Double] = js.native
    var viewerCanAnswer: js.UndefOr[Boolean] = js.native
    def options: js.Array[String] | Options = js.native
    def options(value: js.Array[String] | Options): js.Any = js.native
  }
  
  type Options = js.Array[AnonCount]
}

