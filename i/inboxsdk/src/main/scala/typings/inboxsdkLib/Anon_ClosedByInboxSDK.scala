package typings
package inboxsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClosedByInboxSDK extends js.Object {
  var closedByInboxSDK: scala.Boolean
  var messageID: java.lang.String
}

object Anon_ClosedByInboxSDK {
  @scala.inline
  def apply(closedByInboxSDK: scala.Boolean, messageID: java.lang.String): Anon_ClosedByInboxSDK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closedByInboxSDK")(closedByInboxSDK)
    __obj.updateDynamic("messageID")(messageID)
    __obj.asInstanceOf[Anon_ClosedByInboxSDK]
  }
}

