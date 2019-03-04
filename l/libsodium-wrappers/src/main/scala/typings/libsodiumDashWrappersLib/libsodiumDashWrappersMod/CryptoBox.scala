package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoBox extends js.Object {
  var ciphertext: stdLib.Uint8Array
  var mac: stdLib.Uint8Array
}

object CryptoBox {
  @scala.inline
  def apply(ciphertext: stdLib.Uint8Array, mac: stdLib.Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, mac = mac)
  
    __obj.asInstanceOf[CryptoBox]
  }
}

