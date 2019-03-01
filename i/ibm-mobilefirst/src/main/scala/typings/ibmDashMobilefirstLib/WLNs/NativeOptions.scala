package typings
package ibmDashMobilefirstLib.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeOptions extends js.Object {
  var autoSendLogs: js.UndefOr[scala.Boolean] = js.undefined
  var autoUpdateConfig: js.UndefOr[scala.Boolean] = js.undefined
  var capture: js.UndefOr[scala.Boolean] = js.undefined
  var filters: js.UndefOr[Filter] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
}

object NativeOptions {
  @scala.inline
  def apply(
    autoSendLogs: js.UndefOr[scala.Boolean] = js.undefined,
    autoUpdateConfig: js.UndefOr[scala.Boolean] = js.undefined,
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    filters: Filter = null,
    level: java.lang.String = null,
    maxFileSize: scala.Int | scala.Double = null
  ): NativeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSendLogs)) __obj.updateDynamic("autoSendLogs")(autoSendLogs)
    if (!js.isUndefined(autoUpdateConfig)) __obj.updateDynamic("autoUpdateConfig")(autoUpdateConfig)
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (level != null) __obj.updateDynamic("level")(level)
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeOptions]
  }
}

