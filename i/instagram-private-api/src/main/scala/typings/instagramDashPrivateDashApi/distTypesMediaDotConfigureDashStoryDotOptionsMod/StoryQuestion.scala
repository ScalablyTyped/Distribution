package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuestion extends StorySticker {
  var background_color: String
  var is_sticker: `true`
  var profile_pic_url: String
  var question: String
  var question_type: text
  var text_color: String
  var viewer_can_interact: `true`
}

object StoryQuestion {
  @scala.inline
  def apply(
    background_color: String,
    height: Double,
    is_sticker: `true`,
    profile_pic_url: String,
    question: String,
    question_type: text,
    rotation: Double,
    text_color: String,
    viewer_can_interact: `true`,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuestion = {
    val __obj = js.Dynamic.literal(background_color = background_color, height = height, is_sticker = is_sticker, profile_pic_url = profile_pic_url, question = question, question_type = question_type, rotation = rotation, text_color = text_color, viewer_can_interact = viewer_can_interact, width = width, x = x, y = y)
  
    __obj.asInstanceOf[StoryQuestion]
  }
}

