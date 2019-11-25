package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryEditReelResponseParticipantsItem extends js.Object {
  var answer: Double
  var ts: Double
  var user: HighlightsRepositoryEditReelResponseUser
}

object HighlightsRepositoryEditReelResponseParticipantsItem {
  @scala.inline
  def apply(answer: Double, ts: Double, user: HighlightsRepositoryEditReelResponseUser): HighlightsRepositoryEditReelResponseParticipantsItem = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HighlightsRepositoryEditReelResponseParticipantsItem]
  }
}

