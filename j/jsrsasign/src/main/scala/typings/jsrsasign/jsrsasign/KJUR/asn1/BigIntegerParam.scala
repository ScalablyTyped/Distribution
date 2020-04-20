package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigIntegerParam extends js.Object {
  var bigint: BigInteger
}

object BigIntegerParam {
  @scala.inline
  def apply(bigint: BigInteger): BigIntegerParam = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntegerParam]
  }
}

