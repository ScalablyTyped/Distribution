package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoBox extends js.Object {
  var ciphertext: Uint8Array
  var mac: Uint8Array
}

object CryptoBox {
  @scala.inline
  def apply(ciphertext: Uint8Array, mac: Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CryptoBox]
  }
}

