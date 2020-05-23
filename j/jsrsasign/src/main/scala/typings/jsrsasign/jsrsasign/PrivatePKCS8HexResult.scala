package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivatePKCS8HexResult extends js.Object {
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null
  /** string starting index of key in `pkcs8PrvHex` */
  var keyidx: String
}

object PrivatePKCS8HexResult {
  @scala.inline
  def apply(algoid: String, keyidx: String, algparam: String = null): PrivatePKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyidx = keyidx.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivatePKCS8HexResult]
  }
}

