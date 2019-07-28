package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Login extends js.Object {
  var token: String
  var user: User
}

object Login {
  @scala.inline
  def apply(token: String, user: User): Login = {
    val __obj = js.Dynamic.literal(token = token, user = user)
  
    __obj.asInstanceOf[Login]
  }
}

