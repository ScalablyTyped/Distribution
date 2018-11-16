package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContactHoverEvent extends js.Object {
  var contact: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact
  var contactType: inboxsdkLib.inboxsdkLibStrings.sender | inboxsdkLib.inboxsdkLibStrings.recipient
  var messageView: MessageView
  var threadView: ThreadView
}

