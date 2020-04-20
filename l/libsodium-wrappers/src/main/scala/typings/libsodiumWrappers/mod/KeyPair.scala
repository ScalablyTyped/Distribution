package typings.libsodiumWrappers.mod

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
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
}

