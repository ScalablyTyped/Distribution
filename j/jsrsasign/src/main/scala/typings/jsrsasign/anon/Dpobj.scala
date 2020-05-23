package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dpobj extends js.Object {
  var dpobj: ASN1Object
}

object Dpobj {
  @scala.inline
  def apply(dpobj: ASN1Object): Dpobj = {
    val __obj = js.Dynamic.literal(dpobj = dpobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dpobj]
  }
}

