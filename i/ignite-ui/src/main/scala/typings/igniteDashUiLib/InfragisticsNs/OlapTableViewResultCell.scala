package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.OlapTableViewResultCell")
@js.native
class OlapTableViewResultCell () extends js.Object {
  /**
  	 * Returns the ordinal of this cell used to determine its position into the data cells' grid.
  	 */
  def cellOrdinal(): scala.Double = js.native
  /**
  	 * Returns the formmated value to be displayed by the data cell.
  	 */
  def formattedValue(): java.lang.String = js.native
  /**
  	 * Returns the index of $.ig.Cell object in $.ig.OlapResult object.
  	 */
  def resultCellIndex(): scala.Double = js.native
  /**
  	 * Returns the value provided by $.ig.Cell object.
  	 */
  def value(): js.Object = js.native
}

