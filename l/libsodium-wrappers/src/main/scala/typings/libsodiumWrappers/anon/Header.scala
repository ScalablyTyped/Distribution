package typings.libsodiumWrappers.anon

import typings.libsodiumWrappers.mod.StateAddress
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var header: Uint8Array
  var state: StateAddress
}

object Header {
  @scala.inline
  def apply(header: Uint8Array, state: StateAddress): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

