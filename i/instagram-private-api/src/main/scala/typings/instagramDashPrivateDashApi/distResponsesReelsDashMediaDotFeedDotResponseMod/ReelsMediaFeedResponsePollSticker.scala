package typings.instagramDashPrivateDashApi.distResponsesReelsDashMediaDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReelsMediaFeedResponsePollSticker extends js.Object {
  var finished: Boolean
  var id: String
  var is_shared_result: Boolean
  var poll_id: Double
  var promotion_tallies: Null
  var question: String
  var tallies: js.Array[ReelsMediaFeedResponseTalliesItem]
  var viewer_can_vote: Boolean
  var viewer_vote: js.UndefOr[Double] = js.undefined
}

object ReelsMediaFeedResponsePollSticker {
  @scala.inline
  def apply(
    finished: Boolean,
    id: String,
    is_shared_result: Boolean,
    poll_id: Double,
    promotion_tallies: Null,
    question: String,
    tallies: js.Array[ReelsMediaFeedResponseTalliesItem],
    viewer_can_vote: Boolean,
    viewer_vote: Int | Double = null
  ): ReelsMediaFeedResponsePollSticker = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_shared_result = is_shared_result.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], promotion_tallies = promotion_tallies.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], tallies = tallies.asInstanceOf[js.Any], viewer_can_vote = viewer_can_vote.asInstanceOf[js.Any])
    if (viewer_vote != null) __obj.updateDynamic("viewer_vote")(viewer_vote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponsePollSticker]
  }
}

