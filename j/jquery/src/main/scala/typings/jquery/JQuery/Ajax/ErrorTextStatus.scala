package typings.jquery.JQuery.Ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jquery.jqueryStrings.timeout
  - typings.jquery.jqueryStrings.error
  - typings.jquery.jqueryStrings.abort
  - typings.jquery.jqueryStrings.parsererror
*/
trait ErrorTextStatus extends js.Object

object ErrorTextStatus {
  @scala.inline
  def abort: typings.jquery.jqueryStrings.abort = this.cast("abort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.jquery.jqueryStrings.error = this.cast("error")
  @scala.inline
  def parsererror: typings.jquery.jqueryStrings.parsererror = this.cast("parsererror")
  @scala.inline
  def timeout: typings.jquery.jqueryStrings.timeout = this.cast("timeout")
}

