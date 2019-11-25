package typings.karma.karmaMod

import org.scalablytyped.runtime.TopLevel
import typings.karma.Anon_Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var COLOR_PATTERN: String
  var CONSOLE_APPENDER: Anon_Layout
  var DEFAULT_HOSTNAME: String
  var DEFAULT_LISTEN_ADDR: String
  var DEFAULT_PORT: Double
  var EXIT_CODE: String
  var LOG_DEBUG: String
  var LOG_DISABLE: String
  var LOG_ERROR: String
  var LOG_INFO: String
  var LOG_LOG: String
  var LOG_PRIORITIES: js.Array[String]
  var LOG_WARN: String
  var NO_COLOR_PATTERN: String
  var VERSION: String
}

object Constants {
  @scala.inline
  def apply(
    COLOR_PATTERN: String,
    CONSOLE_APPENDER: Anon_Layout,
    DEFAULT_HOSTNAME: String,
    DEFAULT_LISTEN_ADDR: String,
    DEFAULT_PORT: Double,
    EXIT_CODE: String,
    LOG_DEBUG: String,
    LOG_DISABLE: String,
    LOG_ERROR: String,
    LOG_INFO: String,
    LOG_LOG: String,
    LOG_PRIORITIES: js.Array[String],
    LOG_WARN: String,
    NO_COLOR_PATTERN: String,
    VERSION: String
  ): Constants = {
    val __obj = js.Dynamic.literal(COLOR_PATTERN = COLOR_PATTERN.asInstanceOf[js.Any], CONSOLE_APPENDER = CONSOLE_APPENDER.asInstanceOf[js.Any], DEFAULT_HOSTNAME = DEFAULT_HOSTNAME.asInstanceOf[js.Any], DEFAULT_LISTEN_ADDR = DEFAULT_LISTEN_ADDR.asInstanceOf[js.Any], DEFAULT_PORT = DEFAULT_PORT.asInstanceOf[js.Any], EXIT_CODE = EXIT_CODE.asInstanceOf[js.Any], LOG_DEBUG = LOG_DEBUG.asInstanceOf[js.Any], LOG_DISABLE = LOG_DISABLE.asInstanceOf[js.Any], LOG_ERROR = LOG_ERROR.asInstanceOf[js.Any], LOG_INFO = LOG_INFO.asInstanceOf[js.Any], LOG_LOG = LOG_LOG.asInstanceOf[js.Any], LOG_PRIORITIES = LOG_PRIORITIES.asInstanceOf[js.Any], LOG_WARN = LOG_WARN.asInstanceOf[js.Any], NO_COLOR_PATTERN = NO_COLOR_PATTERN.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants]
  }
}

@JSImport("karma", "constants")
@js.native
object constants extends TopLevel[Constants]

