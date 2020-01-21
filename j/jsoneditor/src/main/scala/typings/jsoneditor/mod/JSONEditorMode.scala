package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsoneditor.jsoneditorStrings.tree
  - typings.jsoneditor.jsoneditorStrings.view
  - typings.jsoneditor.jsoneditorStrings.form
  - typings.jsoneditor.jsoneditorStrings.code
  - typings.jsoneditor.jsoneditorStrings.text
*/
trait JSONEditorMode extends js.Object

object JSONEditorMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.jsoneditor.jsoneditorStrings.code = this.cast("code")
  @scala.inline
  def form: typings.jsoneditor.jsoneditorStrings.form = this.cast("form")
  @scala.inline
  def text: typings.jsoneditor.jsoneditorStrings.text = this.cast("text")
  @scala.inline
  def tree: typings.jsoneditor.jsoneditorStrings.tree = this.cast("tree")
  @scala.inline
  def view: typings.jsoneditor.jsoneditorStrings.view = this.cast("view")
}

