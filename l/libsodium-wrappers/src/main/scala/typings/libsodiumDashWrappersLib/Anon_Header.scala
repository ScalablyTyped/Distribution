package typings
package libsodiumDashWrappersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: stdLib.Uint8Array
  var state: libsodiumDashWrappersLib.libsodiumDashWrappersMod.state_address
}

object Anon_Header {
  @scala.inline
  def apply(header: stdLib.Uint8Array, state: libsodiumDashWrappersLib.libsodiumDashWrappersMod.state_address): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header, state = state)
  
    __obj.asInstanceOf[Anon_Header]
  }
}

