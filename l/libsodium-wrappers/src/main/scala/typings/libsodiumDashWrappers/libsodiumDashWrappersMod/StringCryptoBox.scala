package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCryptoBox extends js.Object {
  var ciphertext: String
  var mac: String
}

object StringCryptoBox {
  @scala.inline
  def apply(ciphertext: String, mac: String): StringCryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StringCryptoBox]
  }
}

