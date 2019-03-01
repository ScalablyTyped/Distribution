package typings
package jsforceLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteOptions extends js.Object {
  var autoFetch: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var maxFetch: js.UndefOr[scala.Double] = js.undefined
  var scanAll: js.UndefOr[scala.Boolean] = js.undefined
}

object ExecuteOptions {
  @scala.inline
  def apply(
    autoFetch: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Object = null,
    maxFetch: scala.Int | scala.Double = null,
    scanAll: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecuteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFetch)) __obj.updateDynamic("autoFetch")(autoFetch)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxFetch != null) __obj.updateDynamic("maxFetch")(maxFetch.asInstanceOf[js.Any])
    if (!js.isUndefined(scanAll)) __obj.updateDynamic("scanAll")(scanAll)
    __obj.asInstanceOf[ExecuteOptions]
  }
}

