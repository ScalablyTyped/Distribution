package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapTableViewResultCell extends js.Object {
  /**
    * Returns the ordinal of this cell used to determine its position into the data cells' grid.
    */
  def cellOrdinal(): Double
  /**
    * Returns the formmated value to be displayed by the data cell.
    */
  def formattedValue(): String
  /**
    * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
    */
  def resultCellIndex(): Double
  /**
    * Returns the value provided by $.ig.Cell object.
    */
  def value(): js.Object
}

object OlapTableViewResultCell {
  @scala.inline
  def apply(
    cellOrdinal: () => Double,
    formattedValue: () => String,
    resultCellIndex: () => Double,
    value: () => js.Object
  ): OlapTableViewResultCell = {
    val __obj = js.Dynamic.literal(cellOrdinal = js.Any.fromFunction0(cellOrdinal), formattedValue = js.Any.fromFunction0(formattedValue), resultCellIndex = js.Any.fromFunction0(resultCellIndex), value = js.Any.fromFunction0(value))
    __obj.asInstanceOf[OlapTableViewResultCell]
  }
}

