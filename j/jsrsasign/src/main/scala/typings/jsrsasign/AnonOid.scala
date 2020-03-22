package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOid extends js.Object {
  var hash: AnonAlg | SignaturePolicyIdentifier
  var oid: String
}

object AnonOid {
  @scala.inline
  def apply(hash: AnonAlg | SignaturePolicyIdentifier, oid: String): AnonOid = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOid]
  }
}

