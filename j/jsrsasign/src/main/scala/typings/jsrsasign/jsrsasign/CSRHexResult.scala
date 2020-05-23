package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSRHexResult extends js.Object {
  /** hexadecimal string of subject public key in PKCS#8 */
  var p8pubkeyhex: String
}

object CSRHexResult {
  @scala.inline
  def apply(p8pubkeyhex: String): CSRHexResult = {
    val __obj = js.Dynamic.literal(p8pubkeyhex = p8pubkeyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRHexResult]
  }
}

