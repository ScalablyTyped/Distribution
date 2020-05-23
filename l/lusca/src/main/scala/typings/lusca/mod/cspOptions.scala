package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cspOptions extends js.Object {
  var policy: js.UndefOr[String | js.Object | (js.Array[js.Object | String])] = js.undefined
  var reportOnly: js.UndefOr[Boolean] = js.undefined
  var reportUri: js.UndefOr[String] = js.undefined
  var scriptNonce: js.UndefOr[Boolean] = js.undefined
  var styleNonce: js.UndefOr[Boolean] = js.undefined
}

object cspOptions {
  @scala.inline
  def apply(
    policy: String | js.Object | (js.Array[js.Object | String]) = null,
    reportOnly: js.UndefOr[Boolean] = js.undefined,
    reportUri: String = null,
    scriptNonce: js.UndefOr[Boolean] = js.undefined,
    styleNonce: js.UndefOr[Boolean] = js.undefined
  ): cspOptions = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly.get.asInstanceOf[js.Any])
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri.asInstanceOf[js.Any])
    if (!js.isUndefined(scriptNonce)) __obj.updateDynamic("scriptNonce")(scriptNonce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(styleNonce)) __obj.updateDynamic("styleNonce")(styleNonce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[cspOptions]
  }
}

