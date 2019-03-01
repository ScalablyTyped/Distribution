package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var account_id: scala.Double
  var body: java.lang.String
  var conversation_id: scala.Double
  var datetime: scala.Double
  var from: java.lang.String
  var id: scala.Double
  var sender_id: scala.Double
}

object Message {
  @scala.inline
  def apply(
    account_id: scala.Double,
    body: java.lang.String,
    conversation_id: scala.Double,
    datetime: scala.Double,
    from: java.lang.String,
    id: scala.Double,
    sender_id: scala.Double
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("account_id")(account_id)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("conversation_id")(conversation_id)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("sender_id")(sender_id)
    __obj.asInstanceOf[Message]
  }
}

