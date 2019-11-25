package typings.logDashProcessDashErrors.logDashProcessDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log level
  */
/* Rewritten from type alias, can be one of: 
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.debug
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.info
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.warn
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.error
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.silent
  - typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.default
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.debug = this.cast("debug")
  @scala.inline
  def default: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.default = this.cast("default")
  @scala.inline
  def error: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.error = this.cast("error")
  @scala.inline
  def info: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typings.logDashProcessDashErrors.logDashProcessDashErrorsStrings.warn = this.cast("warn")
}

