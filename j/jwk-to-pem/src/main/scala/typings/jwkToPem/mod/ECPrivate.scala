package typings.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECPrivate extends JWK {
  var crv: String
  var d: String
  var kty: typings.jwkToPem.jwkToPemStrings.EC
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
}

object ECPrivate {
  @scala.inline
  def apply(
    crv: String,
    d: String,
    kty: typings.jwkToPem.jwkToPemStrings.EC,
    x: String = null,
    y: String = null
  ): ECPrivate = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECPrivate]
  }
}

