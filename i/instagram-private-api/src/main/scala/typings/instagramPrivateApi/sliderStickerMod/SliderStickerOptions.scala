package typings.instagramPrivateApi.sliderStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderStickerOptions extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var emoji: String
  var question: String
  var textColor: js.UndefOr[String] = js.undefined
}

object SliderStickerOptions {
  @scala.inline
  def apply(emoji: String, question: String, backgroundColor: String = null, textColor: String = null): SliderStickerOptions = {
    val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStickerOptions]
  }
}

