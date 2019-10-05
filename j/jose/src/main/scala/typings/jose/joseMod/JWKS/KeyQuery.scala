package typings.jose.joseMod.JWKS

import typings.jose.joseMod.BasicParameters
import typings.jose.joseMod.keyOperation
import typings.jose.joseMod.keyType
import typings.jose.joseMod.use
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyQuery extends BasicParameters {
  var kty: js.UndefOr[keyType] = js.undefined
  var x5t: js.UndefOr[String] = js.undefined
  var `x5t#S256`: js.UndefOr[String] = js.undefined
}

object KeyQuery {
  @scala.inline
  def apply(
    alg: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    kty: keyType = null,
    use: use = null,
    x5t: String = null,
    `x5t#S256`: String = null
  ): KeyQuery = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (kty != null) __obj.updateDynamic("kty")(kty)
    if (use != null) __obj.updateDynamic("use")(use)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    __obj.asInstanceOf[KeyQuery]
  }
}

