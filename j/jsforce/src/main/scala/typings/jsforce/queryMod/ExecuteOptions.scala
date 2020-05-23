package typings.jsforce.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteOptions extends js.Object {
  var autoFetch: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var maxFetch: js.UndefOr[Double] = js.undefined
  var scanAll: js.UndefOr[Boolean] = js.undefined
}

object ExecuteOptions {
  @scala.inline
  def apply(
    autoFetch: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    maxFetch: js.UndefOr[Double] = js.undefined,
    scanAll: js.UndefOr[Boolean] = js.undefined
  ): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFetch)) __obj.updateDynamic("autoFetch")(autoFetch.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFetch)) __obj.updateDynamic("maxFetch")(maxFetch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scanAll)) __obj.updateDynamic("scanAll")(scanAll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteOptions]
  }
}

