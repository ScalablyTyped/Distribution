package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadDescriptor extends js.Object {
  var gmailThreadId: js.UndefOr[java.lang.String] = js.undefined
  var rfcMessageId: js.UndefOr[java.lang.String] = js.undefined
}

object ThreadDescriptor {
  @scala.inline
  def apply(gmailThreadId: java.lang.String = null, rfcMessageId: java.lang.String = null): ThreadDescriptor = {
    val __obj = js.Dynamic.literal()
    if (gmailThreadId != null) __obj.updateDynamic("gmailThreadId")(gmailThreadId)
    if (rfcMessageId != null) __obj.updateDynamic("rfcMessageId")(rfcMessageId)
    __obj.asInstanceOf[ThreadDescriptor]
  }
}

