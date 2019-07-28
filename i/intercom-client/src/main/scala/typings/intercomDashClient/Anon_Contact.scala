package typings.intercomDashClient

import typings.intercomDashClient.leadMod.LeadIdentifier
import typings.intercomDashClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contact extends js.Object {
  var contact: LeadIdentifier
  var user: UserIdentifier
}

object Anon_Contact {
  @scala.inline
  def apply(contact: LeadIdentifier, user: UserIdentifier): Anon_Contact = {
    val __obj = js.Dynamic.literal(contact = contact, user = user)
  
    __obj.asInstanceOf[Anon_Contact]
  }
}

