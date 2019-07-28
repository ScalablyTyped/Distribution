package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var keyType: KeyType
  var privateKey: Uint8Array
  var publicKey: Uint8Array
}

object KeyPair {
  @scala.inline
  def apply(keyType: KeyType, privateKey: Uint8Array, publicKey: Uint8Array): KeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType, privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[KeyPair]
  }
}

