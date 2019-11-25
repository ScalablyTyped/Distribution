package typings.handsontable.handsontableMod.Handsontable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default validator aliases the table has built-in.
  */
/* Rewritten from type alias, can be one of: 
  - typings.handsontable.handsontableStrings.autocomplete
  - typings.handsontable.handsontableStrings.date
  - typings.handsontable.handsontableStrings.numeric
  - typings.handsontable.handsontableStrings.time
*/
trait ValidatorType extends js.Object

object ValidatorType {
  @scala.inline
  def autocomplete: typings.handsontable.handsontableStrings.autocomplete = this.cast("autocomplete")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.handsontable.handsontableStrings.date = this.cast("date")
  @scala.inline
  def numeric: typings.handsontable.handsontableStrings.numeric = this.cast("numeric")
  @scala.inline
  def time: typings.handsontable.handsontableStrings.time = this.cast("time")
}

