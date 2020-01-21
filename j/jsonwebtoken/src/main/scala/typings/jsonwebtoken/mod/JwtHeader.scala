package typings.jsonwebtoken.mod

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
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    if (jku != null) __obj.updateDynamic("jku")(jku.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (typ != null) __obj.updateDynamic("typ")(typ.asInstanceOf[js.Any])
    if (x5t != null) __obj.updateDynamic("x5t")(x5t.asInstanceOf[js.Any])
    if (x5u != null) __obj.updateDynamic("x5u")(x5u.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtHeader]
  }
}

