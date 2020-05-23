package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcrypto extends js.Object {
  def aes_decrypt(ins: String, keys: String, dpv: String): Double
  def aes_encrypt(ins: String, keys: String, dpv: String): Double
}

object Typeofcrypto {
  @scala.inline
  def apply(aes_decrypt: (String, String, String) => Double, aes_encrypt: (String, String, String) => Double): Typeofcrypto = {
    val __obj = js.Dynamic.literal(aes_decrypt = js.Any.fromFunction3(aes_decrypt), aes_encrypt = js.Any.fromFunction3(aes_encrypt))
    __obj.asInstanceOf[Typeofcrypto]
  }
}

