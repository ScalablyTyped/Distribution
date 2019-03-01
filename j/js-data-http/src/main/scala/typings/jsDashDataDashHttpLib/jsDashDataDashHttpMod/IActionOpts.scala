package typings
package jsDashDataDashHttpLib.jsDashDataDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionOpts extends js.Object {
  var adapter: js.UndefOr[java.lang.String] = js.undefined
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  var request: js.UndefOr[js.Function] = js.undefined
  var response: js.UndefOr[js.Function] = js.undefined
  var responseError: js.UndefOr[js.Function] = js.undefined
}

object IActionOpts {
  @scala.inline
  def apply(
    adapter: java.lang.String = null,
    pathname: java.lang.String = null,
    request: js.Function = null,
    response: js.Function = null,
    responseError: js.Function = null
  ): IActionOpts = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (request != null) __obj.updateDynamic("request")(request)
    if (response != null) __obj.updateDynamic("response")(response)
    if (responseError != null) __obj.updateDynamic("responseError")(responseError)
    __obj.asInstanceOf[IActionOpts]
  }
}

