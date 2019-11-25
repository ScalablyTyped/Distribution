package typings.koaDashGenericDashSession

import typings.koaDashGenericDashSession.koaDashGenericDashSessionStrings.lax
import typings.koaDashGenericDashSession.koaDashGenericDashSessionStrings.none
import typings.koaDashGenericDashSession.koaDashGenericDashSessionStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpOnly extends js.Object {
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var rewrite: js.UndefOr[Boolean] = js.undefined
  var sameSite: js.UndefOr[Boolean | lax | none | strict] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
}

object Anon_HttpOnly {
  @scala.inline
  def apply(
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    path: String = null,
    rewrite: js.UndefOr[Boolean] = js.undefined,
    sameSite: Boolean | lax | none | strict = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    signed: js.UndefOr[Boolean] = js.undefined
  ): Anon_HttpOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(rewrite)) __obj.updateDynamic("rewrite")(rewrite.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HttpOnly]
  }
}

