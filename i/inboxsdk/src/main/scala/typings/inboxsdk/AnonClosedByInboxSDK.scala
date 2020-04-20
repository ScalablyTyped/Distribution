package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClosedByInboxSDK extends js.Object {
  var closedByInboxSDK: Boolean
  var messageID: String
}

object AnonClosedByInboxSDK {
  @scala.inline
  def apply(closedByInboxSDK: Boolean, messageID: String): AnonClosedByInboxSDK = {
    val __obj = js.Dynamic.literal(closedByInboxSDK = closedByInboxSDK.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClosedByInboxSDK]
  }
}

