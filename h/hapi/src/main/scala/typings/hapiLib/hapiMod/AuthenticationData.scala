package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationData extends js.Object {
  var artifacts: js.UndefOr[js.Object] = js.undefined
  var credentials: AuthCredentials
}

object AuthenticationData {
  @scala.inline
  def apply(credentials: AuthCredentials, artifacts: js.Object = null): AuthenticationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("credentials")(credentials)
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts)
    __obj.asInstanceOf[AuthenticationData]
  }
}

