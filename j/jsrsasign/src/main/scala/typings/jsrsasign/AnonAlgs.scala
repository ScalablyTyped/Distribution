package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgs extends js.Object {
  var algs: String
  var certs: String
  var obj: SignedData
  var revs: String
  var si: js.Array[SignerInfo]
  var version: String
}

object AnonAlgs {
  @scala.inline
  def apply(
    algs: String,
    certs: String,
    obj: SignedData,
    revs: String,
    si: js.Array[SignerInfo],
    version: String
  ): AnonAlgs = {
    val __obj = js.Dynamic.literal(algs = algs.asInstanceOf[js.Any], certs = certs.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], revs = revs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgs]
  }
}

