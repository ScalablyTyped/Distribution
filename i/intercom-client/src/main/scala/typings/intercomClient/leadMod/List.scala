package typings.intercomClient.leadMod

import typings.intercomClient.anon.Next
import typings.intercomClient.intercomClientStrings.userDotlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var contacts: js.Array[Lead]
  var pages: Next
  var total_count: Double
  var `type`: userDotlist
}

object List {
  @scala.inline
  def apply(contacts: js.Array[Lead], pages: Next, total_count: Double, `type`: userDotlist): List = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

