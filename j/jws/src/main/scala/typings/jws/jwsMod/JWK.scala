package typings.jws.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWK extends CertificateProperties {
  var alg: js.UndefOr[Algorithm] = js.undefined
  var key_ops: js.UndefOr[js.Array[String]] = js.undefined
  var kty: String
  var use: js.UndefOr[String] = js.undefined
}

object JWK {
  @scala.inline
  def apply(
    kty: String,
    alg: Algorithm = null,
    key_ops: js.Array[String] = null,
    kid: String = null,
    use: String = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null,
    x5u: String = null
  ): JWK = {
    val __obj = js.Dynamic.literal(kty = kty)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (use != null) __obj.updateDynamic("use")(use)
    if (x5c != null) __obj.updateDynamic("x5c")(x5c)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    if (x5u != null) __obj.updateDynamic("x5u")(x5u)
    __obj.asInstanceOf[JWK]
  }
}

