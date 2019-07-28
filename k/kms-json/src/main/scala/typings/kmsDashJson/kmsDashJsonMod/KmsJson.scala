package typings.kmsDashJson.kmsDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmsJson extends js.Object {
  def decrypt(cipherText: String): js.Object
  def encrypt(inputJson: js.Object): String
}

object KmsJson {
  @scala.inline
  def apply(decrypt: String => js.Object, encrypt: js.Object => String): KmsJson = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
  
    __obj.asInstanceOf[KmsJson]
  }
}

