package typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod

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
    val __obj = js.Dynamic.literal(max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], quiz_id = quiz_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseStoryQuizParticipantInfosItem]
  }
}

