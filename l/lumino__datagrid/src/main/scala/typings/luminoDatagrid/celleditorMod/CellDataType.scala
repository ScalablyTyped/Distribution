package typings.luminoDatagrid.celleditorMod

import typings.luminoDatagrid.celleditorcontrollerMod._EditorOverrideIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.string
  - typings.luminoDatagrid.luminoDatagridStrings.number
  - typings.luminoDatagrid.luminoDatagridStrings.integer
  - typings.luminoDatagrid.luminoDatagridStrings.boolean
  - typings.luminoDatagrid.luminoDatagridStrings.date
  - typings.luminoDatagrid.luminoDatagridStrings.stringColonoption
  - typings.luminoDatagrid.luminoDatagridStrings.numberColonoption
  - typings.luminoDatagrid.luminoDatagridStrings.integerColonoption
  - typings.luminoDatagrid.luminoDatagridStrings.dateColonoption
  - typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option`
  - typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option`
  - typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option`
  - typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option`
*/
trait CellDataType extends _EditorOverrideIdentifier

object CellDataType {
  @scala.inline
  def boolean: typings.luminoDatagrid.luminoDatagridStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.luminoDatagrid.luminoDatagridStrings.date = this.cast("date")
  @scala.inline
  def `dateColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`dateColondynamic-option` = this.cast("date:dynamic-option")
  @scala.inline
  def dateColonoption: typings.luminoDatagrid.luminoDatagridStrings.dateColonoption = this.cast("date:option")
  @scala.inline
  def integer: typings.luminoDatagrid.luminoDatagridStrings.integer = this.cast("integer")
  @scala.inline
  def `integerColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`integerColondynamic-option` = this.cast("integer:dynamic-option")
  @scala.inline
  def integerColonoption: typings.luminoDatagrid.luminoDatagridStrings.integerColonoption = this.cast("integer:option")
  @scala.inline
  def number: typings.luminoDatagrid.luminoDatagridStrings.number = this.cast("number")
  @scala.inline
  def `numberColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`numberColondynamic-option` = this.cast("number:dynamic-option")
  @scala.inline
  def numberColonoption: typings.luminoDatagrid.luminoDatagridStrings.numberColonoption = this.cast("number:option")
  @scala.inline
  def string: typings.luminoDatagrid.luminoDatagridStrings.string = this.cast("string")
  @scala.inline
  def `stringColondynamic-option`: typings.luminoDatagrid.luminoDatagridStrings.`stringColondynamic-option` = this.cast("string:dynamic-option")
  @scala.inline
  def stringColonoption: typings.luminoDatagrid.luminoDatagridStrings.stringColonoption = this.cast("string:option")
}

