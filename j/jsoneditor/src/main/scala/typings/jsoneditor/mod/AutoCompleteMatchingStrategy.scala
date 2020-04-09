package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.start
  - typings.jsoneditor.jsoneditorStrings.contain
*/
trait AutoCompleteMatchingStrategy extends js.Object

object AutoCompleteMatchingStrategy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contain: typings.jsoneditor.jsoneditorStrings.contain = this.cast("contain")
  @scala.inline
  def start: typings.jsoneditor.jsoneditorStrings.start = this.cast("start")
}

