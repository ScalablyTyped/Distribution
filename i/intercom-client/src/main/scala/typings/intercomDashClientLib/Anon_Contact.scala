package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contact extends js.Object {
  var contact: intercomDashClientLib.leadMod.LeadIdentifier
  var user: intercomDashClientLib.userMod.UserIdentifier
}

object Anon_Contact {
  @scala.inline
  def apply(
    contact: intercomDashClientLib.leadMod.LeadIdentifier,
    user: intercomDashClientLib.userMod.UserIdentifier
  ): Anon_Contact = {
    val __obj = js.Dynamic.literal(contact = contact, user = user)
  
    __obj.asInstanceOf[Anon_Contact]
  }
}

