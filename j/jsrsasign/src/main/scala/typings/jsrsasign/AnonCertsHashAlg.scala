package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertsHashAlg extends js.Object {
  var certs: js.Array[String]
  var hashAlg: String
  var sigAlg: String
  var signerCert: String
  var signerPrvKey: String
}

object AnonCertsHashAlg {
  @scala.inline
  def apply(certs: js.Array[String], hashAlg: String, sigAlg: String, signerCert: String, signerPrvKey: String): AnonCertsHashAlg = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCertsHashAlg]
  }
}

