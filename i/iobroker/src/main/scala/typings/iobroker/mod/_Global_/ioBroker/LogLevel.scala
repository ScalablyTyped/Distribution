package typings.iobroker.mod._Global_.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.iobroker.iobrokerStrings.silly
  - typings.iobroker.iobrokerStrings.debug
  - typings.iobroker.iobrokerStrings.info
  - typings.iobroker.iobrokerStrings.warn
  - typings.iobroker.iobrokerStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.iobroker.iobrokerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.iobroker.iobrokerStrings.error = this.cast("error")
  @scala.inline
  def info: typings.iobroker.iobrokerStrings.info = this.cast("info")
  @scala.inline
  def silly: typings.iobroker.iobrokerStrings.silly = this.cast("silly")
  @scala.inline
  def warn: typings.iobroker.iobrokerStrings.warn = this.cast("warn")
}

