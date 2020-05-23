package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contact extends js.Object {
  var contact: typings.inboxsdk.mod.Common.Contact
}

object Contact {
  @scala.inline
  def apply(contact: typings.inboxsdk.mod.Common.Contact): Contact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
}

