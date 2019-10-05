package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sn extends js.Object {
  var sn: IntegerParam
  var time: StringParam
}

object Anon_Sn {
  @scala.inline
  def apply(sn: IntegerParam, time: StringParam): Anon_Sn = {
    val __obj = js.Dynamic.literal(sn = sn, time = time)
  
    __obj.asInstanceOf[Anon_Sn]
  }
}

