package typings.libsodiumDashWrappers

import typings.libsodiumDashWrappers.libsodiumDashWrappersMod.StateAddress
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: Uint8Array
  var state: StateAddress
}

object Anon_Header {
  @scala.inline
  def apply(header: Uint8Array, state: StateAddress): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Header]
  }
}

