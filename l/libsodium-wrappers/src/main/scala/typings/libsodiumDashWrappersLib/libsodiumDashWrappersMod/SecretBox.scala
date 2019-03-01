package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecretBox extends js.Object {
  var cipher: stdLib.Uint8Array
  var mac: stdLib.Uint8Array
}

object SecretBox {
  @scala.inline
  def apply(cipher: stdLib.Uint8Array, mac: stdLib.Uint8Array): SecretBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cipher")(cipher)
    __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[SecretBox]
  }
}

