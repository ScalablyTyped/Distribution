package typings.libsodiumDashWrappers

import typings.libsodiumDashWrappers.libsodiumDashWrappersMod.state_address
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: Uint8Array
  var state: state_address
}

object Anon_Header {
  @scala.inline
  def apply(header: Uint8Array, state: state_address): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header, state = state)
  
    __obj.asInstanceOf[Anon_Header]
  }
}

