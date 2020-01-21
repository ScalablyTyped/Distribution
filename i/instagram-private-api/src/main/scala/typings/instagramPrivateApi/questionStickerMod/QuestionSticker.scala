package typings.instagramPrivateApi.questionStickerMod

import typings.instagramPrivateApi.instaStickerMod.InstaSticker
import typings.instagramPrivateApi.instagramPrivateApiStrings.music
import typings.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/sticker-builder/stickers/question.sticker", "QuestionSticker")
@js.native
class QuestionSticker ()
  extends InstaSticker
     with QuestionStickerOptions {
  @JSName("backgroundColor")
  var backgroundColor_QuestionSticker: String = js.native
  @JSName("profilePicUrl")
  var profilePicUrl_QuestionSticker: String = js.native
  /* CompleteClass */
  override var question: String = js.native
  @JSName("questionType")
  var questionType_QuestionSticker: text_ | music = js.native
  @JSName("textColor")
  var textColor_QuestionSticker: String = js.native
  var viewerCanInteract: Boolean = js.native
}

