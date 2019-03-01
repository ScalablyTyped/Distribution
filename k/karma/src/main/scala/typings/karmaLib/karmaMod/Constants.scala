package typings
package karmaLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var COLOR_PATTERN: java.lang.String
  var CONSOLE_APPENDER: karmaLib.Anon_Layout
  var DEFAULT_HOSTNAME: java.lang.String
  var DEFAULT_LISTEN_ADDR: java.lang.String
  var DEFAULT_PORT: scala.Double
  var EXIT_CODE: java.lang.String
  var LOG_DEBUG: java.lang.String
  var LOG_DISABLE: java.lang.String
  var LOG_ERROR: java.lang.String
  var LOG_INFO: java.lang.String
  var LOG_LOG: java.lang.String
  var LOG_PRIORITIES: js.Array[java.lang.String]
  var LOG_WARN: java.lang.String
  var NO_COLOR_PATTERN: java.lang.String
  var VERSION: java.lang.String
}

object Constants {
  @scala.inline
  def apply(
    COLOR_PATTERN: java.lang.String,
    CONSOLE_APPENDER: karmaLib.Anon_Layout,
    DEFAULT_HOSTNAME: java.lang.String,
    DEFAULT_LISTEN_ADDR: java.lang.String,
    DEFAULT_PORT: scala.Double,
    EXIT_CODE: java.lang.String,
    LOG_DEBUG: java.lang.String,
    LOG_DISABLE: java.lang.String,
    LOG_ERROR: java.lang.String,
    LOG_INFO: java.lang.String,
    LOG_LOG: java.lang.String,
    LOG_PRIORITIES: js.Array[java.lang.String],
    LOG_WARN: java.lang.String,
    NO_COLOR_PATTERN: java.lang.String,
    VERSION: java.lang.String
  ): Constants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COLOR_PATTERN")(COLOR_PATTERN)
    __obj.updateDynamic("CONSOLE_APPENDER")(CONSOLE_APPENDER)
    __obj.updateDynamic("DEFAULT_HOSTNAME")(DEFAULT_HOSTNAME)
    __obj.updateDynamic("DEFAULT_LISTEN_ADDR")(DEFAULT_LISTEN_ADDR)
    __obj.updateDynamic("DEFAULT_PORT")(DEFAULT_PORT)
    __obj.updateDynamic("EXIT_CODE")(EXIT_CODE)
    __obj.updateDynamic("LOG_DEBUG")(LOG_DEBUG)
    __obj.updateDynamic("LOG_DISABLE")(LOG_DISABLE)
    __obj.updateDynamic("LOG_ERROR")(LOG_ERROR)
    __obj.updateDynamic("LOG_INFO")(LOG_INFO)
    __obj.updateDynamic("LOG_LOG")(LOG_LOG)
    __obj.updateDynamic("LOG_PRIORITIES")(LOG_PRIORITIES)
    __obj.updateDynamic("LOG_WARN")(LOG_WARN)
    __obj.updateDynamic("NO_COLOR_PATTERN")(NO_COLOR_PATTERN)
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.asInstanceOf[Constants]
  }
}

