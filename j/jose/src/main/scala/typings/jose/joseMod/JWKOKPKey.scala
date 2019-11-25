package typings.jose.joseMod

import typings.jose.joseStrings.OKP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWKOKPKey
  extends KeyParameters
     with JSONWebKey {
  var crv: OKPCurve
  var d: js.UndefOr[String] = js.undefined
  var kty: OKP
  var x: String
}

object JWKOKPKey {
  @scala.inline
  def apply(
    crv: OKPCurve,
    kty: OKP,
    x: String,
    alg: String = null,
    d: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    use: use = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null
  ): JWKOKPKey = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (x5c != null) __obj.updateDynamic("x5c")(x5c.asInstanceOf[js.Any])
    if (x5t != null) __obj.updateDynamic("x5t")(x5t.asInstanceOf[js.Any])
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWKOKPKey]
  }
}

