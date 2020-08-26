package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcrypto extends js.Object {
  def aes_decrypt(ins: String, keys: String, dpv: String): Double = js.native
  def aes_encrypt(ins: String, keys: String, dpv: String): Double = js.native
}

object Typeofcrypto {
  @scala.inline
  def apply(aes_decrypt: (String, String, String) => Double, aes_encrypt: (String, String, String) => Double): Typeofcrypto = {
    val __obj = js.Dynamic.literal(aes_decrypt = js.Any.fromFunction3(aes_decrypt), aes_encrypt = js.Any.fromFunction3(aes_encrypt))
    __obj.asInstanceOf[Typeofcrypto]
  }
  @scala.inline
  implicit class TypeofcryptoOps[Self <: Typeofcrypto] (val x: Self) extends AnyVal {
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
    def setAes_decrypt(value: (String, String, String) => Double): Self = this.set("aes_decrypt", js.Any.fromFunction3(value))
    @scala.inline
    def setAes_encrypt(value: (String, String, String) => Double): Self = this.set("aes_encrypt", js.Any.fromFunction3(value))
  }
  
}

