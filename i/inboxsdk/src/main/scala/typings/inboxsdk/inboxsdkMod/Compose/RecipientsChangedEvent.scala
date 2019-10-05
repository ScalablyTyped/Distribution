package typings.inboxsdk.inboxsdkMod.Compose

import typings.inboxsdk.Anon_Added
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientsChangedEvent extends js.Object {
  var bcc: Anon_Added
  var cc: Anon_Added
  var to: Anon_Added
}

object RecipientsChangedEvent {
  @scala.inline
  def apply(bcc: Anon_Added, cc: Anon_Added, to: Anon_Added): RecipientsChangedEvent = {
    val __obj = js.Dynamic.literal(bcc = bcc, cc = cc, to = to)
  
    __obj.asInstanceOf[RecipientsChangedEvent]
  }
}

