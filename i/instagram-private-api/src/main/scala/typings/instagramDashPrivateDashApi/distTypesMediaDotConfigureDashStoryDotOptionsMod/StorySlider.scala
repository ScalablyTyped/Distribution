package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
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
    val __obj = js.Dynamic.literal(background_color = background_color, emoji = emoji, height = height, is_sticker = is_sticker, question = question, rotation = rotation, text_color = text_color, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StorySlider]
  }
}

