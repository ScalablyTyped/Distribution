package typings.inboxsdk.mod.Compose

import typings.inboxsdk.anon.Added
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientsChangedEvent extends js.Object {
  var bcc: Added
  var cc: Added
  var to: Added
}

object RecipientsChangedEvent {
  @scala.inline
  def apply(bcc: Added, cc: Added, to: Added): RecipientsChangedEvent = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientsChangedEvent]
  }
}

