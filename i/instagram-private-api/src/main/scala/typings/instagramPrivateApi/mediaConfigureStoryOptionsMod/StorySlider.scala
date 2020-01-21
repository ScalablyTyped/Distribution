package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.instagramPrivateApiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorySlider extends StorySticker {
  var background_color: String
  var emoji: String
  var is_sticker: `true`
  var question: String
  var text_color: String
}

object StorySlider {
  @scala.inline
  def apply(
    background_color: String,
    emoji: String,
    height: Double,
    is_sticker: `true`,
    question: String,
    rotation: Double,
    text_color: String,
    width: Double,
    x: Double,
    y: Double
  ): StorySlider = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorySlider]
  }
}

