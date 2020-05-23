package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClosedByInboxSDK extends js.Object {
  var closedByInboxSDK: Boolean
  var messageID: String
}

object ClosedByInboxSDK {
  @scala.inline
  def apply(closedByInboxSDK: Boolean, messageID: String): ClosedByInboxSDK = {
    val __obj = js.Dynamic.literal(closedByInboxSDK = closedByInboxSDK.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosedByInboxSDK]
  }
}

