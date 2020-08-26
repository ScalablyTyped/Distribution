package typings.kmsJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmsJson extends js.Object {
  def decrypt(cipherText: String): js.Object = js.native
  def encrypt(inputJson: js.Object): String = js.native
}

object KmsJson {
  @scala.inline
  def apply(decrypt: String => js.Object, encrypt: js.Object => String): KmsJson = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[KmsJson]
  }
  @scala.inline
  implicit class KmsJsonOps[Self <: KmsJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecrypt(value: String => js.Object): Self = this.set("decrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setEncrypt(value: js.Object => String): Self = this.set("encrypt", js.Any.fromFunction1(value))
  }
  
}

