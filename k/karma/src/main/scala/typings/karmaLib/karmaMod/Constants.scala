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
    val __obj = js.Dynamic.literal(COLOR_PATTERN = COLOR_PATTERN, CONSOLE_APPENDER = CONSOLE_APPENDER, DEFAULT_HOSTNAME = DEFAULT_HOSTNAME, DEFAULT_LISTEN_ADDR = DEFAULT_LISTEN_ADDR, DEFAULT_PORT = DEFAULT_PORT, EXIT_CODE = EXIT_CODE, LOG_DEBUG = LOG_DEBUG, LOG_DISABLE = LOG_DISABLE, LOG_ERROR = LOG_ERROR, LOG_INFO = LOG_INFO, LOG_LOG = LOG_LOG, LOG_PRIORITIES = LOG_PRIORITIES, LOG_WARN = LOG_WARN, NO_COLOR_PATTERN = NO_COLOR_PATTERN, VERSION = VERSION)
  
    __obj.asInstanceOf[Constants]
  }
}

