package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientsChangedEvent extends js.Object {
  var bcc: inboxsdkLib.Anon_Added
  var cc: inboxsdkLib.Anon_Added
  var to: inboxsdkLib.Anon_Added
}

object RecipientsChangedEvent {
  @scala.inline
  def apply(bcc: inboxsdkLib.Anon_Added, cc: inboxsdkLib.Anon_Added, to: inboxsdkLib.Anon_Added): RecipientsChangedEvent = {
    val __obj = js.Dynamic.literal(bcc = bcc, cc = cc, to = to)
  
    __obj.asInstanceOf[RecipientsChangedEvent]
  }
}

