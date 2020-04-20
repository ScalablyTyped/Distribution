package typings.inboxsdk

import typings.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContact extends js.Object {
  var contact: Contact
}

object AnonContact {
  @scala.inline
  def apply(contact: Contact): AnonContact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContact]
  }
}

