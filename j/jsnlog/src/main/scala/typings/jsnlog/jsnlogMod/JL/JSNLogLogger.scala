package typings.jsnlog.jsnlogMod.JL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSNLogLogger extends js.Object {
  def debug(logObject: js.Any): JSNLogLogger = js.native
  def error(logObject: js.Any): JSNLogLogger = js.native
  def fatal(logObject: js.Any): JSNLogLogger = js.native
  def fatalException(logObject: js.Any, e: js.Any): JSNLogLogger = js.native
  def info(logObject: js.Any): JSNLogLogger = js.native
  def log(level: Double, logObject: js.Any): JSNLogLogger = js.native
  def log(level: Double, logObject: js.Any, e: js.Any): JSNLogLogger = js.native
  def setOptions(options: JSNLogLoggerOptions): JSNLogLogger = js.native
  def trace(logObject: js.Any): JSNLogLogger = js.native
  def warn(logObject: js.Any): JSNLogLogger = js.native
}

