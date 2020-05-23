package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeOptions extends js.Object {
  var autoSendLogs: js.UndefOr[Boolean] = js.undefined
  var autoUpdateConfig: js.UndefOr[Boolean] = js.undefined
  var capture: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[Filter] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
}

object NativeOptions {
  @scala.inline
  def apply(
    autoSendLogs: js.UndefOr[Boolean] = js.undefined,
    autoUpdateConfig: js.UndefOr[Boolean] = js.undefined,
    capture: js.UndefOr[Boolean] = js.undefined,
    filters: Filter = null,
    level: String = null,
    maxFileSize: js.UndefOr[Double] = js.undefined
  ): NativeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSendLogs)) __obj.updateDynamic("autoSendLogs")(autoSendLogs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateConfig)) __obj.updateDynamic("autoUpdateConfig")(autoUpdateConfig.get.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeOptions]
  }
}

