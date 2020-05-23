package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPointFp extends js.Object {
  var curve: ECFieldElementFp
  var x: ECFieldElementFp
  var y: ECFieldElementFp
  var z: BigInteger
  var zinv: BigInteger | Null
}

object ECPointFp {
  @scala.inline
  def apply(
    curve: ECFieldElementFp,
    x: ECFieldElementFp,
    y: ECFieldElementFp,
    z: BigInteger,
    zinv: BigInteger = null
  ): ECPointFp = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], zinv = zinv.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPointFp]
  }
}

