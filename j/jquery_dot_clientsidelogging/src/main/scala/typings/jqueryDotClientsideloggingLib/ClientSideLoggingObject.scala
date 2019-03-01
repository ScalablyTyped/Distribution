package typings
package jqueryDotClientsideloggingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSideLoggingObject extends js.Object {
  		// The variable to send the log message through as.
  var client_info: js.UndefOr[ClientSideLoggingClientInfoObject] = js.undefined
  var error_url: js.UndefOr[java.lang.String] = js.undefined
  	// Whether or not to send native js errors as well (using window.onerror).
  var hijack_console: js.UndefOr[scala.Boolean] = js.undefined
  		// The url to which errors logs are sent
  var info_url: js.UndefOr[java.lang.String] = js.undefined
  		// The url to which standard logs are sent
  var log_level: js.UndefOr[scala.Double] = js.undefined
  		// The url to which info logs are sent
  var log_url: js.UndefOr[java.lang.String] = js.undefined
  		// The level at which to log. This allows you to keep the calls to the logging in your code and just change this variable to log varying degrees. 1 = only error, 2 = error & log, 3 = error, log & info
  var native_error: js.UndefOr[scala.Boolean] = js.undefined
  	// Hijacks the default console functionality (ie: all your console.error/info/log are belong to us).
  var query_var: js.UndefOr[java.lang.String] = js.undefined
}

object ClientSideLoggingObject {
  @scala.inline
  def apply(
    client_info: ClientSideLoggingClientInfoObject = null,
    error_url: java.lang.String = null,
    hijack_console: js.UndefOr[scala.Boolean] = js.undefined,
    info_url: java.lang.String = null,
    log_level: scala.Int | scala.Double = null,
    log_url: java.lang.String = null,
    native_error: js.UndefOr[scala.Boolean] = js.undefined,
    query_var: java.lang.String = null
  ): ClientSideLoggingObject = {
    val __obj = js.Dynamic.literal()
    if (client_info != null) __obj.updateDynamic("client_info")(client_info)
    if (error_url != null) __obj.updateDynamic("error_url")(error_url)
    if (!js.isUndefined(hijack_console)) __obj.updateDynamic("hijack_console")(hijack_console)
    if (info_url != null) __obj.updateDynamic("info_url")(info_url)
    if (log_level != null) __obj.updateDynamic("log_level")(log_level.asInstanceOf[js.Any])
    if (log_url != null) __obj.updateDynamic("log_url")(log_url)
    if (!js.isUndefined(native_error)) __obj.updateDynamic("native_error")(native_error)
    if (query_var != null) __obj.updateDynamic("query_var")(query_var)
    __obj.asInstanceOf[ClientSideLoggingObject]
  }
}

