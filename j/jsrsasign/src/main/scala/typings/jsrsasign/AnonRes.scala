package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRes extends js.Object {
  var res: String | ASN1Object
  var tst: String | ASN1Object
}

object AnonRes {
  @scala.inline
  def apply(res: String | ASN1Object, tst: String | ASN1Object): AnonRes = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRes]
  }
}

