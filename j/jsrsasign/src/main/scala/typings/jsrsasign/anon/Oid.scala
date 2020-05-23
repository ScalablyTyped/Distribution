package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oid extends js.Object {
  var hash: Alg | typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier
  var oid: String
}

object Oid {
  @scala.inline
  def apply(hash: Alg | typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier, oid: String): Oid = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
}

