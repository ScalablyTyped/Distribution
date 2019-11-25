package typings.logger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.logger.loggerStrings.fatal
  - typings.logger.loggerStrings.error
  - typings.logger.loggerStrings.warn
  - typings.logger.loggerStrings.info
  - typings.logger.loggerStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.logger.loggerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.logger.loggerStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.logger.loggerStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.logger.loggerStrings.info = this.cast("info")
  @scala.inline
  def warn: typings.logger.loggerStrings.warn = this.cast("warn")
}

