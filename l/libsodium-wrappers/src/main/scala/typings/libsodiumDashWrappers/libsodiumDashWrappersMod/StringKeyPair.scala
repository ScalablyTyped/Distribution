package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringKeyPair extends js.Object {
  var keyType: KeyType
  var privateKey: String
  var publicKey: String
}

object StringKeyPair {
  @scala.inline
  def apply(keyType: KeyType, privateKey: String, publicKey: String): StringKeyPair = {
    val __obj = js.Dynamic.literal(keyType = keyType, privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[StringKeyPair]
  }
}

