package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookies extends js.Object {
  var cookies: js.UndefOr[js.Array[_]] = js.undefined
  var currentUserLiteral: js.UndefOr[String] = js.undefined
  var enableDoublecheck: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var model: js.UndefOr[js.Function0[Unit | String]] = js.undefined
  var overwriteExistingToken: js.UndefOr[Boolean] = js.undefined
  var params: js.UndefOr[js.Array[_]] = js.undefined
  var searchDefaultTokenKeys: js.UndefOr[Boolean] = js.undefined
}

object Anon_Cookies {
  @scala.inline
  def apply(
    cookies: js.Array[_] = null,
    currentUserLiteral: String = null,
    enableDoublecheck: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[_] = null,
    model: () => Unit | String = null,
    overwriteExistingToken: js.UndefOr[Boolean] = js.undefined,
    params: js.Array[_] = null,
    searchDefaultTokenKeys: js.UndefOr[Boolean] = js.undefined
  ): Anon_Cookies = {
    val __obj = js.Dynamic.literal()
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (currentUserLiteral != null) __obj.updateDynamic("currentUserLiteral")(currentUserLiteral.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDoublecheck)) __obj.updateDynamic("enableDoublecheck")(enableDoublecheck.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(js.Any.fromFunction0(model))
    if (!js.isUndefined(overwriteExistingToken)) __obj.updateDynamic("overwriteExistingToken")(overwriteExistingToken.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(searchDefaultTokenKeys)) __obj.updateDynamic("searchDefaultTokenKeys")(searchDefaultTokenKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cookies]
  }
}

