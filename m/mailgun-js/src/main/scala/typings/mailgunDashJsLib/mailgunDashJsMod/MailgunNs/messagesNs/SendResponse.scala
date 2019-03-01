package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendResponse extends js.Object {
  var id: java.lang.String
  var message: java.lang.String
}

object SendResponse {
  @scala.inline
  def apply(id: java.lang.String, message: java.lang.String): SendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[SendResponse]
  }
}

