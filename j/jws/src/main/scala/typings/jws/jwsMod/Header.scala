package typings.jws.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends CertificateProperties {
  var alg: Algorithm
  var crit: js.UndefOr[js.Array[String]] = js.undefined
  var cty: js.UndefOr[String] = js.undefined
  var jwk: js.UndefOr[JWK] = js.undefined
  var typ: js.UndefOr[String] = js.undefined
}

object Header {
  @scala.inline
  def apply(
    alg: Algorithm,
    crit: js.Array[String] = null,
    cty: String = null,
    jwk: JWK = null,
    kid: String = null,
    typ: String = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null,
    x5u: String = null
  ): Header = {
    val __obj = js.Dynamic.literal(alg = alg)
    if (crit != null) __obj.updateDynamic("crit")(crit)
    if (cty != null) __obj.updateDynamic("cty")(cty)
    if (jwk != null) __obj.updateDynamic("jwk")(jwk)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (typ != null) __obj.updateDynamic("typ")(typ)
    if (x5c != null) __obj.updateDynamic("x5c")(x5c)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    if (x5u != null) __obj.updateDynamic("x5u")(x5u)
    __obj.asInstanceOf[Header]
  }
}

