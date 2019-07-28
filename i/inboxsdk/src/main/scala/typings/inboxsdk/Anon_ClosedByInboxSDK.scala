package typings.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedByInboxSDK extends js.Object {
  var closedByInboxSDK: Boolean
  var messageID: String
}

object Anon_ClosedByInboxSDK {
  @scala.inline
  def apply(closedByInboxSDK: Boolean, messageID: String): Anon_ClosedByInboxSDK = {
    val __obj = js.Dynamic.literal(closedByInboxSDK = closedByInboxSDK, messageID = messageID)
  
    __obj.asInstanceOf[Anon_ClosedByInboxSDK]
  }
}

