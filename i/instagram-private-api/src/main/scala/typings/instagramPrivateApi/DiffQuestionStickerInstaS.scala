package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.music
import typings.instagramPrivateApi.instagramPrivateApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined utility-types.utility-types.Diff<instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.QuestionSticker, instagram-private-api.instagram-private-api/dist/sticker-builder/stickers.InstaSticker> */
trait DiffQuestionStickerInstaS extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var profilePicUrl: js.UndefOr[String] = js.undefined
  var question: String
  var questionType: js.UndefOr[text_ | music] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var viewerCanInteract: js.UndefOr[Boolean] = js.undefined
}

object DiffQuestionStickerInstaS {
  @scala.inline
  def apply(
    question: String,
    backgroundColor: String = null,
    profilePicUrl: String = null,
    questionType: text_ | music = null,
    textColor: String = null,
    viewerCanInteract: js.UndefOr[Boolean] = js.undefined
  ): DiffQuestionStickerInstaS = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (profilePicUrl != null) __obj.updateDynamic("profilePicUrl")(profilePicUrl.asInstanceOf[js.Any])
    if (questionType != null) __obj.updateDynamic("questionType")(questionType.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (!js.isUndefined(viewerCanInteract)) __obj.updateDynamic("viewerCanInteract")(viewerCanInteract.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffQuestionStickerInstaS]
  }
}

