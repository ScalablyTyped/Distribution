package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  val data: js.UndefOr[AuthenticationData] = js.undefined
  val error: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
  val isAuth: hapiLib.hapiLibNumbers.`true`
}

object Auth {
  @scala.inline
  def apply(isAuth: hapiLib.hapiLibNumbers.`true`, data: AuthenticationData = null, error: stdLib.Error = null): Auth = {
    val __obj = js.Dynamic.literal(isAuth = isAuth)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Auth]
  }
}

