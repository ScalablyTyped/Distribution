package typings
package luscaLib.luscaMod.luscaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cspOptions extends js.Object {
  var policy: js.UndefOr[java.lang.String | js.Object | (js.Array[js.Object | java.lang.String])] = js.undefined
  var reportOnly: js.UndefOr[scala.Boolean] = js.undefined
  var reportUri: js.UndefOr[java.lang.String] = js.undefined
  var scriptNonce: js.UndefOr[scala.Boolean] = js.undefined
  var styleNonce: js.UndefOr[scala.Boolean] = js.undefined
}

object cspOptions {
  @scala.inline
  def apply(
    policy: java.lang.String | js.Object | (js.Array[js.Object | java.lang.String]) = null,
    reportOnly: js.UndefOr[scala.Boolean] = js.undefined,
    reportUri: java.lang.String = null,
    scriptNonce: js.UndefOr[scala.Boolean] = js.undefined,
    styleNonce: js.UndefOr[scala.Boolean] = js.undefined
  ): cspOptions = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (!js.isUndefined(reportOnly)) __obj.updateDynamic("reportOnly")(reportOnly)
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri)
    if (!js.isUndefined(scriptNonce)) __obj.updateDynamic("scriptNonce")(scriptNonce)
    if (!js.isUndefined(styleNonce)) __obj.updateDynamic("styleNonce")(styleNonce)
    __obj.asInstanceOf[cspOptions]
  }
}

