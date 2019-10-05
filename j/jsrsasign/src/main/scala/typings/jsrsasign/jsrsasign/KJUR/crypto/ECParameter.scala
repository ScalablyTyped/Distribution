package typings.jsrsasign.jsrsasign.KJUR.crypto

import typings.jsrsasign.jsrsasign.BigInteger
import typings.jsrsasign.jsrsasign.ECCurveFp
import typings.jsrsasign.jsrsasign.ECPointFp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECParameter extends js.Object {
  var G: ECPointFp
  var curve: ECCurveFp
  var h: BigInteger
  var info: js.UndefOr[String] = js.undefined
  var keylen: Double
  var n: BigInteger
  var name: String
  var oid: js.UndefOr[String] = js.undefined
}

object ECParameter {
  @scala.inline
  def apply(
    G: ECPointFp,
    curve: ECCurveFp,
    h: BigInteger,
    keylen: Double,
    n: BigInteger,
    name: String,
    info: String = null,
    oid: String = null
  ): ECParameter = {
    val __obj = js.Dynamic.literal(G = G, curve = curve, h = h, keylen = keylen, n = n, name = name)
    if (info != null) __obj.updateDynamic("info")(info)
    if (oid != null) __obj.updateDynamic("oid")(oid)
    __obj.asInstanceOf[ECParameter]
  }
}

