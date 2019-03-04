package typings
package intercomDashClientLib.leadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var contacts: js.Array[Lead]
  var pages: intercomDashClientLib.Anon_Next
  var total_count: scala.Double
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.userDOTlist
}

object List {
  @scala.inline
  def apply(
    contacts: js.Array[Lead],
    pages: intercomDashClientLib.Anon_Next,
    total_count: scala.Double,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.userDOTlist
  ): List = {
    val __obj = js.Dynamic.literal(contacts = contacts, pages = pages, total_count = total_count)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[List]
  }
}

