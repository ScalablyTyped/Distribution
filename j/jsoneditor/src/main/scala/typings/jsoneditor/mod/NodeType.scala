package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.`object`
  - typings.jsoneditor.jsoneditorStrings.array
  - typings.jsoneditor.jsoneditorStrings.string
  - typings.jsoneditor.jsoneditorStrings.auto
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def array: typings.jsoneditor.jsoneditorStrings.array = this.cast("array")
  @scala.inline
  def auto: typings.jsoneditor.jsoneditorStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `object`: typings.jsoneditor.jsoneditorStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.jsoneditor.jsoneditorStrings.string = this.cast("string")
}

