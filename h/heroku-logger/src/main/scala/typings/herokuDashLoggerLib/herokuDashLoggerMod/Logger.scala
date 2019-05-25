package typings
package herokuDashLoggerLib.herokuDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("heroku-logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(config: LoggerConfig) = this()
  def debug(message: java.lang.String): scala.Unit = js.native
  def debug(message: java.lang.String, data: js.Object): scala.Unit = js.native
  def error(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String, data: js.Object): scala.Unit = js.native
  def fatal(message: java.lang.String): scala.Unit = js.native
  def fatal(message: java.lang.String, data: js.Object): scala.Unit = js.native
  def info(message: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String, data: js.Object): scala.Unit = js.native
  def trace(message: java.lang.String): scala.Unit = js.native
  def trace(message: java.lang.String, data: js.Object): scala.Unit = js.native
  def warn(message: java.lang.String): scala.Unit = js.native
  def warn(message: java.lang.String, data: js.Object): scala.Unit = js.native
}

