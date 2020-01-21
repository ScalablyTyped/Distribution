package typings.logProcessErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log level
  */
/* Rewritten from type alias, can be one of: 
  - typings.logProcessErrors.logProcessErrorsStrings.debug
  - typings.logProcessErrors.logProcessErrorsStrings.info
  - typings.logProcessErrors.logProcessErrorsStrings.warn
  - typings.logProcessErrors.logProcessErrorsStrings.error
  - typings.logProcessErrors.logProcessErrorsStrings.silent
  - typings.logProcessErrors.logProcessErrorsStrings.default
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.logProcessErrors.logProcessErrorsStrings.debug = this.cast("debug")
  @scala.inline
  def default: typings.logProcessErrors.logProcessErrorsStrings.default = this.cast("default")
  @scala.inline
  def error: typings.logProcessErrors.logProcessErrorsStrings.error = this.cast("error")
  @scala.inline
  def info: typings.logProcessErrors.logProcessErrorsStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.logProcessErrors.logProcessErrorsStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typings.logProcessErrors.logProcessErrorsStrings.warn = this.cast("warn")
}

