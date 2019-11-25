package typings.intercomDashClient.leadMod

import typings.intercomDashClient.Anon_Next
import typings.intercomDashClient.intercomDashClientStrings.userDOTlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var contacts: js.Array[Lead]
  var pages: Anon_Next
  var total_count: Double
  var `type`: userDOTlist
}

object List {
  @scala.inline
  def apply(contacts: js.Array[Lead], pages: Anon_Next, total_count: Double, `type`: userDOTlist): List = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

