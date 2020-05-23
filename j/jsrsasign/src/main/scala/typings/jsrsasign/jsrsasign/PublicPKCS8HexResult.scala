package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicPKCS8HexResult extends js.Object {
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String
  /** hexadecimal string of OID of ECC curve name, parameter SEQUENCE of DSA or null */
  var algparam: String
  /** hexadecimal string of public key */
  var key: String
}

object PublicPKCS8HexResult {
  @scala.inline
  def apply(algoid: String, algparam: String, key: String): PublicPKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicPKCS8HexResult]
  }
}

