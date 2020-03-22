package typings.instagramPrivateApi

import typings.instagramPrivateApi.quizStickerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.QuizSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
@js.native
trait DiffQuizStickerInstaStick extends js.Object {
  var _options: js.Any = js.native
  var correctAnswer: Double = js.native
  var endBackgroundColor: js.UndefOr[String] = js.native
  @JSName("options")
  var options_Original: js.Function1[/* value */ js.Array[String] | Options, js.Any] = js.native
  var question: String = js.native
  var startBackgroundColor: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
  var viewerAnswer: js.UndefOr[Double] = js.native
  var viewerCanAnswer: js.UndefOr[Boolean] = js.native
  def options(value: js.Array[String] | Options): js.Any = js.native
}

