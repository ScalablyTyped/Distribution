package typings.inboxsdk.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadDescriptor extends js.Object {
  var gmailThreadId: js.UndefOr[String] = js.undefined
  var rfcMessageId: js.UndefOr[String] = js.undefined
}

object ThreadDescriptor {
  @scala.inline
  def apply(gmailThreadId: String = null, rfcMessageId: String = null): ThreadDescriptor = {
    val __obj = js.Dynamic.literal()
    if (gmailThreadId != null) __obj.updateDynamic("gmailThreadId")(gmailThreadId.asInstanceOf[js.Any])
    if (rfcMessageId != null) __obj.updateDynamic("rfcMessageId")(rfcMessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDescriptor]
  }
}

