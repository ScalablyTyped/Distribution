package typings
package intercomDashClientLib.userMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var pages: intercomDashClientLib.Anon_Next
  var total_count: scala.Double
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.userDOTlist
  var users: js.Array[User]
}

object List {
  @scala.inline
  def apply(
    pages: intercomDashClientLib.Anon_Next,
    total_count: scala.Double,
    `type`: intercomDashClientLib.intercomDashClientLibStrings.userDOTlist,
    users: js.Array[User]
  ): List = {
    val __obj = js.Dynamic.literal(pages = pages, total_count = total_count, users = users)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[List]
  }
}

