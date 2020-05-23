package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Res extends js.Object {
  var res: String | ASN1Object
  var tst: String | ASN1Object
}

object Res {
  @scala.inline
  def apply(res: String | ASN1Object, tst: String | ASN1Object): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
}

