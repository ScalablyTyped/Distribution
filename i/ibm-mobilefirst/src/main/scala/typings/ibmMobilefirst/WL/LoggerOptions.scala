package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  var autoSendLogs: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  var callback: js.UndefOr[LoggerCallback] = js.undefined
  var capture: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[Filter] = js.undefined
  var level: js.UndefOr[js.Array[String] | String | Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var pkg: js.UndefOr[String] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var stacktrace: js.UndefOr[Boolean] = js.undefined
  var stringify: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[Tag] = js.undefined
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    autoSendLogs: js.UndefOr[Boolean] = js.undefined,
    blacklist: js.Array[String] = null,
    callback: (/* message */ String | js.Array[String], /* level */ String, /* package */ String) => Unit = null,
    capture: js.UndefOr[Boolean] = js.undefined,
    filters: Filter = null,
    level: js.Array[String] | String | Double = null,
    maxFileSize: js.UndefOr[Double] = js.undefined,
    pkg: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    stacktrace: js.UndefOr[Boolean] = js.undefined,
    stringify: js.UndefOr[Boolean] = js.undefined,
    tag: Tag = null,
    whitelist: js.Array[String] = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSendLogs)) __obj.updateDynamic("autoSendLogs")(autoSendLogs.get.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFileSize)) __obj.updateDynamic("maxFileSize")(maxFileSize.get.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stacktrace)) __obj.updateDynamic("stacktrace")(stacktrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

