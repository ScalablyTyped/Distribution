package typings.jsDashDataDashHttp.jsDashDataDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionOpts extends js.Object {
  var adapter: js.UndefOr[String] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
  var request: js.UndefOr[js.Function] = js.undefined
  var response: js.UndefOr[js.Function] = js.undefined
  var responseError: js.UndefOr[js.Function] = js.undefined
}

object IActionOpts {
  @scala.inline
  def apply(
    adapter: String = null,
    pathname: String = null,
    request: js.Function = null,
    response: js.Function = null,
    responseError: js.Function = null
  ): IActionOpts = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (responseError != null) __obj.updateDynamic("responseError")(responseError.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionOpts]
  }
}

