package typings.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default cell type aliases the table has built-in.
  */
/* Rewritten from type alias, can be one of: 
  - typings.handsontable.handsontableStrings.autocomplete
  - typings.handsontable.handsontableStrings.checkbox
  - typings.handsontable.handsontableStrings.date
  - typings.handsontable.handsontableStrings.dropdown
  - typings.handsontable.handsontableStrings.handsontable
  - typings.handsontable.handsontableStrings.numeric
  - typings.handsontable.handsontableStrings.password
  - typings.handsontable.handsontableStrings.text
  - typings.handsontable.handsontableStrings.time
*/
trait CellType extends js.Object

object CellType {
  @scala.inline
  def autocomplete: typings.handsontable.handsontableStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.handsontable.handsontableStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def date: typings.handsontable.handsontableStrings.date = this.cast("date")
  @scala.inline
  def dropdown: typings.handsontable.handsontableStrings.dropdown = this.cast("dropdown")
  @scala.inline
  def handsontable: typings.handsontable.handsontableStrings.handsontable = this.cast("handsontable")
  @scala.inline
  def numeric: typings.handsontable.handsontableStrings.numeric = this.cast("numeric")
  @scala.inline
  def password: typings.handsontable.handsontableStrings.password = this.cast("password")
  @scala.inline
  def text: typings.handsontable.handsontableStrings.text = this.cast("text")
  @scala.inline
  def time: typings.handsontable.handsontableStrings.time = this.cast("time")
}

