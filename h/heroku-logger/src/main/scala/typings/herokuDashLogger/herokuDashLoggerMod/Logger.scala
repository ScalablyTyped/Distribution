package typings.herokuDashLogger.herokuDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heroku-logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(config: LoggerConfig) = this()
  def debug(message: String): Unit = js.native
  def debug(message: String, data: js.Object): Unit = js.native
  def error(message: String): Unit = js.native
  def error(message: String, data: js.Object): Unit = js.native
  def fatal(message: String): Unit = js.native
  def fatal(message: String, data: js.Object): Unit = js.native
  def info(message: String): Unit = js.native
  def info(message: String, data: js.Object): Unit = js.native
  def trace(message: String): Unit = js.native
  def trace(message: String, data: js.Object): Unit = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, data: js.Object): Unit = js.native
}

