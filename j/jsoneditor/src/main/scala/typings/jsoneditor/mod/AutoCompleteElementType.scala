package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.field
  - typings.jsoneditor.jsoneditorStrings.value
*/
trait AutoCompleteElementType extends js.Object

object AutoCompleteElementType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def field: typings.jsoneditor.jsoneditorStrings.field = this.cast("field")
  @scala.inline
  def value: typings.jsoneditor.jsoneditorStrings.value = this.cast("value")
}

