package typings.instagramDashPrivateDashApi.distResponsesReelsDashTrayDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsTrayFeedResponseQuestion_sticker extends js.Object {
  var background_color: String
  var media_id: String
  var profile_pic_url: String
  var question: String
  var question_id: String
  var question_type: String
  var text_color: String
  var viewer_can_interact: Boolean
}

object ReelsTrayFeedResponseQuestion_sticker {
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
  ): ReelsTrayFeedResponseQuestion_sticker = {
    val __obj = js.Dynamic.literal(background_color = background_color, media_id = media_id, profile_pic_url = profile_pic_url, question = question, question_id = question_id, question_type = question_type, text_color = text_color, viewer_can_interact = viewer_can_interact)
  
    __obj.asInstanceOf[ReelsTrayFeedResponseQuestion_sticker]
  }
}

