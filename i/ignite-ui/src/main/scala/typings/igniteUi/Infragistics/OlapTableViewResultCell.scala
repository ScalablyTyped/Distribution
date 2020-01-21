package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.OlapTableViewResultCell")
@js.native
class OlapTableViewResultCell () extends js.Object {
  /**
  	 * Returns the ordinal of this cell used to determine its position into the data cells' grid.
  	 */
  def cellOrdinal(): Double = js.native
  /**
  	 * Returns the formmated value to be displayed by the data cell.
  	 */
  def formattedValue(): String = js.native
  /**
  	 * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
  	 */
  def resultCellIndex(): Double = js.native
  /**
  	 * Returns the value provided by $.ig.Cell object.
  	 */
  def value(): js.Object = js.native
}

