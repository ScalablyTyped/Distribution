package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sn extends js.Object {
  var sn: IntegerParam
  var time: StringParam
}

object Sn {
  @scala.inline
  def apply(sn: IntegerParam, time: StringParam): Sn = {
    val __obj = js.Dynamic.literal(sn = sn.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sn]
  }
}

