package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sign_state_address extends js.Object {
  var name: java.lang.String
}

object sign_state_address {
  @scala.inline
  def apply(name: java.lang.String): sign_state_address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[sign_state_address]
  }
}

