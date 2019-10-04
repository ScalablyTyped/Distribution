package typings.jose.joseMod

import typings.jose.joseStrings.EC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWKECKey
  extends KeyParameters
     with JSONWebKey {
  var crv: ECCurve
  var d: js.UndefOr[String] = js.undefined
  var kty: EC
  var x: String
  var y: String
}

object JWKECKey {
  @scala.inline
  def apply(
    crv: ECCurve,
    kty: EC,
    x: String,
    y: String,
    alg: String = null,
    d: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    use: use = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null
  ): JWKECKey = {
    val __obj = js.Dynamic.literal(crv = crv, kty = kty, x = x, y = y)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (d != null) __obj.updateDynamic("d")(d)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (use != null) __obj.updateDynamic("use")(use)
    if (x5c != null) __obj.updateDynamic("x5c")(x5c)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    __obj.asInstanceOf[JWKECKey]
  }
}

