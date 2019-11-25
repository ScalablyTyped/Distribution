package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashStoryDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`true`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryQuestion extends StorySticker {
  var background_color: String
  var is_sticker: `true`
  var profile_pic_url: String
  var question: String
  var question_type: text_
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
    question_type: text_,
    rotation: Double,
    text_color: String,
    viewer_can_interact: `true`,
    width: Double,
    x: Double,
    y: Double
  ): StoryQuestion = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], is_sticker = is_sticker.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryQuestion]
  }
}

