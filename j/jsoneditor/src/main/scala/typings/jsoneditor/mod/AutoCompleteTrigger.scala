package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.keydown
  - typings.jsoneditor.jsoneditorStrings.focus
*/
trait AutoCompleteTrigger extends js.Object

object AutoCompleteTrigger {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def focus: typings.jsoneditor.jsoneditorStrings.focus = this.cast("focus")
  @scala.inline
  def keydown: typings.jsoneditor.jsoneditorStrings.keydown = this.cast("keydown")
}

