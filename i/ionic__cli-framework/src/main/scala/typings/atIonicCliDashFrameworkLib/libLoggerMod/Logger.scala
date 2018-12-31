package typings
package atIonicCliDashFrameworkLib.libLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(hasLevelHandlers: LoggerOptions) = this()
  var handlers: nodeLib.Set[LoggerHandler] = js.native
  var level: LoggerLevelWeight = js.native
  def clone(opts: stdLib.Partial[LoggerOptions]): Logger = js.native
  def createRecord(msg: java.lang.String): LogRecord = js.native
  def createRecord(msg: java.lang.String, level: LoggerLevelWeight): LogRecord = js.native
  def createRecord(msg: java.lang.String, level: LoggerLevelWeight, format: scala.Boolean): LogRecord = js.native
  def createWriteStream(): nodeLib.NodeJSNs.WritableStream = js.native
  def createWriteStream(level: LoggerLevelWeight): nodeLib.NodeJSNs.WritableStream = js.native
  def createWriteStream(level: LoggerLevelWeight, format: scala.Boolean): nodeLib.NodeJSNs.WritableStream = js.native
  /**
    * Log a message using the `debug` logger level.
    *
    * @param msg The string to log.
    */
  def debug(msg: java.lang.String): scala.Unit = js.native
  /**
    * Log a message using the `error` logger level.
    *
    * @param msg The string to log.
    */
  def error(msg: java.lang.String): scala.Unit = js.native
  /**
    * Log a message using the `info` logger level.
    *
    * @param msg The string to log.
    */
  def info(msg: java.lang.String): scala.Unit = js.native
  /**
    * Log a record using a logger output found via `level`.
    */
  def log(record: LogRecord): scala.Unit = js.native
  /**
    * Log a message as-is.
    *
    * @param msg The string to log.
    */
  def msg(msg: java.lang.String): scala.Unit = js.native
  /**
    * Log newlines using a logger output found via `level`.
    *
    * @param num The number of newlines to log.
    * @param level The logger level. If omitted, the default output is used.
    */
  def nl(): scala.Unit = js.native
  def nl(num: scala.Double): scala.Unit = js.native
  def nl(num: scala.Double, level: LoggerLevelWeight): scala.Unit = js.native
  /**
    * Log a message using the `warn` logger level.
    *
    * @param msg The string to log.
    */
  def warn(msg: java.lang.String): scala.Unit = js.native
}

@JSImport("@ionic/cli-framework/lib/logger", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: nodeLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler]): nodeLib.Set[atIonicCliDashFrameworkLib.libLoggerMod.LoggerHandler] = js.native
}

