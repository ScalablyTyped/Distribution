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
    val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], keylen = keylen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (oid != null) __obj.updateDynamic("oid")(oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECParameter]
  }
}

