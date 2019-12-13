package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponseSliderSticker extends js.Object {
  var background_color: String
  var emoji: String
  var question: String
  var slider_id: Double
  var slider_vote_average: Null
  var slider_vote_count: Double
  var text_color: String
  var viewer_can_vote: Boolean
}

object ReelsMediaFeedResponseSliderSticker {
  @scala.inline
  def apply(
    background_color: String,
    emoji: String,
    question: String,
    slider_id: Double,
    slider_vote_average: Null,
    slider_vote_count: Double,
    text_color: String,
    viewer_can_vote: Boolean
  ): ReelsMediaFeedResponseSliderSticker = {
    val __obj = js.Dynamic.literal(background_color = background_color.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], slider_id = slider_id.asInstanceOf[js.Any], slider_vote_average = slider_vote_average.asInstanceOf[js.Any], slider_vote_count = slider_vote_count.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReelsMediaFeedResponseSliderSticker]
  }
}

