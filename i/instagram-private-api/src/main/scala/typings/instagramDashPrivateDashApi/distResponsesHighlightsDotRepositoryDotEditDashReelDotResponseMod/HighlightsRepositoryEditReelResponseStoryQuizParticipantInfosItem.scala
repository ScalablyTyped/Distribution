package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem extends js.Object {
  var max_id: Null
  var more_available: Boolean
  var participants: js.Array[HighlightsRepositoryEditReelResponseParticipantsItem]
  var quiz_id: String
}

object HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem {
  @scala.inline
  def apply(
    max_id: Null,
    more_available: Boolean,
    participants: js.Array[HighlightsRepositoryEditReelResponseParticipantsItem],
    quiz_id: String
  ): HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem = {
    val __obj = js.Dynamic.literal(max_id = max_id, more_available = more_available, participants = participants, quiz_id = quiz_id)
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem]
  }
}

