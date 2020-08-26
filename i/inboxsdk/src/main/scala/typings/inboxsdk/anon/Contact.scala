package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
  var contact: typings.inboxsdk.mod.Common.Contact = js.native
}

object Contact {
  @scala.inline
  def apply(contact: typings.inboxsdk.mod.Common.Contact): Contact = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContact(value: typings.inboxsdk.mod.Common.Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
  }
  
}

