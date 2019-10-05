package typings.inboxsdk

import typings.inboxsdk.inboxsdkMod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contact extends js.Object {
  var contact: Contact
}

object Anon_Contact {
  @scala.inline
  def apply(contact: Contact): Anon_Contact = {
    val __obj = js.Dynamic.literal(contact = contact)
  
    __obj.asInstanceOf[Anon_Contact]
  }
}

