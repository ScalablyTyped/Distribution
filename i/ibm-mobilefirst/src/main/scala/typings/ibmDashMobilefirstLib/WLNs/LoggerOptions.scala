package typings
package ibmDashMobilefirstLib.WLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  var autoSendLogs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var callback: js.UndefOr[LoggerCallback] = js.undefined
  var capture: js.UndefOr[scala.Boolean] = js.undefined
  var filters: js.UndefOr[Filter] = js.undefined
  var level: js.UndefOr[js.Array[java.lang.String] | java.lang.String | scala.Double] = js.undefined
  var maxFileSize: js.UndefOr[scala.Double] = js.undefined
  var pkg: js.UndefOr[java.lang.String] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var stacktrace: js.UndefOr[scala.Boolean] = js.undefined
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[Tag] = js.undefined
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    autoSendLogs: js.UndefOr[scala.Boolean] = js.undefined,
    blacklist: js.Array[java.lang.String] = null,
    callback: LoggerCallback = null,
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    filters: Filter = null,
    level: js.Array[java.lang.String] | java.lang.String | scala.Double = null,
    maxFileSize: scala.Int | scala.Double = null,
    pkg: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    stacktrace: js.UndefOr[scala.Boolean] = js.undefined,
    stringify: js.UndefOr[scala.Boolean] = js.undefined,
    tag: Tag = null,
    whitelist: js.Array[java.lang.String] = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSendLogs)) __obj.updateDynamic("autoSendLogs")(autoSendLogs)
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(stacktrace)) __obj.updateDynamic("stacktrace")(stacktrace)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist)
    __obj.asInstanceOf[LoggerOptions]
  }
}

