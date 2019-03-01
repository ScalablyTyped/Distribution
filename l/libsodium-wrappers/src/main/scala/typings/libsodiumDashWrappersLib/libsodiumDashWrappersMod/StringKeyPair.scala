package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringKeyPair extends js.Object {
  var keyType: KeyType
  var privateKey: java.lang.String
  var publicKey: java.lang.String
}

object StringKeyPair {
  @scala.inline
  def apply(keyType: KeyType, privateKey: java.lang.String, publicKey: java.lang.String): StringKeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyType")(keyType)
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[StringKeyPair]
  }
}

