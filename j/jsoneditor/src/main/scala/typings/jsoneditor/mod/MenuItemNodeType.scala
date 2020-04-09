package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.single
  - typings.jsoneditor.jsoneditorStrings.append
*/
trait MenuItemNodeType extends js.Object

object MenuItemNodeType {
  @scala.inline
  def append: typings.jsoneditor.jsoneditorStrings.append = this.cast("append")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def single: typings.jsoneditor.jsoneditorStrings.single = this.cast("single")
}

