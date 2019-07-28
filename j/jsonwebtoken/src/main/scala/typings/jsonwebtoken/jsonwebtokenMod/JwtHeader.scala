package typings.jsonwebtoken.jsonwebtokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwtHeader extends js.Object {
  var alg: String
  var jku: js.UndefOr[String] = js.undefined
  var kid: js.UndefOr[String] = js.undefined
  var typ: js.UndefOr[String] = js.undefined
  var x5t: js.UndefOr[String] = js.undefined
  var x5u: js.UndefOr[String] = js.undefined
}

object JwtHeader {
  @scala.inline
  def apply(
    alg: String,
    jku: String = null,
    kid: String = null,
    typ: String = null,
    x5t: String = null,
    x5u: String = null
  ): JwtHeader = {
    val __obj = js.Dynamic.literal(alg = alg)
    if (jku != null) __obj.updateDynamic("jku")(jku)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (typ != null) __obj.updateDynamic("typ")(typ)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (x5u != null) __obj.updateDynamic("x5u")(x5u)
    __obj.asInstanceOf[JwtHeader]
  }
}

