package typings
package libsodiumDashWrappersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeaderState extends js.Object {
  var header: java.lang.String
  var state: libsodiumDashWrappersLib.libsodiumDashWrappersMod.state_address
}

object Anon_HeaderState {
  @scala.inline
  def apply(header: java.lang.String, state: libsodiumDashWrappersLib.libsodiumDashWrappersMod.state_address): Anon_HeaderState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_HeaderState]
  }
}

