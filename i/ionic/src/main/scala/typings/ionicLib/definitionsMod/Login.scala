package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Login extends js.Object {
  var token: java.lang.String
  var user: User
}

object Login {
  @scala.inline
  def apply(token: java.lang.String, user: User): Login = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Login]
  }
}

