package typings.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jwkToPem.mod.EC
  - typings.jwkToPem.mod.ECPrivate
  - typings.jwkToPem.mod.RSA
*/
trait JWK extends js.Object

object JWK {
  @scala.inline
  def EC(crv: String, kty: typings.jwkToPem.jwkToPemStrings.EC, x: String, y: String): JWK = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
  @scala.inline
  def ECPrivate(
    crv: String,
    d: String,
    kty: typings.jwkToPem.jwkToPemStrings.EC,
    x: String = null,
    y: String = null
  ): JWK = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
  @scala.inline
  def RSA(
    e: String,
    kty: typings.jwkToPem.jwkToPemStrings.RSA,
    n: String,
    d: String = null,
    dp: String = null,
    dq: String = null,
    p: String = null,
    q: String = null,
    qi: String = null
  ): JWK = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (dp != null) __obj.updateDynamic("dp")(dp.asInstanceOf[js.Any])
    if (dq != null) __obj.updateDynamic("dq")(dq.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (qi != null) __obj.updateDynamic("qi")(qi.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
}

