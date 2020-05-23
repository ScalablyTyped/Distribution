package typings.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  /** Verbosity of the log output */
  var level: LogLevel
  /** log message with debug level */
  def debug(message: String): Unit
  /** log message with error severity */
  def error(message: String): Unit
  /** log message with info level (default output level for all adapters) */
  def info(message: String): Unit
  /** log message with silly level */
  def silly(message: String): Unit
  /** log message with warning severity */
  def warn(message: String): Unit
}

object Logger {
  @scala.inline
  def apply(
    debug: String => Unit,
    error: String => Unit,
    info: String => Unit,
    level: LogLevel,
    silly: String => Unit,
    warn: String => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), level = level.asInstanceOf[js.Any], silly = js.Any.fromFunction1(silly), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
}

