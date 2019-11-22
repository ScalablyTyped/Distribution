package typings.instagramDashPrivateDashApi.distResponsesDirectDashThreadDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectThreadFeedResponseLast_permanent_item extends js.Object {
  var client_context: String
  var item_id: String
  var item_type: String
  var text: String
  var timestamp: String
  var user_id: Double
}

object DirectThreadFeedResponseLast_permanent_item {
  @scala.inline
  def apply(
    client_context: String,
    item_id: String,
    item_type: String,
    text: String,
    timestamp: String,
    user_id: Double
  ): DirectThreadFeedResponseLast_permanent_item = {
    val __obj = js.Dynamic.literal(client_context = client_context, item_id = item_id, item_type = item_type, text = text, timestamp = timestamp, user_id = user_id)
  
    __obj.asInstanceOf[DirectThreadFeedResponseLast_permanent_item]
  }
}

