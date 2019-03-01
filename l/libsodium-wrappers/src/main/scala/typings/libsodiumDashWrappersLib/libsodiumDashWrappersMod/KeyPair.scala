package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var keyType: KeyType
  var privateKey: stdLib.Uint8Array
  var publicKey: stdLib.Uint8Array
}

object KeyPair {
  @scala.inline
  def apply(keyType: KeyType, privateKey: stdLib.Uint8Array, publicKey: stdLib.Uint8Array): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyType")(keyType)
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[KeyPair]
  }
}

