package typings.jwkDashToDashPem.jwkDashToDashPemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivate extends JWK {
  var crv: String
  var d: String
  var kty: typings.jwkDashToDashPem.jwkDashToDashPemStrings.EC
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
}

object ECPrivate {
  @scala.inline
  def apply(
    crv: String,
    d: String,
    kty: typings.jwkDashToDashPem.jwkDashToDashPemStrings.EC,
    x: String = null,
    y: String = null
  ): ECPrivate = {
    val __obj = js.Dynamic.literal(crv = crv, d = d, kty = kty)
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ECPrivate]
  }
}

