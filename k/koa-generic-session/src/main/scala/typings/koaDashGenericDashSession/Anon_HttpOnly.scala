package typings.koaDashGenericDashSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HttpOnly extends js.Object {
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var rewrite: js.UndefOr[Boolean] = js.undefined
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
    secure: js.UndefOr[Boolean] = js.undefined,
    signed: js.UndefOr[Boolean] = js.undefined
  ): Anon_HttpOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(rewrite)) __obj.updateDynamic("rewrite")(rewrite)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed)
    __obj.asInstanceOf[Anon_HttpOnly]
  }
}

