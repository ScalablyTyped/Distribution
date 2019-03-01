package typings
package intercomDashClientLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagUsers extends TagOper {
  var name: java.lang.String
  var users: js.Array[intercomDashClientLib.userMod.UserIdentifier]
}

object TagUsers {
  @scala.inline
  def apply(name: java.lang.String, users: js.Array[intercomDashClientLib.userMod.UserIdentifier]): TagUsers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[TagUsers]
  }
}

