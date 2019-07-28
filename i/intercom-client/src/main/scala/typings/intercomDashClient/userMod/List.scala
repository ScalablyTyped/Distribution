package typings.intercomDashClient.userMod

import typings.intercomDashClient.Anon_Next
import typings.intercomDashClient.intercomDashClientStrings.userDOTlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends js.Object {
  var pages: Anon_Next
  var total_count: Double
  var `type`: userDOTlist
  var users: js.Array[User]
}

object List {
  @scala.inline
  def apply(pages: Anon_Next, total_count: Double, `type`: userDOTlist, users: js.Array[User]): List = {
    val __obj = js.Dynamic.literal(pages = pages, total_count = total_count, users = users)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[List]
  }
}

