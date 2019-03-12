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
  def apply(decrypt: java.lang.String => js.Object, encrypt: js.Object => java.lang.String): KmsJson = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
  
    __obj.asInstanceOf[KmsJson]
  }
}

