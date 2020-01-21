package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jest.jestStrings.log
  - typings.jest.jestStrings.info
  - typings.jest.jestStrings.warn
  - typings.jest.jestStrings.error
*/
trait LogType extends js.Object

object LogType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jest.jestStrings.error = this.cast("error")
  @scala.inline
  def info: typings.jest.jestStrings.info = this.cast("info")
  @scala.inline
  def log: typings.jest.jestStrings.log = this.cast("log")
  @scala.inline
  def warn: typings.jest.jestStrings.warn = this.cast("warn")
}

