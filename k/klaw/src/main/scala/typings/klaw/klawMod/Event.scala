package typings.klaw.klawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.klaw.klawStrings.close
  - typings.klaw.klawStrings.data
  - typings.klaw.klawStrings.end
  - typings.klaw.klawStrings.readable
  - typings.klaw.klawStrings.error
*/
trait Event extends js.Object

object Event {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typings.klaw.klawStrings.close = this.cast("close")
  @scala.inline
  def data: typings.klaw.klawStrings.data = this.cast("data")
  @scala.inline
  def end: typings.klaw.klawStrings.end = this.cast("end")
  @scala.inline
  def error: typings.klaw.klawStrings.error = this.cast("error")
  @scala.inline
  def readable: typings.klaw.klawStrings.readable = this.cast("readable")
}

