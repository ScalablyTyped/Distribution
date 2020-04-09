package typings.hoxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hoxy.hoxyStrings.error
  - typings.hoxy.hoxyStrings.warn
  - typings.hoxy.hoxyStrings.info
  - typings.hoxy.hoxyStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.hoxy.hoxyStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.hoxy.hoxyStrings.error = this.cast("error")
  @scala.inline
  def info: typings.hoxy.hoxyStrings.info = this.cast("info")
  @scala.inline
  def warn: typings.hoxy.hoxyStrings.warn = this.cast("warn")
}

