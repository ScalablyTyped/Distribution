package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyInfoPropOfCertPEMResult extends js.Object {
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null
  /** hexadecimal string of key in the certificate */
  var keyhex: String
}

object PublicKeyInfoPropOfCertPEMResult {
  @scala.inline
  def apply(algoid: String, keyhex: String, algparam: String = null): PublicKeyInfoPropOfCertPEMResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyhex = keyhex.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfoPropOfCertPEMResult]
  }
}

