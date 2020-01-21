package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseQuestionSticker extends js.Object {
  var background_color: String
  var media_id: String
  var profile_pic_url: String
  var question: String
  var question_id: String
  var question_type: String
  var text_color: String
  var viewer_can_interact: Boolean
}

object ReelsTrayFeedResponseQuestionSticker {
  @scala.inline
  def apply(
    background_color: String,
    media_id: String,
    profile_pic_url: String,
    question: String,
    question_id: String,
    question_type: String,
    text_color: String,
    viewer_can_interact: Boolean
  ): ReelsTrayFeedResponseQuestionSticker = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], question_id = question_id.asInstanceOf[js.Any], question_type = question_type.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_interact = viewer_can_interact.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsTrayFeedResponseQuestionSticker]
  }
}

