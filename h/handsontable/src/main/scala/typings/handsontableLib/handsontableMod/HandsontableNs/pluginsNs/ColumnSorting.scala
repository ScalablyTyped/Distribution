package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnSorting extends Base {
  def clearSort(): scala.Unit = js.native
  def getSortConfig(): scala.Unit | ColumnSortConfig | js.Array[ColumnSortConfig] = js.native
  def getSortConfig(column: scala.Double): scala.Unit | ColumnSortConfig | js.Array[ColumnSortConfig] = js.native
  def isSorted(): scala.Boolean = js.native
  def setSortConfigs(sortConfigs: js.Array[ColumnSortConfig]): scala.Unit = js.native
  def sort(): scala.Unit = js.native
  def sort(sortConfig: ColumnSortConfig): scala.Unit = js.native
}

