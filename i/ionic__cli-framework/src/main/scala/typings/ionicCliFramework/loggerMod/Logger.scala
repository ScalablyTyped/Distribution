package typings.ionicCliFramework.loggerMod

import typings.ionicCliFramework.PartialLoggerOptions
import typings.node.NodeJS.WritableStream
import typings.std.ReadonlySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(hasLevelHandlers: LoggerOptions) = this()
  var handlers: Set[LoggerHandler] = js.native
  var level: LoggerLevelWeight = js.native
  def clone(opts: PartialLoggerOptions): Logger = js.native
  def createRecord(msg: String): LogRecord = js.native
  def createRecord(msg: String, level: LoggerLevelWeight): LogRecord = js.native
  def createRecord(msg: String, level: LoggerLevelWeight, format: Boolean): LogRecord = js.native
  def createWriteStream(): WritableStream = js.native
  def createWriteStream(level: LoggerLevelWeight): WritableStream = js.native
  def createWriteStream(level: LoggerLevelWeight, format: Boolean): WritableStream = js.native
  /**
    * Log a message using the `debug` logger level.
    *
    * @param msg The string to log.
    */
  def debug(msg: String): Unit = js.native
  /**
    * Log a message using the `error` logger level.
    *
    * @param msg The string to log.
    */
  def error(msg: String): Unit = js.native
  /**
    * Log a message using the `info` logger level.
    *
    * @param msg The string to log.
    */
  def info(msg: String): Unit = js.native
  /**
    * Log a record using a logger output found via `level`.
    */
  def log(record: LogRecord): Unit = js.native
  /**
    * Log a message as-is.
    *
    * @param msg The string to log.
    */
  def msg(msg: String): Unit = js.native
  /**
    * Log newlines using a logger output found via `level`.
    *
    * @param num The number of newlines to log.
    * @param level The logger level. If omitted, the default output is used.
    */
  def nl(): Unit = js.native
  def nl(num: Double): Unit = js.native
  def nl(num: Double, level: LoggerLevelWeight): Unit = js.native
  /**
    * Log a message using the `warn` logger level.
    *
    * @param msg The string to log.
    */
  def warn(msg: String): Unit = js.native
}

/* static members */
@JSImport("@ionic/cli-framework/lib/logger", "Logger")
@js.native
object Logger extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

