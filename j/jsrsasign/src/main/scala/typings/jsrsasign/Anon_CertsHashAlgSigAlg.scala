package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.TSTInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertsHashAlgSigAlg extends js.Object {
  var certs: js.Array[String]
  var hashAlg: String
  var sigAlg: String
  var signerCert: String
  var signerPrvKey: String
  var tstInfo: TSTInfo
}

object Anon_CertsHashAlgSigAlg {
  @scala.inline
  def apply(
    certs: js.Array[String],
    hashAlg: String,
    sigAlg: String,
    signerCert: String,
    signerPrvKey: String,
    tstInfo: TSTInfo
  ): Anon_CertsHashAlgSigAlg = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], sigAlg = sigAlg.asInstanceOf[js.Any], signerCert = signerCert.asInstanceOf[js.Any], signerPrvKey = signerPrvKey.asInstanceOf[js.Any], tstInfo = tstInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CertsHashAlgSigAlg]
  }
}

