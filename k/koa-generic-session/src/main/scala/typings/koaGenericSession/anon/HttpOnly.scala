package typings.koaGenericSession.anon

import typings.koaGenericSession.koaGenericSessionStrings.lax
import typings.koaGenericSession.koaGenericSessionStrings.none
import typings.koaGenericSession.koaGenericSessionStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOnly extends js.Object {
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double | Null] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var rewrite: js.UndefOr[Boolean] = js.undefined
  var sameSite: js.UndefOr[Boolean | lax | none | strict] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var signed: js.UndefOr[Boolean] = js.undefined
}

object HttpOnly {
  @scala.inline
  def apply(
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Null | Double] = js.undefined,
    path: String = null,
    rewrite: js.UndefOr[Boolean] = js.undefined,
    sameSite: Boolean | lax | none | strict = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    signed: js.UndefOr[Boolean] = js.undefined
  ): HttpOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(rewrite)) __obj.updateDynamic("rewrite")(rewrite.get.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOnly]
  }
}

