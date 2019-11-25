package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretBox extends js.Object {
  var cipher: Uint8Array
  var mac: Uint8Array
}

object SecretBox {
  @scala.inline
  def apply(cipher: Uint8Array, mac: Uint8Array): SecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecretBox]
  }
}

