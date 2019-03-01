package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountNotifications extends js.Object {
  var messages: js.Array[Notification[Conversation]]
  var replies: js.Array[Notification[Comment]]
}

object AccountNotifications {
  @scala.inline
  def apply(messages: js.Array[Notification[Conversation]], replies: js.Array[Notification[Comment]]): AccountNotifications = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("messages")(messages)
    __obj.updateDynamic("replies")(replies)
    __obj.asInstanceOf[AccountNotifications]
  }
}

