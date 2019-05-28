package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcrypto extends js.Object {
  def aes_decrypt(ins: java.lang.String, keys: java.lang.String, dpv: java.lang.String): scala.Double
  def aes_encrypt(ins: java.lang.String, keys: java.lang.String, dpv: java.lang.String): scala.Double
}

object Typeofcrypto {
  @scala.inline
  def apply(
    aes_decrypt: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    aes_encrypt: (java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Typeofcrypto = {
    val __obj = js.Dynamic.literal(aes_decrypt = js.Any.fromFunction3(aes_decrypt), aes_encrypt = js.Any.fromFunction3(aes_encrypt))
  
    __obj.asInstanceOf[Typeofcrypto]
  }
}

