package typings.jwkDashToDashPem.jwkDashToDashPemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSA extends JWK {
  var d: js.UndefOr[String] = js.undefined
  var dp: js.UndefOr[String] = js.undefined
  var dq: js.UndefOr[String] = js.undefined
  var e: String
  var kty: typings.jwkDashToDashPem.jwkDashToDashPemStrings.RSA
  var n: String
  var p: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var qi: js.UndefOr[String] = js.undefined
}

object RSA {
  @scala.inline
  def apply(
    e: String,
    kty: typings.jwkDashToDashPem.jwkDashToDashPemStrings.RSA,
    n: String,
    d: String = null,
    dp: String = null,
    dq: String = null,
    p: String = null,
    q: String = null,
    qi: String = null
  ): RSA = {
    val __obj = js.Dynamic.literal(e = e, kty = kty, n = n)
    if (d != null) __obj.updateDynamic("d")(d)
    if (dp != null) __obj.updateDynamic("dp")(dp)
    if (dq != null) __obj.updateDynamic("dq")(dq)
    if (p != null) __obj.updateDynamic("p")(p)
    if (q != null) __obj.updateDynamic("q")(q)
    if (qi != null) __obj.updateDynamic("qi")(qi)
    __obj.asInstanceOf[RSA]
  }
}

