package typings.jose.joseMod

import typings.jose.joseStrings.RSA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWKRSAKey
  extends KeyParameters
     with JSONWebKey {
  var d: js.UndefOr[String] = js.undefined
  var dp: js.UndefOr[String] = js.undefined
  var dq: js.UndefOr[String] = js.undefined
  var e: String
  var kty: RSA
  var n: String
  var p: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var qi: js.UndefOr[String] = js.undefined
}

object JWKRSAKey {
  @scala.inline
  def apply(
    e: String,
    kty: RSA,
    n: String,
    alg: String = null,
    d: String = null,
    dp: String = null,
    dq: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    p: String = null,
    q: String = null,
    qi: String = null,
    use: use = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null
  ): JWKRSAKey = {
    val __obj = js.Dynamic.literal(e = e, kty = kty, n = n)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (d != null) __obj.updateDynamic("d")(d)
    if (dp != null) __obj.updateDynamic("dp")(dp)
    if (dq != null) __obj.updateDynamic("dq")(dq)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (p != null) __obj.updateDynamic("p")(p)
    if (q != null) __obj.updateDynamic("q")(q)
    if (qi != null) __obj.updateDynamic("qi")(qi)
    if (use != null) __obj.updateDynamic("use")(use)
    if (x5c != null) __obj.updateDynamic("x5c")(x5c)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    __obj.asInstanceOf[JWKRSAKey]
  }
}

