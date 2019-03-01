package typings
package lilDashUriLib.lilDashUriMod.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credentials map
  */
trait Credentials extends js.Object {
  var password: java.lang.String
  var user: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(password: java.lang.String, user: java.lang.String): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Credentials]
  }
}

