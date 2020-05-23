package typings.historyJs

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
    busyDelay: js.UndefOr[Double] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    delayInit: js.UndefOr[Double] = js.undefined,
    disableSuid: js.UndefOr[Boolean] = js.undefined,
    doubleCheckInterval: js.UndefOr[Double] = js.undefined,
    hashChangeInterval: js.UndefOr[Double] = js.undefined,
    html4Mode: js.UndefOr[Boolean] = js.undefined,
    initialTitle: String = null,
    safariPollInterval: js.UndefOr[Double] = js.undefined,
    storeInterval: js.UndefOr[Double] = js.undefined
  ): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(busyDelay)) __obj.updateDynamic("busyDelay")(busyDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayInit)) __obj.updateDynamic("delayInit")(delayInit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSuid)) __obj.updateDynamic("disableSuid")(disableSuid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleCheckInterval)) __obj.updateDynamic("doubleCheckInterval")(doubleCheckInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hashChangeInterval)) __obj.updateDynamic("hashChangeInterval")(hashChangeInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(html4Mode)) __obj.updateDynamic("html4Mode")(html4Mode.get.asInstanceOf[js.Any])
    if (initialTitle != null) __obj.updateDynamic("initialTitle")(initialTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(safariPollInterval)) __obj.updateDynamic("safariPollInterval")(safariPollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storeInterval)) __obj.updateDynamic("storeInterval")(storeInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryOptions]
  }
}

