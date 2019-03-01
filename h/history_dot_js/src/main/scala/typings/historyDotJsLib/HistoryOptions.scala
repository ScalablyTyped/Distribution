package typings
package historyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryOptions extends js.Object {
  var busyDelay: js.UndefOr[scala.Double] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var delayInit: js.UndefOr[scala.Double] = js.undefined
  var disableSuid: js.UndefOr[scala.Boolean] = js.undefined
  var doubleCheckInterval: js.UndefOr[scala.Double] = js.undefined
  var hashChangeInterval: js.UndefOr[scala.Double] = js.undefined
  var html4Mode: js.UndefOr[scala.Boolean] = js.undefined
  var initialTitle: js.UndefOr[java.lang.String] = js.undefined
  var safariPollInterval: js.UndefOr[scala.Double] = js.undefined
  var storeInterval: js.UndefOr[scala.Double] = js.undefined
}

object HistoryOptions {
  @scala.inline
  def apply(
    busyDelay: scala.Int | scala.Double = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    delayInit: scala.Int | scala.Double = null,
    disableSuid: js.UndefOr[scala.Boolean] = js.undefined,
    doubleCheckInterval: scala.Int | scala.Double = null,
    hashChangeInterval: scala.Int | scala.Double = null,
    html4Mode: js.UndefOr[scala.Boolean] = js.undefined,
    initialTitle: java.lang.String = null,
    safariPollInterval: scala.Int | scala.Double = null,
    storeInterval: scala.Int | scala.Double = null
  ): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (busyDelay != null) __obj.updateDynamic("busyDelay")(busyDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (delayInit != null) __obj.updateDynamic("delayInit")(delayInit.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSuid)) __obj.updateDynamic("disableSuid")(disableSuid)
    if (doubleCheckInterval != null) __obj.updateDynamic("doubleCheckInterval")(doubleCheckInterval.asInstanceOf[js.Any])
    if (hashChangeInterval != null) __obj.updateDynamic("hashChangeInterval")(hashChangeInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(html4Mode)) __obj.updateDynamic("html4Mode")(html4Mode)
    if (initialTitle != null) __obj.updateDynamic("initialTitle")(initialTitle)
    if (safariPollInterval != null) __obj.updateDynamic("safariPollInterval")(safariPollInterval.asInstanceOf[js.Any])
    if (storeInterval != null) __obj.updateDynamic("storeInterval")(storeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryOptions]
  }
}

