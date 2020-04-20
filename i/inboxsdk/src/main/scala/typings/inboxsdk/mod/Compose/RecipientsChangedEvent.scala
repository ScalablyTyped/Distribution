package typings.inboxsdk.mod.Compose

import typings.inboxsdk.AnonAdded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientsChangedEvent extends js.Object {
  var bcc: AnonAdded
  var cc: AnonAdded
  var to: AnonAdded
}

object RecipientsChangedEvent {
  @scala.inline
  def apply(bcc: AnonAdded, cc: AnonAdded, to: AnonAdded): RecipientsChangedEvent = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEvent]
  }
}

