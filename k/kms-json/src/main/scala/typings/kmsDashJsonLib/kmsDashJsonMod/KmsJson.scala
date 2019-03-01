package typings
package kmsDashJsonLib.kmsDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmsJson extends js.Object {
  def decrypt(cipherText: java.lang.String): js.Object
  def encrypt(inputJson: js.Object): java.lang.String
}

object KmsJson {
  @scala.inline
  def apply(
    decrypt: js.Function1[java.lang.String, js.Object],
    encrypt: js.Function1[js.Object, java.lang.String]
  ): KmsJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(decrypt)
    __obj.updateDynamic("encrypt")(encrypt)
    __obj.asInstanceOf[KmsJson]
  }
}

