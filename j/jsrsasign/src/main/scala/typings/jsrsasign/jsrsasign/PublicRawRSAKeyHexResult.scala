package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicRawRSAKeyHexResult extends js.Object {
  /** hexadecimal string of public exponent */
  var e: String
  /** hexadecimal string of public key */
  var n: String
}

object PublicRawRSAKeyHexResult {
  @scala.inline
  def apply(e: String, n: String): PublicRawRSAKeyHexResult = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicRawRSAKeyHexResult]
  }
}

