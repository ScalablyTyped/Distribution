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
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    if (crit != null) __obj.updateDynamic("crit")(crit.asInstanceOf[js.Any])
    if (cty != null) __obj.updateDynamic("cty")(cty.asInstanceOf[js.Any])
    if (jwk != null) __obj.updateDynamic("jwk")(jwk.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (typ != null) __obj.updateDynamic("typ")(typ.asInstanceOf[js.Any])
    if (x5c != null) __obj.updateDynamic("x5c")(x5c.asInstanceOf[js.Any])
    if (x5t != null) __obj.updateDynamic("x5t")(x5t.asInstanceOf[js.Any])
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`.asInstanceOf[js.Any])
    if (x5u != null) __obj.updateDynamic("x5u")(x5u.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

