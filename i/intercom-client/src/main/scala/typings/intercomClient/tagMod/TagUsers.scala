package typings.intercomClient.tagMod

import typings.intercomClient.userMod.UserIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagUsers extends TagOper {
  var name: String
  var users: js.Array[UserIdentifier]
}

object TagUsers {
  @scala.inline
  def apply(name: String, users: js.Array[UserIdentifier]): TagUsers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagUsers]
  }
}

