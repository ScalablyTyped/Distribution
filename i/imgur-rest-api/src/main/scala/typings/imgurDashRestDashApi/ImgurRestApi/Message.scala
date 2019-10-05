package typings.imgurDashRestDashApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var account_id: Double
  var body: String
  var conversation_id: Double
  var datetime: Double
  var from: String
  var id: Double
  var sender_id: Double
}

object Message {
  @scala.inline
  def apply(
    account_id: Double,
    body: String,
    conversation_id: Double,
    datetime: Double,
    from: String,
    id: Double,
    sender_id: Double
  ): Message = {
    val __obj = js.Dynamic.literal(account_id = account_id, body = body, conversation_id = conversation_id, datetime = datetime, from = from, id = id, sender_id = sender_id)
  
    __obj.asInstanceOf[Message]
  }
}

