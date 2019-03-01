package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCryptoBox extends js.Object {
  var ciphertext: java.lang.String
  var mac: java.lang.String
}

object StringCryptoBox {
  @scala.inline
  def apply(ciphertext: java.lang.String, mac: java.lang.String): StringCryptoBox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ciphertext")(ciphertext)
    __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[StringCryptoBox]
  }
}

