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
    x5tNumbersignS256: String = null,
    x5u: String = null
  ): JWK = {
    val __obj = js.Dynamic.literal(kty = kty.asInstanceOf[js.Any])
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (x5c != null) __obj.updateDynamic("x5c")(x5c.asInstanceOf[js.Any])
    if (x5t != null) __obj.updateDynamic("x5t")(x5t.asInstanceOf[js.Any])
    if (x5tNumbersignS256 != null) __obj.updateDynamic("x5t#S256")(x5tNumbersignS256.asInstanceOf[js.Any])
    if (x5u != null) __obj.updateDynamic("x5u")(x5u.asInstanceOf[js.Any])
    __obj.asInstanceOf[JWK]
  }
}

