package typings.historyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryOptions extends js.Object {
  var busyDelay: js.UndefOr[Double] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var delayInit: js.UndefOr[Double] = js.undefined
  var disableSuid: js.UndefOr[Boolean] = js.undefined
  var doubleCheckInterval: js.UndefOr[Double] = js.undefined
  var hashChangeInterval: js.UndefOr[Double] = js.undefined
  var html4Mode: js.UndefOr[Boolean] = js.undefined
  var initialTitle: js.UndefOr[String] = js.undefined
  var safariPollInterval: js.UndefOr[Double] = js.undefined
  var storeInterval: js.UndefOr[Double] = js.undefined
}

object HistoryOptions {
  @scala.inline
  def apply(
    busyDelay: Int | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayInit: Int | Double = null,
    disableSuid: js.UndefOr[Boolean] = js.undefined,
    doubleCheckInterval: Int | Double = null,
    hashChangeInterval: Int | Double = null,
    html4Mode: js.UndefOr[Boolean] = js.undefined,
    initialTitle: String = null,
    safariPollInterval: Int | Double = null,
    storeInterval: Int | Double = null
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

