package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotRepositoryDotGetDashByDashParticipantsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem extends js.Object {
  var item_id: String
  var item_type: String
  var text: String
  var timestamp: String
  var user_id: Double
}

object DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem {
  @scala.inline
  def apply(item_id: String, item_type: String, text: String, timestamp: String, user_id: Double): DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem = {
    val __obj = js.Dynamic.literal(item_id = item_id, item_type = item_type, text = text, timestamp = timestamp, user_id = user_id)
  
    __obj.asInstanceOf[DirectThreadRepositoryGetByParticipantsResponseLastPermanentItem]
  }
}

