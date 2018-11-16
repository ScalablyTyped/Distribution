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

