package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDpobj extends js.Object {
  var dpobj: ASN1Object
}

object AnonDpobj {
  @scala.inline
  def apply(dpobj: ASN1Object): AnonDpobj = {
    val __obj = js.Dynamic.literal(dpobj = dpobj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDpobj]
  }
}

