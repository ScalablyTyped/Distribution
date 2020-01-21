package typings.handsontable.mod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default renderer aliases the table has built-in.
  */
/* Rewritten from type alias, can be one of: 
  - typings.handsontable.handsontableStrings.autocomplete
  - typings.handsontable.handsontableStrings.checkbox
  - typings.handsontable.handsontableStrings.html
  - typings.handsontable.handsontableStrings.numeric
  - typings.handsontable.handsontableStrings.password
  - typings.handsontable.handsontableStrings.text
*/
trait RendererType extends js.Object

object RendererType {
  @scala.inline
  def autocomplete: typings.handsontable.handsontableStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.handsontable.handsontableStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def html: typings.handsontable.handsontableStrings.html = this.cast("html")
  @scala.inline
  def numeric: typings.handsontable.handsontableStrings.numeric = this.cast("numeric")
  @scala.inline
  def password: typings.handsontable.handsontableStrings.password = this.cast("password")
  @scala.inline
  def text: typings.handsontable.handsontableStrings.text = this.cast("text")
}

